import java.util.Scanner;

public class Inventario {

    public static String[] inventory = new String[10];

    public static int itemCount=0; //variable de clase

    public static void itemToInv(String objeto){

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres guardarte el item? Si/No"); //COMPRUEBA SI TE QUIERES QUEDAR EL ITEM

        String resp = sc.next();

        if (resp.equalsIgnoreCase("si")){ //EN CASO DE QUE LA RESPUESTA SEA UN SI, IGNORA LAS MAYÚSCULAS, MINÚSCULAS O ACENTOS
            // Y COMPRUEBA SI EL STRING resp ES UN SI

            if(itemCount<inventory.length){ // EN CASE DE QUE SI OCURRA, SE COMPRUEBA SI LA CANTIDAD DE ITEMS ("itemCount") ES MENOR AL MAXIMO TAMAÑO
                                            // DEL INVENTARIO

                inventory[itemCount] = objeto; // GUARDA DENTRO DEL ARRAY inventory EL OBJETO. EL VALOR DEL STRING objeto SE DECLARA EN EL JAVA CLASS ItemsYcajas
                itemCount++;

                System.out.println("Has añadido el objeto a tu inventario");

            }else {

                System.out.println("Tu inventario está lleno");

            }

        }

    }
    public static void itemsToInv(String objeto){

        if(itemCount<inventory.length){ // EN CASE DE QUE SI OCURRA, SE COMPRUEBA SI LA CANTIDAD DE ITEMS ("itemCount") ES MENOR AL MAXIMO TAMAÑO
            // DEL INVENTARIO

            inventory[itemCount] = objeto; // GUARDA DENTRO DEL ARRAY inventory EL OBJETO. EL VALOR DEL STRING objeto SE DECLARA EN EL JAVA CLASS ItemsYcajas
            itemCount++;

            System.out.println("Has añadido " + objeto + " a tu inventario");

        }else {

            System.out.println("Tu inventario está lleno");

        }

    }

    public static void mostrarInv(){
        System.out.println("\033[32m=== Tu inventario actual ===\033[32m");
        for (int i = 0; i< inventory.length; i++){

            System.out.println(i+"." + " "+ inventory[i]);

        }

    }

    // Devuelve la posición del objeto, o -1 si no está
    public static int buscarItem(String nombre){
        for (int i = 0; i < itemCount; i++){
            if (inventory[i].equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }

    public static boolean tieneItem(String nombre){
        return buscarItem(nombre) != -1;
    }
    // Quita el objeto del inventario. Devuelve true si lo había
    public static boolean usarItem(String nombre){
        int pos = buscarItem(nombre);
        if (pos == -1){
            return false;
        }
        // desplaza los siguientes una posición a la izquierda para no dejar huecos
        for (int i = pos; i < itemCount - 1; i++){
            inventory[i] = inventory[i + 1];
        }
        inventory[itemCount - 1] = null;
        itemCount--;
        return true;
    }


}
