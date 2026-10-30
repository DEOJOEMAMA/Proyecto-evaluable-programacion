import java.util.Scanner;

public class VidaYpersonaje {

    public static int pv = 0;

    public static void elecion(){

        Scanner sc = new Scanner(System.in);

        String elec = sc.next();

        while (true){

            if (elec.equalsIgnoreCase("humano")){

                System.out.println("\u001B[35mHas elegido ser humano \u001B[35m");
                int vida = pv+100;
                System.out.println("Tienes " + vida+ "pv");

                System.out.println();
                System.out.println("\033[32m---- Historia ----\033[32m");
                System.out.println("El aire se siente frío, como si te encontrases en un congelador, al mirar a los " +
                        "\nlados te das cuenta que estas dentro de una de las capsula de criogenización dentro de un bunker de Vault-Tech, " +
                        "\ntras salir explorarías el búnker y encontrarías una pistola chatarra, balas de pistola y un mapa." );

                Inventario.itemsToInv("Pistola Chatarra");
                Inventario.itemsToInv("Balas pistola");
                Inventario.itemsToInv("Mapa");

                System.out.println();
                System.out.println("Una alarma sorda comienza a sonar en el búnker. Los sellos de la gran puerta acorazada empiezan a girar. " +
                        "\nEs hora de dar el primer paso hacia lo desconocido.");
                return;

            }else if (elec.equalsIgnoreCase("mutante")){

                System.out.println("\u001B[35mHas elegido ser mutante \u001B[35m");
                int vid = pv + 85;
                System.out.println("Tienes " + vid + "pv");

                System.out.println("\n\033[32m---- Historia ----\033[32m");
                System.out.println("No hay refugios para ti. Abres los ojos bajo el sol abrasador y el polvo radiactivo de una ciudad en ruinas en pleno Yermo. " +
                        "\nTu piel está putrefacta, pero notas una extraña regeneración fluyendo por tus venas.");

                System.out.println("\nRebuscas entre tus harapos y preparas tu equipo de supervivencia: ");

                Inventario.itemsToInv("Rifle palanca");
                Inventario.itemsToInv("Balas rifle");
                Inventario.itemsToInv("Mapa");

                System.out.println("\nA lo lejos, siluetas de criaturas hostiles merodean entre los escombros irradiados. Tienes que sobrevivir a este infierno.");
                return;

            }else {

                System.out.println("Esa raza no está disponible");
                System.out.print("Porfavor elige entre esas 2 razas: ");
                elec = sc.next();
            }
        }





    }

    public static void ini(){

        System.out.println("\033[32mAntes de dar tu primer paso en este mundo muerto, debes recordar quién eres y de dónde vienes.\033[32m");
        System.out.println();
        System.out.println("¿Que quieres ser?");
        System.out.println("1. Humano");
        System.out.println("2. Mutante");

        elecion();

    }

}
