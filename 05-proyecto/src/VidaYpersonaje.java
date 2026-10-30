import java.util.Scanner;

public class VidaYpersonaje {

    public static int pv = 0;

    public static void elecion(){

        Scanner sc = new Scanner(System.in);

        String elec = sc.next();

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

            Inventario.mostrarInv();
        }else if (elec.equalsIgnoreCase("mutante")){

            System.out.println("\u001B[35m Has elegido ser mutante \u001B[35m");
            int vid = pv + 85;

            System.out.println("Tienes " + vid + "pv");

        }else {

            System.out.println("Esa raza no está disponible");

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
