import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class Ruleta {
    public static void main(String[] args) {
        ruleta();
    }

    public static int[] negro = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
    public static int[] rojo = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};

    public static int ruleta() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int ganar = 0;
        int elecc = 0;
        int numero = r.nextInt(37);
        TextoMod.imprimirConDelay("A que quieres apostar", TextoMod.morado, 0);
        while (true) {
            TextoMod.imprimirConDelay("1. Rojo", TextoMod.verde, 0);
            TextoMod.imprimirConDelay("2. Negro", TextoMod.verde, 0);
            TextoMod.imprimirConDelay("3. Cero", TextoMod.verde, 0);
            TextoMod.imprimirConDelay("4. Salir de la ruleta", TextoMod.verde, 0);
            try {
                elecc = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                TextoMod.imprimirConDelay("Por favor ingrese un numero del 1 al 4", TextoMod.verde,0);
            }
            if (elecc > 4) {
                TextoMod.imprimirConDelay("Por favor ingrese un numero del 1 al 4", TextoMod.verde,0);
            }
            if (elecc == 1) {
                TextoMod.imprimirConDelay("Vas a rojo",TextoMod.morado, 30);
                break;
            } else if (elecc == 2) {
                TextoMod.imprimirConDelay("Vas a negro", TextoMod.morado, 30);
                break;

            } else if (elecc == 3) {
                TextoMod.imprimirConDelay("Vas a 0", TextoMod.morado, 30);
                break;
            } else if (elecc == 4) {
                System.out.println("Sales de la ruleta");
                return ganar;
            }
        }

        for (int i = 0; i < negro.length; i++) {
            if (negro[i] == numero) {
                TextoMod.imprimirConDelay("Es negro", TextoMod.morado, 30);
                if (elecc == 1) {
                    TextoMod.imprimirConDelay("Has perdido", TextoMod.rojo, 30);
                    ganar = 1;
                } else if (elecc == 2) {
                    TextoMod.imprimirConDelay("Has ganado",TextoMod.verde,30);
                    ganar = 2;
                } else if (elecc == 3) {
                    TextoMod.imprimirConDelay("Has perdido", TextoMod.rojo, 30);
                    ganar = 1;
                }
                break;
            }
        }
        for (int i = 0; i < rojo.length; i++) {
            if (rojo[i] == numero) {
                System.out.println("Es rojo");
                if (elecc == 1) {
                    TextoMod.imprimirConDelay("Has ganado",TextoMod.verde,30);
                    ganar = 2;
                } else if (elecc == 2) {
                    TextoMod.imprimirConDelay("Has perdido", TextoMod.rojo, 30);
                    ganar = 1;
                } else if (elecc == 3) {
                    TextoMod.imprimirConDelay("Has perdido", TextoMod.rojo, 30);
                    ganar = 1;
                }
                break;
            }
        }
        if (numero == 0) {
            System.out.println("Es 0");
            if (elecc == 1) {
                TextoMod.imprimirConDelay("Has perdido", TextoMod.rojo, 30);
                ganar = 1;
            } else if (elecc == 2) {
                TextoMod.imprimirConDelay("Has perdido", TextoMod.rojo, 30);
                ganar = 1;
            } else if (elecc == 3) {
                TextoMod.imprimirConDelay("Has ganado",TextoMod.verde,30);
                ganar = 2;
            }
        }
        return ganar;
    }
}
