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
                TextoMod.imprimirConDelay("Tienes Estimulantes para apostar", TextoMod.verde, 0);
                TextoMod.imprimirConDelay("1. Apostar un Estimulante", TextoMod.verde,0);
                TextoMod.imprimirConDelay("2. No apostar", TextoMod.verde, 0);
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
        }else if (result == 4) {
            System.out.println("Ganaste 5 Estimulantes");
            for (int i = 0; i < 5; i++) {
                Inventario.itemToInv("Estimulante");
            }
        }
    }
}
