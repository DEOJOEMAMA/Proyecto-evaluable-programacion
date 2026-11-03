public class Delay {


    public static void imprimirConDelay(String texto, int delayMilis) {
        // Si el texto es muy corto o el delay es mínimo, lo imprimimos directo para evitar saltos raros

        StringBuilder acumulador = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            acumulador.append(texto.charAt(i));

            // Imprimimos en bloques pequeños (cada 2 caracteres o si es un espacio/signo de puntuación)
            // Esto reduce el parpadeo de la consola y da sensación de fluidez natural
            char actual = texto.charAt(i);
            if (i % 2 == 0 || actual == ' ' || actual == '.' || actual == ',') {
                System.out.print(acumulador.toString());
                System.out.flush();
                acumulador.setLength(0); // Limpiamos el acumulador

                try {
                    Thread.sleep(delayMilis);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }

        // Imprimir cualquier carácter restante que haya quedado en el acumulador
        if (acumulador.length() > 0) {
            System.out.print(acumulador.toString());
        }

        System.out.println(); // Salto de línea al terminar
    }

    public static void imprimeConDelay(String texto) {
        imprimirConDelay(texto, 80); // 50ms es una velocidad cómoda de leer
    }
}



