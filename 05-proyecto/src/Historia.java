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

        System.out.println("\nLlegas a las puertas de un antiguo complejo tecnológico militar sellado a cal y canto. El paso está completamente bloqueado.");



    }



    public static int karma = 0;



}
