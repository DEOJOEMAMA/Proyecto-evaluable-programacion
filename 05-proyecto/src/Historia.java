import java.util.Scanner;

public class Historia {

    public static Scanner sc = new Scanner(System.in);

    public static void hist() {

        System.out.println("\033[32m==========================================================\033[32m");
        System.out.println("              UNA HISTORIA BASADA EN FALLOUT             ");
        System.out.println("==========================================================");

        TextoMod.imprimirConDelay("La guerra... la guerra nunca cambia. El fuego atómico arrasó el mundo, convirtiéndolo en un" +
                " cementerio de cenizas y radiación. Bienvenido al Yermo.",TextoMod.azul, 20);

        System.out.println();
        VidaYPersonaje.ini();

        TextoMod.imprimirConDelay("Independientemente de si saliste del búnker o de las cenizas del desierto, " +
                "\ntus pasos te conducen a unos viejos contenedores militares medio enterrados. Es momento de investigar el terreno.",TextoMod.azul, 10);

        System.out.println();

        Eleccion.elij1();

        System.out.println();

        TextoMod.imprimirConDelay("\nLlegas a las puertas de un antiguo complejo tecnológico militar sellado a cal y canto. El paso está completamente bloqueado.\n", TextoMod.azul, 10);

        Eleccion.elij2();

        TextoMod.imprimirConDelay("Por el camino te cruzas con un grupo de civiles",TextoMod.azul, 10);
        TextoMod.imprimirConDelay("\n--- ¿Qué quieres hacer? ---\n1.Saquearlos\n2.Pasar de largo",TextoMod.verde, 10);

        Eleccion.elij0();

        Habitaciones.habitaciones();

        TextoMod.imprimirConDelay("\nLos restos de rascacielos desplomados forman un laberinto de cemento y sombras. " +
                "\nEstás en el cruce de caminos del Yermo, donde la tensión entre diferentes grupos armados se palpa en el aire.",TextoMod.azul, 10);

        TextoMod.imprimirConDelay("\n--- ¿Qué quieres hacer? ---",TextoMod.verde, 10);
        TextoMod.imprimirConDelay("\n1.Avanzar hacia la plaza central para decidir tu facción." +
                "\n2.Tomar un rodeo por los callejones para evaluar el panorama antes de actuar.",TextoMod.azul, 10);

        Eleccion.elec3();



    }

    public static void escExt(){

        TextoMod.imprimirConDelay("\nTe apartas de la pesada puerta blindada y bordeas los muros de hormigón agrietado del complejo militar. " +
                "\nEntre matorrales secos y cables colgando, localizas una vieja caja de conexiones de Vault-Tech cubierta de óxido y polvo radiactivo.",TextoMod.azul, 10);

        TextoMod.imprimirConDelay("\n--- HACKING DE PUERTA --- \n",TextoMod.verde, 10);

        while (true) {
            boolean ganado = Ahorcado.jugarAhorcado();

            if (ganado == true) {

                TextoMod.imprimirConDelay("\nDetras de la puerta parece haber algo\n",TextoMod.azul, 10);

                Combate.cbt();

                ItemCurar.cur();
                return;

            }else if (ganado!=true){

                TextoMod.imprimirConDelay("Te has electrocutado",TextoMod.rojo, 10);
                VidaYPersonaje.recibirDano(10);

            }

        }
    }


}
