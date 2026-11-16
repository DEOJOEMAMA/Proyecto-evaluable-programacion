
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Habitaciones {
    public static boolean apost = false;
   public static Random r = new Random();
   public static Scanner sc = new Scanner(System.in);
   public static void habitaciones(){
       int rand = r.nextInt(3);
       switch(rand){
           case 0 -> habitacion1();
           case 1 -> casino();
           case 2 -> habitacion2();
       }
   }
    public static void habitacion1() {
        int contadorInvest = 0;
        int contadoInvest2 = 0;
        int contadorEntrada = 0;
        int rand = r.nextInt(2);
        if (rand == 0) {
            System.out.println("No encuntas nada por el camino");
            return;
        } else {
            System.out.println("Te encuentra una casa por el camino\n" +
                    "¿quieres entrar?");
            while (true) {
                System.out.println("1. Sí");
                System.out.println("2. No");
                String elij = sc.next();

                if (elij.equalsIgnoreCase("1") || elij.equalsIgnoreCase("si")) {

                    System.out.println("Entras en la casa");
                    en();
                    break;

                } else if (elij.equalsIgnoreCase("2") || elij.equalsIgnoreCase("no")){
                    return;

                }


            }
            System.out.println("Lo unico que encuentras a primera vista es una puerta que parece estar cerrada, que quieres hacer");
            while(true) {
                System.out.println("1. Tratar de abrir la puerta");
                System.out.println("2. Investigar");
                System.out.println("3. Salir de la casa");
                int a = 0;
                try {
                    a = sc.nextInt();
                }catch(InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("Por favor ingrese un numero del 1 al 3");
                }

                if (a > 3) {
                    System.out.println("Porfavor ingresa un numero del 1 al 3");

                }
                if (a == 1 && contadorEntrada>0) {
                    System.out.println("No hay nada mas que hacer dentro");
                } else if (a == 1) {
                    boolean ganar = Ahorcado.jugarAhorcado();
                    if (ganar) {
                        System.out.println("Consiges abrir la puerta");
                        ItemsYcajas.cajas();
                        contadorEntrada++;
                        while (true) {
                            System.out.println("1. salir del cuarto");
                            System.out.println("2. Investigar");
                            int elij2 = 0;
                            try {
                                elij2 = sc.nextInt();
                            }catch(InputMismatchException e) {
                                sc.nextLine();
                                System.out.println("Por favor ingrese un numero del 1 al 2");
                            }
                            if (elij2 > 2) {
                                System.out.println("Por favor ingresa un numero del 1 al 2");
                            }
                            if (elij2 == 1) {
                                System.out.println("Sales del cuarto");
                                break;
                            }else if (elij2 == 2&& contadoInvest2 >0) {
                                System.out.println("Ya has investigado aqui");
                            }else if (elij2 == 2) {
                                Eleccion.elij();
                                contadoInvest2++;
                            }
                        }
                    }
                } else if (a == 2 && contadorInvest >0) {
                    System.out.println("Ya has investigado aqui");
                }else if (a == 2) {
                    Eleccion.elij();
                    contadorInvest++;
                }else if (a == 3) {
                    System.out.println("Sales de la casa y prosigues con tu camino");
                    return;
                }
            }
        }
    }
        public static void en () {
            int enemigos = r.nextInt(2);
            if (enemigos == 0) {
                Combate.cbt();
            } else {
                System.out.println("No encuentras ningun enemigo en el interior");
            }
        }

    public static void casino(){
        int rand = r.nextInt(2);
        int a = 0;
        if (rand == 0) {
            System.out.println("No encuntas nada por el camino");
            return;
        } else {
            System.out.println("Has encontrado un casino abierto y funcional");
            System.out.println("¿Quieres entrar?");
            System.out.println("1. Sí");
            System.out.println("2. No");
        }
        while (true) {
            String elij = sc.next();
            if (elij.equalsIgnoreCase("1") || elij.equalsIgnoreCase("si")) {

                System.out.println("Entras al casino");
                break;

            } else if (elij.equalsIgnoreCase("2") || elij.equalsIgnoreCase("no")){
                return;
            }
        }
        System.out.println("Al entrar, lo que ves es una mesa de black jack y una ruleta");
        while (true) {
            System.out.println("1. Jugar black jack");
            System.out.println("2. Jugar a la ruleta");
            System.out.println("3. Salir del casino");
            try {
                a = sc.nextInt();
            }catch(InputMismatchException e) {
                sc.nextLine();
                System.out.println("Por favor ingrese un numero del 1 al 3");
            }
            if (a >3) {
                System.out.println("Por favor ingresa un numero del 1 al 3");
            }
            if (a == 1) {
                System.out.println("Vas a jugar al black jack");
                    apost = Apostar.apostar1();
                    if (apost == true){
                        int result = Blackjack.bj();
                        Apostar.apostar2(result);
                    }else {
                        return;
                    }

                while (true) {
                    System.out.println("¿Quieres seguir jugando?");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    String elij = sc.next();
                    if (elij.equalsIgnoreCase("1") || elij.equalsIgnoreCase("si")) {
                        apost = Apostar.apostar1();
                        if (apost == true){
                            int result = Blackjack.bj();
                            Apostar.apostar2(result);
                        }else {
                            return;
                        }
                    } else if (elij.equalsIgnoreCase("2") || elij.equalsIgnoreCase("no")){
                        break;
                    }
                }

            }else if (a == 2) {
                System.out.println("Vas a jugar a la ruleta");
                apost = Apostar.apostar1();
                if (apost == true){
                    int result = Ruleta.ruleta();
                    Apostar.apostar2(result);
                }else {
                    return;
                }
                while (true) {
                    System.out.println("¿Quieres seguir jugando?");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    String elij = sc.next();
                    if (elij.equalsIgnoreCase("1") || elij.equalsIgnoreCase("si")) {
                        apost = Apostar.apostar1();
                        if (apost == true){
                            int result = Ruleta.ruleta();
                            Apostar.apostar2(result);
                        }else {
                            return;
                        }
                    } else if (elij.equalsIgnoreCase("2") || elij.equalsIgnoreCase("no")){
                        break;
                    }
                }
            }else if (a ==3){
                System.out.println("Sales del casino");
                return;
            }
        }
    }
    public static void habitacion2(){
        int rand = r.nextInt(2);
        if (rand == 0) {
            System.out.println("No encuntas nada por el camino");
            return;
        } else {
            System.out.println("Te encuentra una casa por el camino\n" +
                    "¿quieres entrar?");
            while (true) {
                System.out.println("1. Sí");
                System.out.println("2. No");
                String elij = sc.next();

                if (elij.equalsIgnoreCase("1") || elij.equalsIgnoreCase("si")) {

                    System.out.println("Entras en la casa");
                    en();
                    break;

                } else if (elij.equalsIgnoreCase("2") || elij.equalsIgnoreCase("no")) {
                    return;

                }
            }
        }
        System.out.println("Al entrar a la casa lo unico que resaltan son unas escaleras para subir arriva.\n" +
                "No hay puertas, solo una escalera ¿Que quieres hacer?");
        int elij = 0;
        int elij2 = 0;
        int contInv = 0;
        int contInv2 = 0;
        int contSubi = 0;
        while(true){
            System.out.println("1. Subir las escaleras");
            System.out.println("2. Investigar ");
            System.out.println("3. Salir");

            try{
                elij = sc.nextInt();

            }catch(InputMismatchException e){
                sc.nextLine();
                System.out.println("Por favor ingrese un numero del 1 al 3");
            }
            if (elij > 3) {
                System.out.println("Por favor ingresa un numero del 1 al 3");
            }
            if(elij == 1 && contSubi>0){
                System.out.println("No hay nada mas que hacer arriva");
            }else if (elij == 1){
                System.out.println("Subes las escaleras");
                Combate.cbt();
                System.out.println("Por desgracia el enemigo no estaba defendiendo nada interesante, es un lugar decepcionante");
                contSubi++;
                while (true) {
                    System.out.println("1. Bajar");
                    System.out.println("2. Investigar");
                    try {
                         elij2 = sc.nextInt();
                    }catch(InputMismatchException e){
                    sc.nextLine();
                    System.out.println("Por favor ingrese un numero del 1 al 2");
                }
                    if (elij2 > 2) {
                        System.out.println("Por favor di un numero del 1 al 2");
                    }
                    if (elij2 == 1) {
                        System.out.println("Vuelves abajo");
                        break;
                    } else if (elij2 == 2 && contInv2 > 0) {
                        System.out.println("Ya has investigado aquí");
                    } else if (elij2 == 2) {
                        Eleccion.elij();
                        contInv2++;
                    }
                }
            }else if (elij == 2 && contInv>0){
                System.out.println("Ya has investigado aquí");
            } else if (elij == 2) {
                Eleccion.elij();
                contInv++;

            }else if (elij == 3) {
                System.out.println("Sales de la casa y prosigues con tu camino");
                return;

            }
        }

    }
}
