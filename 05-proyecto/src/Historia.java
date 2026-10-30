public class Historia {

    public static void hist() {

        System.out.println("\033[32m==========================================================\033[32m");
        System.out.println("              UNA HISTORIA BASADA EN FALLOUT             ");
        System.out.println("==========================================================");

        System.out.println("La guerra... la guerra nunca cambia. El fuego atómico arrasó el mundo, convirtiéndolo en un" +
                " cementerio de cenizas y radiación. Bienvenido al Yermo.");

        System.out.println();
        VidaYpersonaje.ini();

        System.out.println("Independientemente de si saliste del búnker o de las cenizas del desierto, " +
                "\ntus pasos te conducen a unos viejos contenedores militares medio enterrados. Es momento de investigar el terreno.");

        System.out.println();

        Eleccion.elij1();

        System.out.println("\nLlegas a las puertas de un antiguo complejo tecnológico militar sellado a cal y canto. El paso está completamente bloqueado.\n");

        Eleccion.elij2();

    }



    public static int karma = 0;

    public static void escExt(){

        System.out.println("\nTe apartas de la pesada puerta blindada y bordeas los muros de hormigón agrietado del complejo militar. " +
                "\nEntre matorrales secos y cables colgando, localizas una vieja caja de conexiones de Vault-Tech cubierta de óxido y polvo radiactivo.");

        System.out.println("\n--- HACKING DE PUERTA --- \n");

        while (true) {
            boolean ganado = Ahorcado.jugarAhorcado();

            if (ganado == true) {

                return;

            }else if (ganado!=true){

                System.out.println("Te has electrocutado, pierdes 10pv");
                SistemaVida.vida-=10;

            }

        }

    }


}
