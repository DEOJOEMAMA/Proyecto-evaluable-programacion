public class Historia {

    public static void hist() {

        System.out.println("\033[32m==========================================================\033[32m");
        System.out.println("              UNA HISTORIA BASADA EN FALLOUT             ");
        System.out.println("==========================================================");

        Delay.imprimeConDelay("La guerra... la guerra nunca cambia. El fuego atómico arrasó el mundo, convirtiéndolo en un" +
                " cementerio de cenizas y radiación. Bienvenido al Yermo.");

        System.out.println();
        VidaYPersonaje.ini();

        Delay.imprimeConDelay("Independientemente de si saliste del búnker o de las cenizas del desierto, " +
                "\ntus pasos te conducen a unos viejos contenedores militares medio enterrados. Es momento de investigar el terreno.");

        System.out.println();

        Eleccion.elij1();

        Delay.imprimeConDelay("\nLlegas a las puertas de un antiguo complejo tecnológico militar sellado a cal y canto. El paso está completamente bloqueado.\n");

        Eleccion.elij2();

    }



    public static int karma = 0;

    public static void escExt(){

        Delay.imprimeConDelay("\nTe apartas de la pesada puerta blindada y bordeas los muros de hormigón agrietado del complejo militar. " +
                "\nEntre matorrales secos y cables colgando, localizas una vieja caja de conexiones de Vault-Tech cubierta de óxido y polvo radiactivo.");

        Delay.imprimeConDelay("\n--- HACKING DE PUERTA --- \n");

        while (true) {
            boolean ganado = Ahorcado.jugarAhorcado();

            if (ganado == true) {

                Delay.imprimeConDelay("\nDetras de la puerta parece haber algo\n");

                Combate.cbt();

                ItemsYcajas.itemCurar.cur();
                return;

            }else if (ganado!=true){

                Delay.imprimeConDelay("Te has electrocutado");
                VidaYPersonaje.recibirDano(10);

            }

        }
    }


}
