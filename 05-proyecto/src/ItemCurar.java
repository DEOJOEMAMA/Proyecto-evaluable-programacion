import java.util.InputMismatchException;
import java.util.Scanner;

public class ItemCurar {

    public static String[] itemcur = {"Carne ratatopo", "Estimulante", "Nuke cola"};
    public static int[] hp = {5, 60, 20};

    public static int elegircur(Scanner sc) {

        int[] disponibles = new int[itemcur.length];
        int n = 0;

        for(int i = 0;i<itemcur.length;i++) {

            if (Inventario.tieneItem(itemcur[i])) {
                disponibles[n] = i;
                n++;
            }
        }
        for (int j = 0; j < n; j++){
            int a = disponibles[j];

            System.out.println((j + 1) + ". " + itemcur[a] +" "+  hp[a]+" pv ");

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

        Inventario.usarItem(nombreItem);

        System.out.println("HP: " + VidaYPersonaje.hp + " / " + VidaYPersonaje.hpMax);
        // Aquí puedes añadir tu lógica para sumarle 'vid' a la salud actual de tu personaje,
        // por ejemplo usando Math.min(vidaMax, vidaActual + vid) para no pasarte del límite.

        return true;
    }

}