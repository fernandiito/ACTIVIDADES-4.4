/**
 * Crea un programa para realizar cálculos relacionados con la altura (en
 * metros) de personas.
 * Pedirá un valor N y luego almacenará en un array N alturas introducidas por
 * teclado. Luego
 * mostrará la altura media, máxima y mínima así como cuántas personas miden por
 * encima y
 * por debajo de la media.
 * 
 * @author Fernando Lara Millan
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        float suamtorioAlturas = 0, altMedia = 0, altMax = 0, altMin = 99999;
        int contEncima = 0, contDebajo = 0;

        int N = Integer.parseInt(System.console().readLine("A cuantas personas vas a tomar la altura: "));
        int[] num = new int[N];
        /**
         * El bucle primero pide la altura de la persona, actualiza las alturas minimas
         * y maximas, calcula la altura media y aumenta el contador en funcion de si la
         * persona mide por encima o por debajo de la media
         */
        for (int i = 0; i < num.length; i++) {
            float altura = Float.parseFloat(System.console().readLine("Introduce la altura de la persona " + i + ": "));
            if (altMin > altura) {
                altMin = altura;
            } else if (altMax < altura) {
                altMax = altura;
            }
            suamtorioAlturas = suamtorioAlturas + altura;
            altMedia = suamtorioAlturas / N;
            if (altura > altMedia) {
                contEncima++;
            } else {
                contDebajo++;
            }
        }

        // altMedia=suamtorioAlturas/N;
        System.out.println("La altura media es: " + altMedia);
        System.out.println("La altura máxima es: " + altMax);
        System.out.println("La altura mínima es: " + altMin);
        System.out.println("Hay " + contEncima + " personas que miden por encima de la media.");
        System.out.println("Hay " + contDebajo + " personas que miden por debajo de la media.");
    }
}
