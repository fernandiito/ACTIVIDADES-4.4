/**
 * Crea un programa que permita al usuario almacenar una secuencia aritmética en
 * un array y
 * luego mostrarla. Una secuencia aritmética es una serie de números que
 * comienza por un
 * valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2,
 * la secuencia sería
 * 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa
 * solicitará al
 * usuario V, I además de N (nº de valores a crear).
 * 
 * @author Fernando Lara Millan
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        int v = Integer.parseInt(System.console().readLine("Ingrese el valor inicial (V): "));

        int i = Integer.parseInt(System.console().readLine("Ingrese el incremento (I): "));

        int n = Integer.parseInt(System.console().readLine("Ingrese el número de valores a crear (N): "));

        int[] secuencia = new int[n];

        // Calcular y almacenar la secuencia aritmética en el array
        for (int j = 0; j < n; j++) {
            secuencia[j] = v + j * i;
        }

        // Mostrar la secuencia aritmética
        System.out.println("La secuencia aritmética es:");
        for (int j = 0; j < secuencia.length; j++) {
            int valor = secuencia[j];
            System.out.print(valor + " ");
        }
    }
}
