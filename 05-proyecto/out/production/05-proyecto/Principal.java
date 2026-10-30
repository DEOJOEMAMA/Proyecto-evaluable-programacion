import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("\033[32m==========================================================\033[32m");
        System.out.println("              UNA HISTORIA BASADA EN FALLOUT             ");
        System.out.println("==========================================================");


        Scanner sc = new Scanner(System.in);

        System.out.println("\033[36m¿Quieres saquear la caja? S/N \033[36m");
        System.out.println("1. Si");
        System.out.println("2. No");

        String respuesta = sc.next();

        if (respuesta.equalsIgnoreCase("si")){

            ItemsYcajas.cajas();

            Inventario.mostrarInv();
        }



    }

}
