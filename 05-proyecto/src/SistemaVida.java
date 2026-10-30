public class SistemaVida {

    public static int vida = VidaYpersonaje.pv;

    public static void vid(){

        int pv = SistemaVida.vida;

        if (pv < 1){
            System.out.println("Has muerto, fin de la partida");
            System.exit(0);

        }

    }
}
