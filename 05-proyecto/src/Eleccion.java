import java.util.Scanner;

public class Eleccion {
    public static Scanner sc = new Scanner(System.in);
    public static void elij1(){



        System.out.println("--- Has encontrado unos contenedores militares medio enterrados ---");

        System.out.println("\n¿Qué deseas hacer? 1/2");
        System.out.println("1. Buscar a fondo en las cajas metálicas.");
        System.out.println("2. Ignorar los contenedores y seguir avanzando hacia el complejo abandonado.");

        int caj = sc.nextInt();

        if (caj == 1){

            Inventario.itemsToInv("Fusion core");

        }else {

            System.out.println("Decides dejar atras los contenedores y sigues avanzando hacia el complejo abandonado");

        }

    }

    public static void elij2(){

        System.out.println("--- Las puertas estan selladas de cal a canto ---");

        System.out.println("\n¿Qué deseas hacer? 1/2");
        System.out.println("1. Intentar forzar la puerta principal con fuerza bruta.");
        System.out.println("2. Buscar un panel de control o acceso alternativo alrededor del complejo.");

    }

}
