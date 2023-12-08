/**
 * Crea un programa que cree un array de enteros e introduzca la siguiente
 * secuencia de
 * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10
 * diez veces, y luego la
 * muestre por pantalla.
 * 
 * @author Fernando Lara Millan
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        int tamanioArray = 10;

        int[] secuencia = new int[tamanioArray * (tamanioArray + 1) / 2];

        int indice = 0;
        for (int i = 1; i <= tamanioArray; i++) {
            for (int j = 0; j < i; j++) {
                secuencia[indice] = i;
                indice++;
            }
        }

        // Mostrar la secuencia por pantalla
        System.out.println("La secuencia es:");
        for (int j = 0; j < secuencia.length; j++) {
            int valor = secuencia[j];
            System.out.print(valor + " ");
        }
    }
}
