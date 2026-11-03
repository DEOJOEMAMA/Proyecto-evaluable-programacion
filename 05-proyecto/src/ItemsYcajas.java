import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ItemsYcajas {

    public static String[] items = {"Rifle de palanca", "Pistola Chatarra", "M16", "AK74", "Palanca", "Cuchillo", "Lanza",
                "Fusion Core", "Balas pistola", "Balas rifle", "Enemigo", "Servo Armadura"}; // CREO UNA VARIABLE DE CLASE STRING[] PARA QUE PUEDA FUNCIONAR DENTRO
                                                                                            // EN LAS OTRAS DOS FUNCIONES

    //EXCLUIR AL INVESTIGAR CAJAS O ARMARIOS, NO ES POSIBLE ENCONTRAR UNA SERVOARMADURA EN UNA CAJA

    public static void item(){

        System.out.println("Primer item disponible "+ items[0]);

    }

    public static void cajas(){
        Random rdm = new Random();

        int randCaj = rdm.nextInt(3);
        int rand = rdm.nextInt(11); // NÚMERO RANDOM HASTA EL 11


        if (randCaj!=2){

            if(rand == 10){ // EL IF COMBPRUEBA QUE LA VARIABLE RAND SAQUE UN 10 PARA QUE INICIE EL COMBATE CON EL ENEMIGO

                System.out.println( "¡Ha aparecido un" + items[10] + "!"+ " ¡Te ves envuelto en un combate!\n");

                Combate.cbt();

            }else{

                String itemencontrado = items[rand];

                System.out.println("---- Has encontrado "+ itemencontrado + " ----");

                Inventario.itemToInv(itemencontrado);
            }

        }else if (randCaj==2){
            System.out.println("Es una caja fuerte, para abrirla se iniciará un minijuego de ahorcado");
            boolean ganado = Ahorcado.jugarAhorcado();

            if(ganado==true){

                int rng = rdm.nextInt(10);

                    String itemencontrado = items[rng];

                    System.out.println("---- Has encontrado "+ itemencontrado + " ----");

                    Inventario.itemToInv(itemencontrado);
                }

            }

       }

       public class itemCurar {

           public static String[] itemcur = {"Carne ratatopo", "Estimulante", "Nuka cola"};
           public static int[] hp = {5, 90, 20};

           public static int elegircur(Scanner sc) {

               int[] disponibles = new int[itemcur.length];
               int n = 0;

                for(int i = 0;i<itemcur.length;i++) {

                   if (Inventario.tieneItem(itemcur[i])) {
                       disponibles[n] = i;
                       n++;
                   }

                    for (int j = 0; j < n; j++){
                        int a = disponibles[j];

                        String info = "";

                        System.out.println((j + 1) + ". " + itemcur[a] + info +  hp[a]+" + pv ");

                    }

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

           public static boolean cur() {
               Scanner sc = new Scanner(System.in);
               int itemEleg = 0;

               // 1. Llamamos al menú y obtenemos el índice del ítem seleccionado
               itemEleg = elegircur(sc);

               // 2. Controlamos si el usuario decidió volver o hubo un error (-1)
               if (itemEleg == -1) {
                   System.out.println("No se ha seleccionado ningún objeto de curación.");
                   return false; // Salimos del metodo de forma segura
               }

               // 3. Ahora sí es seguro obtener los puntos de vida a curar
               int vid = hp[itemEleg];
               String nombreItem = itemcur[itemEleg];

               System.out.println("Has usado " + nombreItem + " y recuperas " + vid + " PV.");

               VidaYPersonaje.curarVida(vid);

               System.out.println("HP: " + VidaYPersonaje.hp + " / " + VidaYPersonaje.hpMax);
               // Aquí puedes añadir tu lógica para sumarle 'vid' a la salud actual de tu personaje,
               // por ejemplo usando Math.min(vidaMax, vidaActual + vid) para no pasarte del límite.

               return true;
           }

       }

}

