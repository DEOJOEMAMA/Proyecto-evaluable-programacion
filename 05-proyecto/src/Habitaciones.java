import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Habitaciones {
    public static String[] apuestas = {"Estimulantes","Balas pistola", "Balas rifle" };
    public static int[] negro ={2, 17, 6, 13, 11, 8, 10, 24, 33, 20, 31, 22, 29, 28, 35, 26 };
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
        int rand = r.nextInt(2);
        if (rand == 0) {
            System.out.println("No encuntas nada por el camino");
            return;
        } else {
            System.out.println("Te encuentra una casa por el camino\n" +
                    "¿quieres entrar?");
            System.out.println("1. Sí");
            System.out.println("2. No");

            while (true) {
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
            System.out.println("1. Tratar de abrir la puerta");
            System.out.println("2. Investigar");
            System.out.println("3. Salir de la casa");
            int a = sc.nextInt();
            while(true) {

                if (a > 3) {
                    System.out.println("Porfavor di un numero del 1 al 3");

                }
                if (a == 1) {
                    boolean ganar = Ahorcado.jugarAhorcado();
                    if (ganar) {
                        System.out.println("Consiges abrir la puerta");
                        ItemsYcajas.cajas();
                        System.out.println("Vuelves a la sala inicial");
                        break;
                    }
                } else if (a == 2) {
                    Eleccion.elij();
                    contadorInvest++;
                    break;
                } else if (a == 3) {
                    System.out.println("Sales de la casa y prosigues con tu camino");
                    return;
                }
            }

             while (true){
                 System.out.println("1. Investigar");
                 System.out.println("2. Salir de la casa");
                 int b = sc.nextInt();
                if (b > 3) {
                    System.out.println("Porfavor di un numero del 1 al 3");
                }
                if (b == 1) {
                    if(contadorInvest == 0) {
                        Eleccion.elij();
                        contadorInvest++;
                    }else{
                        System.out.println("Ya has investigado aqui");
                    }
                } else if (b == 2) {
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
        System.out.println("Has encontrado un casino abierto y funcional");
        System.out.println("Quieres entrar");
        while (true) {
            String elij = sc.next();

            if (elij.equalsIgnoreCase("1") || elij.equalsIgnoreCase("si")) {

                System.out.println("Entras al casino");
                en();
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
            int a =sc.nextInt();
            if (a >=3) {
                System.out.println("Porfavor di un numero del 1 al 3");
            }
            if (a == 1) {
                System.out.println("Vas a jugar al black jack");
            }else if (a == 2) {
                System.out.println("Vas a jugar a la ruleta");
                ruleta();
            }else{
                System.out.println("Sales del casino");
                return;
            }
        }

    }
    public static void apostar(){
       
    }
    public static void ruleta(){
        int numero = r.nextInt(37);
        if (numero == 0) {
            
        } else if (negro.equals(numero)) {

        }else{

        }
        System.out.println("¿Quieres seguir jugando?");
    }
    public static void habitacion2(){

    }
}
