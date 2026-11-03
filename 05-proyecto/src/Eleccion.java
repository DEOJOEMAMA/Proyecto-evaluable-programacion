import java.util.Random;
import java.util.Scanner;

public class Eleccion {
    public static Scanner sc = new Scanner(System.in);

    public static void elij(){
        Scanner sc = new Scanner(System.in);
        Random rdr = new Random();

        System.out.println("--- Quieres buscar por items en la zona? --- ");

        System.out.println("1.Si ");
        System.out.println("2.No");

        while (true) {

            System.out.print("-->");
            String rest = sc.next();

            if (rest.equalsIgnoreCase("si") || rest.equalsIgnoreCase("1")) {

                int n = rdr.nextInt(1, 5);

                if (n <= 2) {

                    System.out.println("\nTe encuentras un estimulante\n");

                    Inventario.itemsToInv("Estimulante");

                    return;
                } else if (n > 3) {

                    System.out.println("\nNo has encontrado nada\n");

                    return;
                }

            }else if(rest.equalsIgnoreCase("no") || rest.equalsIgnoreCase("2")){

                return;

            }else if(!rest.equalsIgnoreCase("no") || !rest.equalsIgnoreCase("si")
                    || !rest.equalsIgnoreCase("1") || !rest.equalsIgnoreCase("2")){

                System.out.println("Esa opción no esta disponible, introduzca el número  de nuevo");

            }

        }

    }

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
                VidaYPersonaje.recibirDano(3);

                return;

            }else if (puert==2){

                Historia.escExt();


                return;
            }

        }
        
    }

    public static void facciones(){
        System.out.println("\n--- Tienes que elegir una de las siguientes opcines 1/2/3 ---");
        System.out.println("1. Unirse a la hemandad del acero.");
        System.out.println("2. Unirse a la legión de cesar");
        System.out.println("3. Mantenerse como bandido.");
        while (true){
            int eleccion = sc.nextInt();

            switch (eleccion){
                case 1 ->{System.out.println("Te has unido a la hermandad del acero"); return;}
                case 2 -> {System.out.println("Te has unido a la legión de cesar"); return;}
                case 3 -> {System.out.println("Te mantienes como bandido"); return;}
            }
            if (eleccion > 3) {
                System.out.println("Elije un numero del 1 al 3 porfavor");

            }

        }
    }

}
