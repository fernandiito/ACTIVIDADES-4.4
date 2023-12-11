/**
 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
 * valores
 * enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá
 * un valor N y
 * mostrará en qué posiciones del array aparece N.
 * 
 * @author Fernando Lara Millan
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int[] num = new int[100];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (1 + Math.random() * 10);
        }

        int N = Integer.parseInt(System.console().readLine("Introduce un numero entre 1 y 10: "));
        System.out.println("");
        System.out.println("El numero " + N + " aparece en las siguientes posiciones: ");
        System.out.println("");

        System.out.print("En la posicion: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] == N) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }
}
