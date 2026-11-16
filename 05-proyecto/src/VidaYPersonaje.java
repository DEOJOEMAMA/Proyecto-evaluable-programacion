import java.util.Scanner;

public class VidaYPersonaje {
    public static int karma;
    public static int hp;
    public static int hpMax;
    public static boolean servoArmadura = false; // ¿la tienes?
    public static boolean armaduraActiva = false;   // ¿está encendida?

    public static void comprobarVida(){

        if (hp < 1){
            System.out.println("Has muerto, fin de la partida");
            System.exit(0);
        }
    }

    public static void recibirDano(int cantidad){
        hp -= cantidad;
        System.out.println("Recibes " + cantidad + " de daño. HP: " + Math.max(0, hp) + " / " + hpMax);
        comprobarVida();
    }
    public static void curarVida(int cantidad){
        hp += cantidad;
        hp = Math.min(hp, hpMax);
        System.out.println("\nTe curas " + cantidad + " de hp: " + hp + " / " + hpMax);
        comprobarVida();
    }

    public static void ini(){

        TextoMod.imprimirConDelay("\033[32mAntes de dar tu primer paso en este mundo muerto, debes recordar quién eres y de dónde vienes.\033[32m",TextoMod.verde, 10);
        System.out.println();
        TextoMod.imprimirConDelay("¿Que quieres ser?",TextoMod.verde, 10);
        TextoMod.imprimirConDelay("1. Humano",TextoMod.verde, 10);
        TextoMod.imprimirConDelay("2. Mutante",TextoMod.verde, 10);

        elecion();

    }

    public static void elecion(){

        Scanner sc = new Scanner(System.in);

        String elec = sc.next();

        while (true){

            if (elec.equalsIgnoreCase("humano") || elec.equalsIgnoreCase("1")){

                TextoMod.imprimirConDelay("Has elegido ser humano ",TextoMod.morado, 10);
                hp +=100;
                hpMax = 100;
                TextoMod.imprimirConDelay("Tienes " + hp + " / " + hpMax + " HP",TextoMod.morado, 10);

                System.out.println();
                System.out.println("\033[32m---- Historia ----\033[32m");
                TextoMod.imprimirConDelay("El aire se siente frío, como si te encontrases en un congelador, al mirar a los " +
                        "\nlados te das cuenta que estas dentro de una de las capsula de criogenización dentro de un bunker de Vault-Tech, " +
                        "\ntras salir explorarías el búnker y encontrarías una pistola chatarra, balas de pistola y un mapa." ,TextoMod.azul, 10);

                Inventario.itemsToInv("Pistola Chatarra");
                Inventario.itemsToInv("Balas pistola");
                Inventario.itemsToInv("Mapa");

                System.out.println();
                TextoMod.imprimirConDelay("Una alarma sorda comienza a sonar en el búnker. Los sellos de la gran puerta acorazada empiezan a girar. " +
                        "\nEs hora de dar el primer paso hacia lo desconocido.",TextoMod.azul, 10);

                TextoMod.imprimirConDelay("Antes de salir ",TextoMod.verde, 10);
                Eleccion.elij();
                return;

            }else if (elec.equalsIgnoreCase("mutante") || elec.equalsIgnoreCase("2")){

                System.out.println("\u001B[35mHas elegido ser mutante \u001B[35m");
                hp +=85;
                hpMax = 85;
                System.out.println("Tienes " + hp + " / " + hpMax + " HP");

                System.out.println("\n\033[32m---- Historia ----\033[32m");
                TextoMod.imprimirConDelay("No hay refugios para ti. Abres los ojos bajo el sol abrasador y el polvo radiactivo de una ciudad en ruinas en pleno Yermo. " +
                        "\nTu piel está putrefacta, pero notas una extraña regeneración fluyendo por tus venas.",TextoMod.azul, 10);

                System.out.println("\nRebuscas entre tus harapos y preparas tu equipo de supervivencia: ");

                Inventario.itemsToInv("Rifle de palanca");
                Inventario.itemsToInv("Balas rifle");
                Inventario.itemsToInv("Mapa");
                Inventario.itemsToInv("Vendaje");

                System.out.println("\nA lo lejos, siluetas de criaturas hostiles merodean entre los escombros irradiados. Tienes que sobrevivir a este infierno.\n");

                Eleccion.elij();
                return;

            }else {

                System.out.println("Esa raza no está disponible");
                System.out.print("Porfavor elige entre esas 2 razas: ");
                elec = sc.next();
            }
        }

    }
}