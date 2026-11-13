import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Eleccion {

    public static Scanner sc = new Scanner(System.in);
    public static int unirFacc;
    public static Random rdr = new Random();

    public static void elij(){

        while (true) {
            System.out.println("--- Quieres buscar por items en la zona? --- ");

            TextoMod.imprimirConDelay("1.Si ",TextoMod.verde , 10);
            TextoMod.imprimirConDelay("2.No",TextoMod.verde , 10);
            TextoMod.imprimirConDelay("3. Mostrar Inventario",TextoMod.verde , 10);

            System.out.print("-->");
            String rest = sc.next();

            if (rest.equalsIgnoreCase("si") || rest.equalsIgnoreCase("1")) {

                VidaYPersonaje.karma++;

                int n = rdr.nextInt(1, 5);

                if (n <= 2) {

                    TextoMod.imprimirConDelay("\nTe encuentras un estimulante\n",TextoMod.verde , 10);

                    Inventario.itemsToInv("Estimulante");

                    return;
                } else if (n > 3) {

                    TextoMod.imprimirConDelay("\nNo has encontrado nada\n",TextoMod.verde , 10);

                    return;
                }
            return;
            }else if(rest.equalsIgnoreCase("no") || rest.equalsIgnoreCase("2")){

                return;

            }else if (rest.equalsIgnoreCase("3")){
                Inventario.mostrarInv();
            } else{
                TextoMod.imprimirConDelay("Esa opción no esta disponible, introduzca el número  de nuevo",TextoMod.verde , 10);
            }
        }
    }

    public static void elij0(){

        int a =0;

        while (true){
            try {

                System.out.print("-->");
                a = sc.nextInt();

            }catch (InputMismatchException e){

                System.out.println("Datos incorrectos ingrese de 1 o 2");

            }
            switch (a){

                case 1 -> {

                    Saqueo.saq();
                    VidaYPersonaje.karma--;
                    return;
                }
                case 2 -> {


                    VidaYPersonaje.karma++;
                    return;
                }

            }
        }

    }

    public static void elij1(){


        System.out.println("--- Has encontrado unos contenedores militares medio enterrados ---");

        while (true){

            TextoMod.imprimirConDelay("\n¿Qué deseas hacer? 1/2",TextoMod.verde , 10);
            TextoMod.imprimirConDelay("1. Buscar a fondo en las cajas metálicas.",TextoMod.verde , 10);
            TextoMod.imprimirConDelay("2. Ignorar los contenedores y seguir avanzando hacia el complejo abandonado.",TextoMod.verde , 10);
            TextoMod.imprimirConDelay("3. Mostrar Inventario",TextoMod.verde , 10);

            int caj = sc.nextInt();

            if (caj == 1){

                Inventario.itemsToInv("Fusion core");
                return;

            }else if(caj == 2){

                TextoMod.imprimirConDelay("Decides dejar atras los contenedores y sigues avanzando hacia el complejo abandonado",TextoMod.azul , 10);
                return;
            } else if (caj ==3) {
                Inventario.mostrarInv();
            }else {
                TextoMod.imprimirConDelay("Esa elección no está disponible, escriba 1 o 2 para elegir",TextoMod.azul , 10);
            }
        }
    }

    public static void elij2(){

        System.out.println("--- Las puertas estan selladas de cal a canto ---");

        while (true){

            TextoMod.imprimirConDelay("\n¿Qué deseas hacer? 1/2",TextoMod.verde , 10);
            TextoMod.imprimirConDelay("1. Intentar forzar la puerta principal con fuerza bruta.",TextoMod.verde , 10);
            TextoMod.imprimirConDelay("2. Buscar un panel de control o acceso alternativo alrededor del complejo.",TextoMod.verde , 10);
            TextoMod.imprimirConDelay("3. Mostrar Inventario",TextoMod.verde , 10);

            int puert = sc.nextInt();

            if (puert==1){

                TextoMod.imprimirConDelay("Te haces daño al intentar abrirlo por la fuerza",TextoMod.verde , 10);
                VidaYPersonaje.recibirDano(3);

                VidaYPersonaje.karma--;
                return;

            }else if (puert==2){

                VidaYPersonaje.karma++;
                Historia.escExt();

                return;
            }else if (puert == 3){
                Inventario.mostrarInv();
            }

        }

    }

    public static void facciones() {
        System.out.println("¿Qué facción te interesara?");
        System.out.println("1. Unirse a la Hemandad del Acero.");
        System.out.println("2. Unirse a la Legión de Cesar");

        while (true) {
            int eleccion = sc.nextInt();

            switch (eleccion) {
                case 1 -> {
                    System.out.println("Te has unido a la Hermandad del Acero");
                    VidaYPersonaje.karma+=2;
                    unirFacc = 1;
                    Seleccion.eleccFinal();
                    return;
                }
                case 2 -> {
                    System.out.println("Te has unido a la Legión de Cesar");
                    VidaYPersonaje.karma-=2;
                    unirFacc = 2;
                    Seleccion.eleccFinal();
                    return;
                }

            }
            if (eleccion > 2) {
                System.out.println("Elije un numero del 1 al 2 porfavor");

            }

        }

    }

    public static void elec3(){

        System.out.print("-->");
        String str = sc.next();

        while (true){

            if (str.equals("1")){

                TextoMod.imprimirConDelay("Tras llegar a la plaza te encuentras con un grupo de reclutadores de dos facciones distintas",TextoMod.azul , 10);

                facciones();
                return;
            }else if(str.equals("2")){

                TextoMod.imprimirConDelay("Cruzas por los callejones evitando la plaza principal." +
                        "\nTras caminar un rato te giras para ver como hay dos grupos de reclutadores en la plaza principal",TextoMod.azul , 10);

                TextoMod.imprimirConDelay("¿Quieres dar la vuelta e intentar unirte a una facción?" +
                        "\n1.Si \n2.No",TextoMod.verde , 10);
                System.out.print("-->");

                String strs = sc.next();

                while (true){

                    if (strs.equalsIgnoreCase("si")||strs.equals("1")){

                        facciones();
                        return;
                    }else if(strs.equalsIgnoreCase("no")||strs.equals("2")){

                        FinalNeutro.historiaNeutra();
                        return;

                    }

                }

            }

        }

    }

    public static void elecNeutro1(){

        TextoMod.imprimirConDelay("¿Qué quieres hacer?" +
                "\n1.Seguir el mapa hasta el silo \n2.Ignorar el mapa",TextoMod.verde , 10);

        System.out.println("-->");
        String strs = sc.next();

        while (true){

            if(strs.equals("1")){


                return;

            }else if(strs.equals("2")){

                TextoMod.imprimirConDelay("Decides ignorar el mapa del silo y seguir con tu camino para salir del yermo." +
                        "\nEn tu camino para salir del yermo te cruzarias con unos bandidos que intentan atacarte," +
                        "\nconsigues escabullirte pero acabas malherido pero sigues adelante con la esperanza de salir del yermo." +
                        "\n...\nTras varios kilometros y un cuerpo cada vez más debil pierdes la esperanza poco a poco hasta que" +
                        "\ntu cuerpo deja de funcionar y te acabas dando cuenta que el yermo no tiene fin",TextoMod.azul , 10);

                VidaYPersonaje.recibirDano(VidaYPersonaje.hp);

                return;
            }

        }

    }

    public static void elecNeutro2(){

        TextoMod.imprimirConDelay("--- Se te presentan dos opciónes ---\n1.Robar los codigos nucleares\n2.Saquear la armeria",TextoMod.verde , 10);

        int e = 0;

        while (true) {
            try {
                System.out.println("-->");
                e = sc.nextInt();
            }catch (InputMismatchException c){

                System.out.println("Opción invalida, eliga entre 1/2");

            }
            switch (e) {

                case 1 ->{TextoMod.imprimirConDelay("Decides robar los codigos",TextoMod.verde , 10);return;}
                case 2 ->{TextoMod.imprimirConDelay("Decides saquear la armeria",TextoMod.verde , 10);elecNeutro3();return;}
                case 3 ->{System.out.println("Elección no disponible");}

            }

        }

    }

    public static void elecNeutro3(){

        TextoMod.imprimirConDelay("Al entrar en la armeria te encontrarias que todo el equipamiento esta roto menos un par " +
                "de estimulantes. ",TextoMod.azul , 10);
        Inventario.itemsToInv("Estimulantes");
        Inventario.itemsToInv("Estimulantes");

        TextoMod.imprimirConDelay("=== ¿Quieres curarte? ===\n1.Si\n2.No",TextoMod.verde , 10);
        String str = sc.next();

        if(str.equalsIgnoreCase("si")||str.equals("1")){

            ItemCurar.cur();

        }
        

        TextoMod.imprimirConDelay("\nSientes una presencia detras tuya",TextoMod.azul , 10);

            Combate.cbt();

        TextoMod.imprimirConDelay("\nTu combate a causado mucho ruido. ¿Qué quieres hacer? \n1.Huir \n2.Quedarte y combatir",TextoMod.verde , 10);

        int b = rdr.nextInt(2);
        int e = 0;
        while(true){
            try {

                System.out.print("-->");
                e = sc.nextInt();

            }catch (InputMismatchException a){

                System.out.println("Input erroneo");
                System.out.println("Vuelve a intentarlo");

            }

            if (e==1){

                return;

            } else if (e==2) {

                Combate.cbt(b);
                return;
            }
        }


    }

}