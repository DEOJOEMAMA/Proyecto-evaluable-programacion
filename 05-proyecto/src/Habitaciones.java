import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Habitaciones {
    public static int[] negro ={2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
    public static int[] rojo ={1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
   public static Random r = new Random();
   public static Scanner sc = new Scanner(System.in);
   public static void habitaciones(){
       int rand = r.nextInt(3);
       switch(rand){
           case 0 -> habitacion1();
           case 1 -> casino();
           case 2 -> habitacion2();
       }
   }
    public static void habitacion1() {
        int contadorInvest = 0;
        int rand = r.nextInt(2);
        if (rand == 0) {
            System.out.println("No encuntas nada por el camino");
            return;
        } else {
            System.out.println("Te encuentra una casa por el camino\n" +
                    "¿quieres entrar?");
            while (true) {
                System.out.println("1. Sí");
                System.out.println("2. No");
                String elij = sc.next();

                if (elij.equalsIgnoreCase("1") || elij.equalsIgnoreCase("si")) {

                    System.out.println("Entras en la casa");
                    en();
                    break;

                } else if (elij.equalsIgnoreCase("2") || elij.equalsIgnoreCase("no")){
                    return;

                }


            }
            System.out.println("Lo unico que encuentras a primera vista es una puerta que parece estar cerrada, que quieres hacer");
            int a = sc.nextInt();
            while(true) {
                System.out.println("1. Tratar de abrir la puerta");
                System.out.println("2. Investigar");
                System.out.println("3. Salir de la casa");

                if (a > 3) {
                    System.out.println("Porfavor di un numero del 1 al 3");

                }
                if (a == 1) {
                    boolean ganar = Ahorcado.jugarAhorcado();
                    if (ganar) {
                        System.out.println("Consiges abrir la puerta");
                        ItemsYcajas.cajas();
                        System.out.println("Vuelves a la sala inicial");
                        break;
                    }
                } else if (a == 2) {
                    Eleccion.elij();
                    contadorInvest++;
                    break;
                } else if (a == 3) {
                    System.out.println("Sales de la casa y prosigues con tu camino");
                    return;
                }
            }

             while (true){
                 System.out.println("1. Investigar");
                 System.out.println("2. Salir de la casa");
                 int b = sc.nextInt();
                if (b > 3) {
                    System.out.println("Porfavor di un numero del 1 al 3");
                }
                if (b == 1) {
                    if(contadorInvest == 0) {
                        Eleccion.elij();
                        contadorInvest++;
                    }else{
                        System.out.println("Ya has investigado aqui");
                    }
                } else if (b == 2) {
                    System.out.println("Sales de la casa y prosigues con tu camino");
                    return;
                }
            }

        }
    }
        public static void en () {
            int enemigos = r.nextInt(2);
            if (enemigos == 0) {
                Combate.cbt();
            } else {
                System.out.println("No encuentras ningun enemigo en el interior");
            }
        }

    public static void casino(){
        int rand = r.nextInt(2);
        if (rand == 0) {
            System.out.println("No encuntas nada por el camino");
            return;
        } else {
            System.out.println("Has encontrado un casino abierto y funcional");
            System.out.println("¿Quieres entrar?");
            System.out.println("1. Sí");
            System.out.println("2. No");
        }
        while (true) {
            String elij = sc.next();
            if (elij.equalsIgnoreCase("1") || elij.equalsIgnoreCase("si")) {

                System.out.println("Entras al casino");
                break;

            } else if (elij.equalsIgnoreCase("2") || elij.equalsIgnoreCase("no")){
                return;

            }


        }
        System.out.println("Al entrar, lo que ves es una mesa de black jack y una ruleta");
        while (true) {
            System.out.println("1. Jugar black jack");
            System.out.println("2. Jugar a la ruleta");
            System.out.println("3. Salir del casino");
            int a =sc.nextInt();
            if (a >3) {
                System.out.println("Porfavor di un numero del 1 al 3");
            }
            if (a == 1) {
                System.out.println("Vas a jugar al black jack");
                    Blackjack.bj();

            }else if (a == 2) {
                System.out.println("Vas a jugar a la ruleta");
                ruleta();
            }else if (a ==3){
                System.out.println("Sales del casino");
                return;
            }
        }

    }
    public static void apostar(){

    }
    public static void ruleta(){
       int eleccion;
       int numero = r.nextInt(37);
        System.out.println("A que quieres apostar");
        while (true) {
            System.out.println("1. Rojo");
            System.out.println("2. Negro");
            System.out.println("3. Al 0");
            System.out.println("4. Salir de la ruleta");
            eleccion = sc.nextInt();
            if(eleccion>4){
                System.out.println("Porfavor di un numero del 1 al 4");
            }
            if (eleccion == 1) {
                System.out.println("Vas a rojo");
                break;
            } else if (eleccion == 2) {
                System.out.println("Vas a negro");
                break;

            }else if (eleccion == 3) {
                System.out.println("Vas a 0");
                break;
            }else if (eleccion == 4) {
                System.out.println("Salir de la ruleta");
                return;
            }
        }

        for (int i = 0; i < negro.length; i++) {
            if (negro[i] == numero) {
                System.out.println("Es negro");
                if (eleccion == 1) {
                    System.out.println("Has perdido");
                } else if (eleccion == 2) {
                    System.out.println("Has ganado");
                }else if (eleccion == 3) {
                    System.out.println("Has perdido");
                }
                break;
            }
        }
        for (int i = 0; i < rojo.length; i++) {
            if (rojo[i] == numero) {
                System.out.println("Es rojo");
                if (eleccion == 1) {
                    System.out.println("Has ganado");
                } else if (eleccion == 2) {
                    System.out.println("Has perdido");
                }else if (eleccion == 3) {
                    System.out.println("Has perdido");
                }
                break;
            }
        }
        if (numero == 0) {
            System.out.println("Es 0");
            if (eleccion == 1) {
                System.out.println("Has perdido");
            } else if (eleccion == 2) {
                System.out.println("Has perdido");
            }else if (eleccion == 3) {
                System.out.println("Has ganado");
            }
        }
        System.out.println("¿Quieres seguir jugando?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        while (true) {

            String elij = sc.next();
            if (elij.equalsIgnoreCase("1") || elij.equalsIgnoreCase("si")) {
                ruleta();

            } else if (elij.equalsIgnoreCase("2") || elij.equalsIgnoreCase("no")){
                return;

            }

        }

    }
    public static void habitacion2(){

    }
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

            TextoMod.imprimirConDelay("-------------",TextoMod.rojo, 50);
            TextoMod.imprimirConDelay("--Blackjack--",TextoMod.rojo, 50);
            TextoMod.imprimirConDelay("-------------",TextoMod.rojo, 50);

            TextoMod.imprimirConDelay("Obtuviste un: " + baraja[j],TextoMod.verde, 50);
            cartasJ[posCartasJ] = baraja[j];
            posCartasJ++;
            sumaJ = calcularSuma(cartasJ, posCartasJ);
            j++;
            TextoMod.imprimirConDelay("  Sumas: " + sumaJ,TextoMod.verde, 50);

            TextoMod.imprimirConDelay("Obtuviste un: " + baraja[j],TextoMod.verde, 50);
            cartasJ[posCartasJ] = baraja[j];
            posCartasJ++;
            sumaJ = calcularSuma(cartasJ, posCartasJ);
            j++;
            TextoMod.imprimirConDelay("  Sumas: " + sumaJ,TextoMod.verde, 50);

            TextoMod.imprimirConDelay("La casa obtuvo un: " + baraja[j],TextoMod.morado, 50);
            cartasC[posCartasC] = baraja[j];
            posCartasC++;
            sumaC = calcularSuma(cartasC, posCartasC);
            j++;
            TextoMod.imprimirConDelay("  La casa suma: " + sumaC,TextoMod.morado, 50);

            TextoMod.imprimirConDelay("La casa obtuvo un: " + baraja[j],TextoMod.morado, 50);
            cartasC[posCartasC] = baraja[j];
            posCartasC++;
            sumaC = calcularSuma(cartasC, posCartasC);
            j++;
            TextoMod.imprimirConDelay("  La casa suma: " + sumaC,TextoMod.morado, 50);

            while (turnoJ == false) {
                System.out.println();
                TextoMod.imprimirConDelay("Que haras?",TextoMod.blanco, 50);
                TextoMod.imprimirConDelay("1. Pedir Carta",TextoMod.azul, 50);
                TextoMod.imprimirConDelay("2. Plantarse",TextoMod.cyan, 50);
                TextoMod.imprimirConDelay("-->",TextoMod.rojo, 50);

                try {
                    accionJ = sc.nextInt();
                } catch (InputMismatchException e) {
                    TextoMod.imprimirConDelay("Eso no es una acción.",TextoMod.amarillo, 50);
                    sc.nextLine();
                    continue; //Vuelve a pedirte una acción
                }
                if (accionJ == 1) {
                    TextoMod.imprimirConDelay("Obtuviste un: " + baraja[j],TextoMod.verde, 50);
                    cartasJ[posCartasJ] = baraja[j];
                    posCartasJ++;
                    sumaJ = calcularSuma(cartasJ, posCartasJ);
                    j++;
                    TextoMod.imprimirConDelay("  Sumas: " + sumaJ,TextoMod.verde, 50);

                } else if (accionJ == 2) {
                    TextoMod.imprimirConDelay("  Sumas: " + sumaJ,TextoMod.verde, 50);
                    turnoJ = true;
                }
            }
            if (sumaJ > 21){
                TextoMod.imprimirConDelay("Perdiste, te pasaste de 21.",TextoMod.morado, 50);
                ganar = 1;
            }
            while (turnoC == false){
                if (sumaJ>sumaC){
                    if (sumaC < 16){
                        TextoMod.imprimirConDelay("La casa obtuvo un: " + baraja[j],TextoMod.morado, 50);
                        cartasC[posCartasC] = baraja[j];
                        posCartasC++;
                        sumaC = calcularSuma(cartasC, posCartasC);
                        j++;
                        TextoMod.imprimirConDelay("  La casa suma: " + sumaC,TextoMod.morado, 50);
                    }else {
                        TextoMod.imprimirConDelay("  La casa suma: " + sumaC,TextoMod.morado, 50);
                        turnoC = true;
                    }
                }else {
                    TextoMod.imprimirConDelay("  La casa suma: " + sumaC,TextoMod.morado, 50);
                    turnoC = true;
                }
            }
            if (sumaC > 21) {
                TextoMod.imprimirConDelay("Ganaste, la casa se paso de 21." + sumaC,TextoMod.verde, 50);
                ganar = 2;
                return ganar;
            }
            if (sumaJ > sumaC){
                TextoMod.imprimirConDelay("Ganaste",TextoMod.verde, 50);
                System.out.println(sumaJ+" > "+sumaC);
                ganar = 2;
            } else if (sumaC > sumaJ) {
                TextoMod.imprimirConDelay("Perdiste",TextoMod.morado, 50);
                System.out.println(sumaJ+" < "+sumaC);
                ganar = 1;
            } else if (sumaC == sumaJ) {
                TextoMod.imprimirConDelay("Empataste",TextoMod.amarillo, 50);
                System.out.println(sumaJ+" = "+sumaC);
                ganar = 3;
            }
            return ganar;
        }
    }
}
