import java.util.Random;

public class ItemsYcajas {

    public static String[] items = {"Rifle de palanca", "Pistola Chatarra", "M16", "AK74", "Palanca", "Cuchillo", "Lanza",
                "Fusion Core", "Balas pistola", "Balas rifle", "Enemigo", "Servo Armadura"}; // CLASE STRING PARA QUE PUEDA FUNCIONAR EN LAS OTRAS DOS FUNCIONES

        //EXCLUIR AL INVESTIGAR CAJAS O ARMARIOS, NO ES POSIBLE ENCONTRAR UNA SERVOARMADURA EN UNA CAJA

    public static void item(){

        System.out.println("Primer item disponible "+ items[0]);

    }

    public static void cajas(){

        Random rdm = new Random();

        int rand = rdm.nextInt(11); // NÚMERO RANDOM HASTA EL 11

        if(rand == 10){ // EL IF COMBPRUEBA QUE LA VARIABLE RAND SAQUE UN 10 PARA QUE INICIE EL COMBATE CON EL ENEMIGO

            System.out.println( "¡Ha aparecido un" + items[11] + "!"+ " ¡Te ves envuelto en un combate!");

        }else{

            System.out.println( "Has encontrado " + items[rand] );

        }

    }

}
