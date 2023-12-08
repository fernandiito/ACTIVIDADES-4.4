/**
 * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego
 * introducirá en el
 * primer array todos los valores del 1 al 100. Por último, deberá copiar todos
 * los valores del
 * primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
 * 
 * @author Fernando Lara Millan
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        int[] array2 = new int[100];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[array1.length - 1 - i];
        }

        System.out.println("Primer array:");
        imprimirArray(array1);

        System.out.println("-------------------");
        System.out.println("Segundo array:");
        imprimirArray(array2);
    }

    // funcion auxiliar para imprimir los arrays
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
