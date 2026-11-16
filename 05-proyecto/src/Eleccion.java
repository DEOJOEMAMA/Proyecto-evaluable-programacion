import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Eleccion {

    public static Scanner sc = new Scanner(System.in);
    public static int unirFacc;
    public static Random rdr = new Random();

    public static void desviar(){
        int a = 0;
        TextoMod.imprimirConDelay("--- ¿Quieres desviarte antes de ir al objetivo principal? ---\n1.Si\n2.No\n3.Mostrar inventario", TextoMod.verde, 10);

        switch (Eleccion.respuestas()){

            case 1 -> {desviar2();}
            case 2 -> {}
            case 3 ->{Inventario.mostrarInv();desviar();}

        }

    }

    public static void desviar2(){

        TextoMod.imprimirConDelay("Te encuentras un taller cerrado que parece tener un hueco para insertar algo cilindrico",TextoMod.azul,10);

        TextoMod.imprimirConDelay("--- ¿Quieres intentar insertar un objeto cilindrico? --- \n1.Si\n2.No", TextoMod.verde, 10);

        int b = respuestas();

        if (b == 1 && Inventario.tieneItem("Fusion core")){

            TextoMod.imprimirConDelay("Tras insertar el fusion core la puerta se abriria. Tras inspeccionar dentro del taller" +
                    "\nencuentras con una servo armadura",TextoMod.azul, 10);

            Inventario.itemsToInv("Servo Armadura");



        }else {

            TextoMod.imprimirConDelay("\n Al intentar meter un objeto cilindrico incorrecto el sistema se rompería." +
                    "\nSolo pudiste conseguir un par de cables con cinta aislante.",TextoMod.azul, 10);

            Inventario.itemsToInv("Cables");
        }

    }

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

        int a =respuestas();

        while (true){
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


        while(true){

            TextoMod.imprimirConDelay("\n¿Qué deseas hacer? 1/2",TextoMod.verde , 10);
            TextoMod.imprimirConDelay("1. Buscar a fondo en las cajas metálicas.",TextoMod.verde , 10);
            TextoMod.imprimirConDelay("2. Ignorar los contenedores y seguir avanzando hacia el complejo abandonado.",TextoMod.verde , 10);
            TextoMod.imprimirConDelay("3. Mostrar Inventario",TextoMod.verde , 10);

            int b = respuestas();

            if (b == 1){

                VidaYPersonaje.karma++;
                Inventario.itemsToInv("Fusion core");
                return;
            }else if(b == 2){

                VidaYPersonaje.karma--;
                TextoMod.imprimirConDelay("Decides dejar atras los contenedores y sigues avanzando hacia el complejo abandonado",TextoMod.azul , 10);
                return;
            }
            if(b==3) {
                Inventario.mostrarInv();

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
            int b = respuestas();

            if (b==1){

                TextoMod.imprimirConDelay("Te haces daño al intentar abrirlo por la fuerza",TextoMod.verde , 10);
                VidaYPersonaje.recibirDano(3);
                VidaYPersonaje.karma--;


            }else if (b==2){

                VidaYPersonaje.karma++;
                Historia.escExt();
                return;

            }

            if (b == 3){
                Inventario.mostrarInv();
            }

        }

    }

    public static void facciones() {
        System.out.println("¿Qué facción te interesara?");
        System.out.println("1. Unirse a la Hemandad del Acero.");
        System.out.println("2. Unirse a la Legión de Cesar");

        switch (Eleccion.respuestas()) {
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
        if (Eleccion.respuestas() > 2) {

            System.out.println("Elije un numero del 1 al 2 porfavor");

            facciones();

        }



    }

    public static void elec3(){

        int b = respuestas();

        while (true){

            if (b==1){

                TextoMod.imprimirConDelay("Tras llegar a la plaza te encuentras con un grupo de reclutadores de dos facciones distintas",TextoMod.azul , 10);

                facciones();
                return;
            }else if(b==2){

                TextoMod.imprimirConDelay("Cruzas por los callejones evitando la plaza principal." +
                        "\nTras caminar un rato te giras para ver como hay dos grupos de reclutadores en la plaza principal",TextoMod.azul , 10);

                TextoMod.imprimirConDelay("¿Quieres dar la vuelta e intentar unirte a una facción?" +
                        "\n1.Si \n2.No",TextoMod.verde , 10);

                int a = respuestas();

                while (true){

                    if (a == 1 ){

                        facciones();
                        return;
                    }else if(a == 2){

                        Habitaciones.habitaciones();

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

                TextoMod.imprimirConDelay("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⠿⣷⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣶⣤⣤⣴⣿⠟⠁⠀⠈⠛⠿⣿⣿⣶⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⠀⢀⣴⣶⣇⠀⢀⣴⣿⠟⠉⠉⠙⠛⠁⠀⠀⠀⠀⠀⠀⠀⠈⠉⠻⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⢀⣿⡟⠙⢿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⠸⣿⡇⠀⠀⠀⠀⠀⢀⡴⠶⢦⣄⣀⣤⠾⠛⠛⣧⡀⠀⠀⠀⠀⠀⠀⠈⠛⢿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⢠⣿⣇⠀⠀⠀⠀⣴⠋⠀⠀⠀⠈⠉⠁⠀⠀⠀⠈⠻⣦⣤⡤⠶⠻⢿⣦⠀⠀⢻⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⢸⣿⠉⢳⣶⢶⡿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⣿⠁⠀⠀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⠘⣿⣄⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠄⠀⠀⠀⠀⢠⡼⠋⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⠀⢹⡿⠁⠀⢀⣾⡇⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡀⠀⠀⠀⠀⠀⠠⣝⢦⡀⠀⠀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⢀⣿⠇⠀⠀⠘⣿⠇⠀⠀⢀⠎⠀⠀⠀⠘⠛⠛⠿⠆⠀⠀⠀⠀⠠⣝⢧⡳⡄⣸⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⢸⣿⠀⠀⠀⠀⠀⠀⢠⡾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢢⣜⢷⣽⣷⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⢸⡏⠀⠀⠀⠀⠀⠀⢿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠆⣹⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⢸⣇⠀⠀⠀⠀⠀⠀⠈⠛⠂⠀⠀⠀⠀⢠⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⢸⣿⠀⠀⣾⣤⣀⣀⣀⢀⣀⣀⣀⡤⠔⠚⢿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⠀⣿⣇⠀⠻⠳⢤⣈⣉⠉⠉⠀⣀⣀⣤⠖⠋⠟⠀⠀⠀⠀⠀⠀⢀⣀⣠⣾⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⠀⠘⣿⣆⠀⠀⠀⠈⠙⣛⣛⠛⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⠿⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⠀⠀⠘⢿⣧⡀⠀⠀⠈⠛⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⠀⠀⠀⠈⠻⣿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⠀⠀⠀⠀⠀⠈⠙⠿⣿⣶⣦⣤⣤⣤⣤⣶⣶⣿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
                TextoMod.imprimirConDelay("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);

                VidaYPersonaje.recibirDano(VidaYPersonaje.hp);

                return;
            }

        }

    }
    public static void elecNeutroFin(){


        TextoMod.imprimirConDelay("Tras salir del silo decides seguir por tu propio camino para salir del yermo y buscar algo más alla." +
                "\nEn tu camino para salir del yermo te cruzarias con unos bandidos que intentan atacarte," +
                "\nintentas defenderte pero todo tu equipo se rompió con la explosión anterior." +
                "\nConsigues escabullirte pero acabas malherido pero sigues adelante con la esperanza de salir del yermo." +
                "\n...\nTras varios kilometros y un cuerpo cada vez más debil pierdes la esperanza poco a poco hasta que" +
                "\ntu cuerpo deja de funcionar y te acabas dando cuenta que el yermo no tiene fin",TextoMod.azul , 10);

        VidaYPersonaje.recibirDano(VidaYPersonaje.hp);

    }

    public static void elecNeutro2(){

        TextoMod.imprimirConDelay("--- Se te presentan dos opciónes ---\n1.Robar los codigos nucleares\n2.Saquear la armeria",TextoMod.verde , 10);




        switch (Eleccion.respuestas()) {

            case 1 ->{TextoMod.imprimirConDelay("Decides robar los codigos",TextoMod.verde , 10);elecNeutro22();}
            case 2 ->{TextoMod.imprimirConDelay("Decides saquear la armeria",TextoMod.verde , 10);elecNeutro3();}

        }


    }

    public static void elecNeutro22(){

        TextoMod.imprimirConDelay("La barra de descarga llega al 100%. Extraes el holodisco cifrado con los códigos maestros de lanzamiento y " +
                "\nborras el rastro del servidor para que nadie pueda rastrear el robo.", TextoMod.azul, 10);

        TextoMod.imprimirConDelay("Escapas por el túnel de evacuación de emergencia justo cuando las tropas de las otras facciones irrumpen en la sala de control vacía. " +
                "\nSubes a un vehículo de transporte todoterreno y te alejas a toda velocidad entre las dunas radiactivas antes de que nadie pueda seguirte.",TextoMod.azul,10);

        TextoMod.imprimirConDelay("Te desentiendes por completo de las guerras políticas y del destino del Yermo. Con los bolsillos repletos de chapas y un contrato cumplido con éxito, " +
                "\ncontinúas tu camino en solitario hacia nuevos horizontes, convirtiéndote en un fantasma anónimo al que nadie puede atrapar." +
                "\nFelicidades, has desbloqueado el final neutro",TextoMod.azul,10);

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
                sc.nextLine();
            }

            if (e==1){

                TextoMod.imprimirConDelay("Te precipitas hacia el túnel de mantenimiento de emergencia, esquivando las tuberías rotas mientras " +
                        "\nlas alarmas ensordecedoras del Silo Omega resuenan a tus espaldas. Escapas a toda velocidad con tu botín médico a buen recaudo " +
                        "\nantes de que el complejo sea sellado por completo.\n" +
                        "\n" +
                        "FINAL NEUTRAL: EL ERRANTE SOLITARIO (EXILIO MÉDICO)\n" +
                        "Te desentiendes por completo de la guerra política del Yermo. Con los bolsillos repletos de estimulantes valiosos y recursos médicos " +
                        "\nque escasean en todo el territorio, continúas tu camino en solitario hacia nuevos horizontes, convirtiéndote en un mercenario anónimo " +
                        "\nal que nadie puede atrapar.",TextoMod.azul,10);
                return;

            } else if (e==2) {

                TextoMod.imprimirConDelay("Te plantas firme entre los estantes vacíos de la armería, empuñando tu arma y esperando a que " +
                        "\nla siguiente oleada de enemigos cruce el umbral.",TextoMod.azul,10);

                Combate.cbt(b);

                TextoMod.imprimirConDelay("Tras un enfrentamiento brutal, logras abatir al último atacante. El silencio vuelve a reinar entre " +
                        "\nlos restos de metal oxidado de la armería." +
                        "\nFINAL NEUTRAL: EL ERRANTE SOLITARIO (LEYENDA DEL ACERO)\n" +
                        "Has demostrado que no necesitas códigos nucleares ni ejércitos para hacerte respetar. Con tus nuevas provisiones médicas y " +
                        "\nlas chapas conseguidas tras limpiar la armería, te marchas caminando tranquilamente hacia el horizonte del Yermo, dejando atrás " +
                        "\nun búnker olvidado y un rastro de leyendas.",TextoMod.azul,10);


                return;
            }
        }
    }

    public static int respuestas(){
        int a = 0;

        while (true){
            try {

                System.out.print("-->");
                a = sc.nextInt();
                return a;


            }catch (InputMismatchException e){

                sc.nextLine();
                System.out.println("Dato no apto, elija 1/2/3");

            }
        }
    }

}