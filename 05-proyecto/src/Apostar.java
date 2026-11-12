import java.util.InputMismatchException;
import java.util.Scanner;

public class Apostar {
    public static boolean apostar1(){
        Scanner sc=new Scanner(System.in);
        boolean apost = false;
        int eleccion = 0;
        boolean tItem = Inventario.tieneItem("Estimulante");
        if (tItem == true){
            while (true){
                System.out.println("Tienes Estimulantes para apostar");
                System.out.println("1. Apostar un Estimulante");
                System.out.println("2. No apostar");
                try {
                    eleccion = sc.nextInt();
                }catch(InputMismatchException e) {
                    System.out.println("Por favor ingrese un numero del 1 al 2");
                    sc.nextLine();
                    continue;
                }
                if (eleccion == 1){
                    System.out.println("Apostaste un estimulante");
                    apost = true;
                    break;
                } else if (eleccion == 2) {
                    break;
                }
            }
        }else {
            System.out.println("No tiene Estimulante para apostar");
        }
        return apost;
    };
    public static void apostar2(int result){
        if (result == 1){
            System.out.println("Perdiste un Estimulante");
            Inventario.usarItem("Estimulante");
        } else if (result == 2) {
            System.out.println("Ganaste un Estimulante");
            Inventario.itemsToInv("Estimulante");
        } else if (result == 3) {
            System.out.println("Empataste, no pierdes ni ganas un Estimulante");
        }
    }
}
