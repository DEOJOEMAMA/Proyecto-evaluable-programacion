import java.util.Scanner;

public class Eleccion {
    public static Scanner sc = new Scanner(System.in);
    public static void elij1(){


        System.out.println("--- Has encontrado unos contenedores militares medio enterrados ---");

        System.out.println("\n¿Qué deseas hacer? 1/2");
        System.out.println("1. Buscar a fondo en las cajas metálicas.");
        System.out.println("2. Ignorar los contenedores y seguir avanzando hacia el complejo abandonado.");

        while (true){

            int caj = sc.nextInt();

            if (caj == 1){

                Inventario.itemsToInv("Fusion core");
                return;

            }else if(caj == 2){

                System.out.println("Decides dejar atras los contenedores y sigues avanzando hacia el complejo abandonado");
                return;
            }

            System.out.println("Esa elección no está disponible, escriba 1 o 2 para elegir");

        }

    }

    public static void elij2(){

        System.out.println("--- Las puertas estan selladas de cal a canto ---");

        System.out.println("\n¿Qué deseas hacer? 1/2");
        System.out.println("1. Intentar forzar la puerta principal con fuerza bruta.");
        System.out.println("2. Buscar un panel de control o acceso alternativo alrededor del complejo.\n");
        while (true){

            int puert = sc.nextInt();

            if (puert==1){

                System.out.println("Te haces daño al intentar abrirlo por la fuerza");
                SistemaVida.vida -=3;
                System.out.println(SistemaVida.vida+"pv");


                return;

            }else if (puert==2){

                Historia.escExt();

                return;
            }

        }



    }



}
