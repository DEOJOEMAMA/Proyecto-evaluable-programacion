import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("==========================================================");
        System.out.println("               UNA HISTORIA BASADA EN FALLOUT             ");
        System.out.println("==========================================================");


        Scanner sc = new Scanner(System.in);

        System.out.println("¿Quieres lootear la caja? S/N");
        System.out.println("1. Si");
        System.out.println("2. No");

        String respuesta = sc.next();

        if (respuesta.equalsIgnoreCase("si")){

            ItemsYcajas.cajas();

            Inventario.mostrarInv();
        }



    }

}
