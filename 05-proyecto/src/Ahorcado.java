import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static boolean jugarAhorcado() {
        Scanner sc=new Scanner(System.in);
        Random rnd = new Random();


        int aciertos = 0;
        int fallos = 0;
        char respuesta;
        int longitud;
        boolean ganar = false;

        //Lista de palabras
        String palabras[] = new String[3];
        palabras[0] = "fallo";
        palabras[1] = "hola1";
        palabras[2] = "hola2";

        //Elige un número aleatorio del 0 al 2
        int aleatorio = rnd.nextInt(3);
        //Con el número aleatorio selecciona la palabra con el número correspondiente
        String palabraElegida = palabras[aleatorio];
        //Convierte la palabra en un array de char
        char[] separada = palabraElegida.toCharArray();
        longitud = separada.length;

        //Hacer los guiones(La palabra oculta)
        char[] tusAciertos = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            tusAciertos[i] = '_';
        }

        System.out.println("\033[35mAdivina la palabra!\033[34m");


        //Bucle del juego
        while (fallos < 5 && aciertos < longitud){

            //Escribe la palabra en guiones
            System.out.print("Palabra: ");
            for (int i = 0; i < longitud; i++) {
                System.out.print(tusAciertos[i] + " ");
            }
            System.out.println(); // Salto de línea

            System.out.print("Introduce una letra: ");
            respuesta = sc.next().toLowerCase().charAt(0);

            boolean letraAcertada = false;

            //Comprueba si la letra introducida corresponde a una de la palabra(letra por letra)
            for (int i = 0;i < longitud;i++){
                if (separada[i] == respuesta){
                    if (tusAciertos[i] == '_'){
                        tusAciertos[i] = respuesta;
                        aciertos++;
                        letraAcertada = true;
                    }
                }
            }
            //Comprueba si acertaste o fallaste
            if (letraAcertada == false){
                fallos++;
                System.out.println("\033[31m¡Fallaste! Llevas " + fallos + " de 5 fallos.\033[34m");
            } else {
                System.out.println("\033[32m¡Bien! Has acertado una letra.\033[34m");
            }
        }
        //Comprueba si ganaste o perdiste
        if (aciertos == longitud){
            ganar = true;
            System.out.print("\033[32m¡Ganaste! la palabra es: "+ palabraElegida);
        } else if (fallos == 5) {
            System.out.print("\033[31m¡Perdiste! la palabra es: "+ palabraElegida);
        }
        return ganar;
    }
}