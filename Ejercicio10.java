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
       float sumatorioAlturas = 0, altMedia = 0, altMax = 0, altMin = 99999;
        int contEncima = 0, contDebajo = 0;

        int N = Integer.parseInt(System.console().readLine("A cuántas personas vas a tomar la altura: "));
        // usar un nombre para el array mas descriptivo
        float[] alturas = new float[N];

        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = Float.parseFloat(System.console().readLine("Introduce la altura de la persona " + i + ": "));
        }

        // Calcular la suma, media, máxima y mínima
        for (int i = 0; i < alturas.length; i++) {
            float altura = alturas[i];
            sumatorioAlturas = sumatorioAlturas + altura;

            if (altMin > altura) {
                altMin = altura;
            }
            if (altMax < altura) {
                altMax = altura;
            }
        }

        altMedia = sumatorioAlturas / N;

        // Contar personas encima/debajo de la media
        for (int i = 0; i < alturas.length; i++) {
            float altura = alturas[i];
            if (altura >= altMedia) {
                contEncima++;
            } else if (altura < altMedia) {
                contDebajo++;
            }
        }

        System.out.println("La altura media es: " + altMedia);
        System.out.println("La altura máxima es: " + altMax);
        System.out.println("La altura mínima es: " + altMin);
        System.out.println("Hay " + contEncima + " personas que miden por encima de la media.");
        System.out.println("Hay " + contDebajo + " personas que miden por debajo de la media.");
    }
}
