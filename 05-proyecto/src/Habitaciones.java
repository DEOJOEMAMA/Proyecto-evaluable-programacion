
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
            TextoMod.imprimirConDelay("No encuntas nada por el camino", TextoMod.azul,0);
            return;
        } else {
            TextoMod.imprimirConDelay("Te encuentra una casa por el camino\n" +
                    "¿Quieres entrar?", TextoMod.azul, 15);
            while (true) {
                TextoMod.imprimirConDelay("1. Sí", TextoMod.verde, 0);
                TextoMod.imprimirConDelay("2. No", TextoMod.verde, 0);
                String elij = sc.next();

                if (elij.equalsIgnoreCase("1") || elij.equalsIgnoreCase("si")) {

                    TextoMod.imprimirConDelay("Entras en la casa", TextoMod.azul, 0);
                    en();
                    break;

                } else if (elij.equalsIgnoreCase("2") || elij.equalsIgnoreCase("no")){
                    return;

                }


            }
            TextoMod.imprimirConDelay("Lo unico que encuentras a primera vista es una puerta que parece estar cerrada ¿Que quieres hacer?", TextoMod.azul, 15);
            while(true) {
                TextoMod.imprimirConDelay("1. Tratar de abrir la puerta", TextoMod.verde, 0);
                TextoMod.imprimirConDelay("2. Investigar", TextoMod.verde, 0);
                TextoMod.imprimirConDelay("3. Salir de la casa", TextoMod.verde, 0);
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
                    TextoMod.imprimirConDelay("No hay nada mas que hacer dentro", TextoMod.azul, 0);
                } else if (a == 1) {
                    boolean ganar = Ahorcado.jugarAhorcado();
                    if (ganar) {
                        TextoMod.imprimirConDelay("Consiges abrir la puerta", TextoMod.azul, 0);
                        ItemsYcajas.cajas();
                        contadorEntrada++;
                        while (true) {
                            TextoMod.imprimirConDelay("1. salir del cuarto",TextoMod.verde, 0);
                            TextoMod.imprimirConDelay("2. Investigar", TextoMod.verde, 0);
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
                                TextoMod.imprimirConDelay("Sales del cuarto", TextoMod.azul, 0);
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
                    TextoMod.imprimirConDelay("Sales de la casa y prosigues con tu camino", TextoMod.azul,  15);
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
            TextoMod.imprimirConDelay("No encuntas nada por el camino", TextoMod.azul,0);            return;
        } else {
            TextoMod.imprimirConDelay("--Has encontrado un casino abierto y funcional--", TextoMod.morado, 15);
            TextoMod.imprimirConDelay("¿Quieres entrar?", TextoMod.verde, 0);
            TextoMod.imprimirConDelay("1. Sí", TextoMod.verde, 0);
            TextoMod.imprimirConDelay("2. No", TextoMod.verde, 0);        }
        while (true) {
            String elij = sc.next();
            if (elij.equalsIgnoreCase("1") || elij.equalsIgnoreCase("si")) {

                TextoMod.imprimirConDelay("Entras al casino", TextoMod.morado, 15);
                break;

            } else if (elij.equalsIgnoreCase("2") || elij.equalsIgnoreCase("no")){
                return;
            }
        }
        TextoMod.imprimirConDelay("Al entrar, lo que ves es una mesa de black jack y una ruleta", TextoMod.morado, 15);
        while (true) {
            TextoMod.imprimirConDelay("1. Jugar black jack",TextoMod.verde, 0);
            TextoMod.imprimirConDelay("2. Jugar a la ruleta",TextoMod.verde, 0);
            TextoMod.imprimirConDelay("3. Salir del casino", TextoMod.verde, 0);
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
                TextoMod.imprimirConDelay("Vas a jugar al black jack", TextoMod.morado, 15);
                    apost = Apostar.apostar1();
                    if (apost == true){
                        int result = Blackjack.bj();
                        Apostar.apostar2(result);
                    }else {
                        return;
                    }

                while (true) {
                    TextoMod.imprimirConDelay("¿Quieres seguir jugando?", TextoMod.verde, 0);
                    TextoMod.imprimirConDelay("1. Sí", TextoMod.verde, 0);
                    TextoMod.imprimirConDelay("2. No",TextoMod.verde,0);
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
                TextoMod.imprimirConDelay("Vas a jugar a la ruleta", TextoMod.morado, 15);
                apost = Apostar.apostar1();
                if (apost == true){
                    int result = Ruleta.ruleta();
                    Apostar.apostar2(result);
                }else {
                    return;
                }
                while (true) {
                    TextoMod.imprimirConDelay("¿Quieres seguir jugando?", TextoMod.verde, 0);
                    TextoMod.imprimirConDelay("1. Sí", TextoMod.verde, 0);
                    TextoMod.imprimirConDelay("2. No",TextoMod.verde,0);
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
                TextoMod.imprimirConDelay("Sales del casino", TextoMod.verde, 15);
                return;
            }
        }
    }
    public static void habitacion2(){
        int rand = r.nextInt(2);
        if (rand == 0) {
            TextoMod.imprimirConDelay("No encuntas nada por el camino", TextoMod.azul,0);            return;
        } else {
            TextoMod.imprimirConDelay("Te encuentra una casa por el camino\n" +
                    "¿Quieres entrar?", TextoMod.azul, 15);
            while (true) {
                TextoMod.imprimirConDelay("1. Sí", TextoMod.verde, 0);
                TextoMod.imprimirConDelay("2. No",TextoMod.verde,0);
                String elij = sc.next();

                if (elij.equalsIgnoreCase("1") || elij.equalsIgnoreCase("si")) {

                    TextoMod.imprimirConDelay("Entras en la casa", TextoMod.azul, 15);
                    en();
                    break;

                } else if (elij.equalsIgnoreCase("2") || elij.equalsIgnoreCase("no")) {
                    return;

                }
            }
        }
        TextoMod.imprimirConDelay("Al entrar a la casa lo unico que resaltan son unas escaleras para subir arriva.\n" +
                "No hay puertas, solo una escalera ¿Que quieres hacer?", TextoMod.azul, 15);
        int elij = 0;
        int elij2 = 0;
        int contInv = 0;
        int contInv2 = 0;
        int contSubi = 0;
        while(true){
            TextoMod.imprimirConDelay("1. Subir las escaleras", TextoMod.verde, 0);
            TextoMod.imprimirConDelay("2. Investigar ",TextoMod.verde, 0);
            TextoMod.imprimirConDelay("3. Salir", TextoMod.verde, 0);

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
                TextoMod.imprimirConDelay("Subes las escaleras", TextoMod.azul, 0);
                Combate.cbt();
                TextoMod.imprimirConDelay("Por desgracia el enemigo no estaba defendiendo nada interesante, es un lugar decepcionante", TextoMod.azul, 15);
                contSubi++;
                while (true) {
                    TextoMod.imprimirConDelay("1. Bajar", TextoMod.verde, 0);
                    TextoMod.imprimirConDelay("2. Investigar", TextoMod.verde, 0);
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
                        TextoMod.imprimirConDelay("Vuelves abajo", TextoMod.azul, 15);
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
                TextoMod.imprimirConDelay("Sales de la casa y prosigues con tu camino", TextoMod.azul, 15);
                return;

            }
        }

    }
}
