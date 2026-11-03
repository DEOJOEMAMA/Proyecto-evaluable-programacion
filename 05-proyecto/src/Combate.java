import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Combate {

    public static String[] armas =        {"Pistola Chatarra", "Rifle de palanca", "M16",         "AK74",         "Palanca", "Cuchillo", "Lanza", "Puños"};
    public static String[] municionArma = {"Balas pistola",    "Balas rifle",      "Balas rifle", "Balas rifle",  "",        "",         "",      ""};
    public static int[] danoArma =        {20,                 35,                 30,            30,             15,        12,         18,      5};

    public static int elegirArma(Scanner sc) {
        int[] disponibles = new int[armas.length];
        int n = 0;

        for (int i = 0; i < armas.length; i++) {
            if (armas[i].equals("Puños") || Inventario.tieneItem(armas[i])) {
                disponibles[n] = i;
                n++;
            }
        }
        System.out.println("¿Con qué quieres atacar?");
        for (int j = 0; j < n; j++){
            int a = disponibles[j];
            String info = "";
            if (!municionArma[a].isEmpty() && !Inventario.tieneItem(municionArma[a])){
                info = " (te faltan " + municionArma[a] + ")";
            }
            System.out.println((j + 1) + ". " + armas[a] + info + " - daño " + danoArma[a]);
        }
        System.out.println("0. Volver");
        System.out.print("-->");

        try {
            int op = sc.nextInt();
            if (op >= 1 && op <= n){
                return disponibles[op - 1];
            }
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println("Eso no es una opción.");
        }
        return -1;
    }
    public static boolean cbt(){
        Scanner sc=new Scanner(System.in);
        Random rnd = new Random();

        //Lista de acciones del jugador
        String acciones[] = new String[3];
        acciones[0] = "Atacar";
        acciones[1] = "Defender";
        acciones[2] = "Huir";

        //Lista de acciones del enemigo
        String accionesE[] = new String[3];
        accionesE[0] = "Ataca";
        accionesE[1] = "Esquiva";
        accionesE[2] = "Ataca pero Falla";

        //Lista de enemigos
        String enemigosL[] = new String[3];
        enemigosL[0] = "Necrofago";
        enemigosL[1] = "Ratatopo";
        enemigosL[2] = "Supermutante";

        boolean ganar = false;
        int enemigoN = 0;
        int accionP = 0;
        boolean accionPC = false;
        int accionE = 0;
        int enemigoMaxHp = 100;
        int enemigoHp = 0;
        int armaElegida = 0;

        enemigoN = rnd.nextInt(3);
        if (enemigoN == 0){
            enemigoMaxHp = 85;
            enemigoHp = enemigoMaxHp;
        } else if (enemigoN == 1) {
            enemigoMaxHp = 80;
            enemigoHp = enemigoMaxHp;
        }else {
            enemigoMaxHp = 120;
            enemigoHp = enemigoMaxHp;
        }

        String enemigo = enemigosL[enemigoN];

        System.out.println("¡"+enemigo+" apareció!");
        System.out.println(enemigo + " tiene " +enemigoMaxHp+" HP");

        while (enemigoHp > 0){
            accionPC = false;
            accionE = rnd.nextInt(3);
            while (accionPC == false) {

                System.out.println("HP: " + VidaYPersonaje.hp + " / " + VidaYPersonaje.hpMax);
                System.out.println("Elija que acción hará (1-3)");
                System.out.println("1. " + acciones[0]);
                System.out.println("2. " + acciones[1]);
                System.out.println("3. " + acciones[2]);
                System.out.print("-->");

                try {
                    accionP = sc.nextByte();
                    System.out.println("\nHas elegido " + accionP);
                } catch (InputMismatchException e) {
                    System.out.println("Eso no es una acción.");
                    sc.nextLine();
                    continue; //Vuelve a pedirte una acción
                }
                if (accionP == 1) {
                    armaElegida = elegirArma(sc);
                        if (armaElegida == -1) {
                            continue; // volvió atrás
                        }
                        // necesita el cartucho en la mochila, pero no se gasta
                        if (!municionArma[armaElegida].isEmpty() && !Inventario.tieneItem(municionArma[armaElegida])) {
                            System.out.println("No tienes " + municionArma[armaElegida] + " para esa arma.");
                            continue; // vuelve al menú sin gastar turno//
                        }
                    accionPC = true;
                } else if (accionP == 2) {

                    if (!VidaYPersonaje.servoArmadura) {
                        System.out.println("No tienes una Servo Armadura.");
                        continue; // vuelve al menú sin gastar turno//
                    }
                    if (VidaYPersonaje.armaduraActiva) {
                        System.out.println("La Servo Armadura ya está activa");
                        continue;
                    }
                    if (!Inventario.tieneItem("Fusion Core")) {
                        System.out.println("Necesitas un Fusion Core para activar la Servo Armadura.");
                        continue;
                    }
                    VidaYPersonaje.armaduraActiva = true;
                    Inventario.usarItem("Fusion Core"); // se consume al activarla
                    System.out.println("Insertas el Fusion Core. ¡La Servo Armadura se activa!");
                    accionPC = true;

                } else if (accionP == 3) {
                    int esc = rnd.nextInt(2);
                    if (esc == 1) {
                        System.out.println("Escapaste exitosamente, pero no conseguiste nada");
                        ganar = false;
                        return ganar;
                    } else {
                        System.out.println("No conseguiste escapar");
                        accionPC = true;
                    }
                }
            }
            if (accionP == 1) {
                if (accionE == 1) { // el enemigo esquiva
                    System.out.println(enemigo + " esquiva tu ataque. ¡Fallaste!");
                } else {
                    int dano = danoArma[armaElegida];

                    if (rnd.nextInt(100) > 90) {
                        System.out.println("¡Acertaste un golpe crítico!");
                        dano = dano + 10;
                    }

                    enemigoHp = enemigoHp - dano; // aquí baja la vida del enemigo
                    System.out.println("¡" + enemigo + " recibió " + dano + " de daño!");
                    System.out.println(enemigo + ": " + Math.max(0, enemigoHp) + " / "+ enemigoMaxHp + " HP");
                }
            }

            if (enemigoHp <= 0) {
                System.out.println("\n¡Has derrotado a " + enemigo + "!");
                ganar = true;
                return ganar;
            }
            if (accionE == 0) { // Ataca
                if (VidaYPersonaje.armaduraActiva) {
                    System.out.println("¡La Servo Armadura absorbe todo el golpe!");
                    VidaYPersonaje.armaduraActiva = false;
                } else {
                    System.out.print(enemigo + " te golpea. ");
                    VidaYPersonaje.recibirDano(20);
                }
            }else if (accionE == 1) {
                System.out.println(enemigo + " esquiva.");
            } else {
                System.out.println(enemigo + " ataca, ¡pero falla!");
            }
        }
        return ganar;
    }
}
