import java.util.Scanner;

public class Saqueo {

    public static Scanner sc = new Scanner(System.in);

    public static void saq(){


        System.out.println("\033[36m---- Te has encontrado una caja ---- \033[36m");
        System.out.println("\n¿Quieres saquear la caja? Si/No ");
        System.out.println("1. Si");
        System.out.println("2. No");

        String respuesta = sc.next();

        if (respuesta.equalsIgnoreCase("si")){
            ItemsYcajas.cajas();

        }
    }


}
