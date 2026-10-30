import java.util.Random;

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

                System.out.println( "¡Ha aparecido un" + items[10] + "!"+ " ¡Te ves envuelto en un combate!");

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

}

