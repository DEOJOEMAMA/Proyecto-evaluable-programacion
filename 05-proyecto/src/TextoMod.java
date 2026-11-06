public class TextoMod {
    public static String negro = "\u001B[30m";
    public static String rojo = "\u001B[31m";
    public static String verde = "\u001B[32m";
    public static String amarillo = "\u001B[33m";
    public static String azul = "\u001B[34m";
    public static String morado = "\u001B[35m";
    public static String cyan = "\u001B[36m";
    public static String blanco = "\u001B[37m";
    public static String reset = "\u001B[0m";

    static void imprimirConDelay(String texto, String color, int delayMs) {
        System.out.print(color);
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            System.out.flush();
            try {
                Thread.sleep(delayMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.print(reset);
        System.out.println();
    }
}
