import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        bj();
    }
    public static void barajar(int[] array){
        Random rnd = new Random();
        int longitud = array.length;
        for (int i = 0; i< longitud;i++){
            int valorAle = i + rnd.nextInt(longitud-i);
            int temp = array[valorAle]; //Guarda el valor que esta en la posición valorAle en una variable temporal
            array[valorAle] = array[i]; // Copia el valor de la posición actual en la posición aleatoria(valorAle)
            array[i] = temp; //Copia el valor de temp en la posición actual.
        }
    }

    public static int calcularSuma(int[] cartas, int pos) {
        int suma = 0;
        int ases = 0;

        for (int i = 0; i < pos; i++) {
            suma += cartas[i];
            if (cartas[i] == 11) {
                ases++;
            }
        }
        // Si nos pasamos de 21 y tenemos Ases contados como 11, los convertimos en 1 (-10 por cada As)
        while (suma > 21 && ases > 0) {
            suma -= 10;
            ases--;
        }
        return suma;
    }
    public static int bj() {
        Scanner sc = new Scanner(System.in);
        int J = 10;
        int Q = 10;
        int K = 10;
        int A = 11;
        int sumaJ;
        int sumaC;
        int j = 0;
        int accionJ;
        boolean turnoJ = false;
        boolean turnoC = false;
        int ganar = 0; //perder = 1, ganar = 2, empatar = 3
        int[] cartasJ = new int[12];
        int[] cartasC = new int[12];
        int posCartasJ = 0;
        int posCartasC = 0;

        int[] baraja = {A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K,
                A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K,
                A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K,
                A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K,};
        barajar(baraja);

        TextoMod.imprimirConDelay("-------------",TextoMod.rojo, 0);
        TextoMod.imprimirConDelay("--Blackjack--",TextoMod.rojo, 0);
        TextoMod.imprimirConDelay("-------------",TextoMod.rojo, 0);

        TextoMod.imprimirConDelay("Obtuviste un: " + baraja[j],TextoMod.verde, 30);
        cartasJ[posCartasJ] = baraja[j];
        posCartasJ++;
        j++;

        TextoMod.imprimirConDelay("Obtuviste un: " + baraja[j],TextoMod.verde, 30);
        cartasJ[posCartasJ] = baraja[j];
        posCartasJ++;
        sumaJ = calcularSuma(cartasJ, posCartasJ);
        j++;
        TextoMod.imprimirConDelay("  Sumas: " + sumaJ,TextoMod.verde, 30);

        TextoMod.imprimirConDelay("La casa obtuvo un: " + baraja[j],TextoMod.morado, 30);
        cartasC[posCartasC] = baraja[j];
        posCartasC++;
        j++;

        TextoMod.imprimirConDelay("La casa obtuvo un: " + baraja[j],TextoMod.morado, 30);
        cartasC[posCartasC] = baraja[j];
        posCartasC++;
        sumaC = calcularSuma(cartasC, posCartasC);
        j++;
        TextoMod.imprimirConDelay("  La casa suma: " + sumaC,TextoMod.morado, 30);

        while (turnoJ == false) {
            System.out.println();
            TextoMod.imprimirConDelay("Que haras?",TextoMod.blanco, 30);
            TextoMod.imprimirConDelay("1. Pedir Carta",TextoMod.azul, 30);
            TextoMod.imprimirConDelay("2. Plantarse",TextoMod.cyan, 30);
            TextoMod.imprimirConDelay("-->",TextoMod.rojo, 30);

            try {
                accionJ = sc.nextInt();
            } catch (InputMismatchException e) {
                TextoMod.imprimirConDelay("Eso no es una acción.",TextoMod.amarillo, 30);
                sc.nextLine();
                continue; //Vuelve a pedirte una acción
            }
            if (accionJ == 1) {
                TextoMod.imprimirConDelay("Obtuviste un: " + baraja[j],TextoMod.verde, 30);
                cartasJ[posCartasJ] = baraja[j];
                posCartasJ++;
                sumaJ = calcularSuma(cartasJ, posCartasJ);
                j++;
                TextoMod.imprimirConDelay("  Sumas: " + sumaJ,TextoMod.verde, 30);

            } else if (accionJ == 2) {
                TextoMod.imprimirConDelay("  Sumas: " + sumaJ,TextoMod.verde, 30);
                turnoJ = true;
            }
        }
        if (sumaJ > 21){
            TextoMod.imprimirConDelay("Perdiste, te pasaste de 21.",TextoMod.morado, 30);
            ganar = 1;
        }
        while (turnoC == false){
            if (sumaJ>sumaC){
                if (sumaC < 16){
                    TextoMod.imprimirConDelay("La casa obtuvo un: " + baraja[j],TextoMod.morado, 30);
                    cartasC[posCartasC] = baraja[j];
                    posCartasC++;
                    sumaC = calcularSuma(cartasC, posCartasC);
                    j++;
                    TextoMod.imprimirConDelay("  La casa suma: " + sumaC,TextoMod.morado, 30);
                }else {
                    TextoMod.imprimirConDelay("  La casa suma: " + sumaC,TextoMod.morado, 30);
                    turnoC = true;
                }
            }else {
                TextoMod.imprimirConDelay("  La casa suma: " + sumaC,TextoMod.morado, 30);
                turnoC = true;
            }
        }
        if (sumaC > 21) {
            TextoMod.imprimirConDelay("Ganaste, la casa se paso de 21." + sumaC,TextoMod.verde, 30);
            ganar = 2;
            return ganar;
        }
        if (sumaJ > sumaC){
            TextoMod.imprimirConDelay("Ganaste",TextoMod.verde, 30);
            System.out.println(sumaJ+" > "+sumaC);
            ganar = 2;
        } else if (sumaC > sumaJ) {
            TextoMod.imprimirConDelay("Perdiste",TextoMod.morado, 30);
            System.out.println(sumaJ+" < "+sumaC);
            ganar = 1;
        } else if (sumaC == sumaJ) {
            TextoMod.imprimirConDelay("Empataste",TextoMod.amarillo, 30);
            System.out.println(sumaJ+" = "+sumaC);
            ganar = 3;
        }
        return ganar;
    }
}