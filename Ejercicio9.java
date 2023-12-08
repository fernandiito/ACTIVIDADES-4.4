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
        int N = Integer.parseInt(System.console().readLine("Introduce un numero entre 1 y 10: "));
        System.out.println("");
        System.out.println("Los numeros que coinciden con tun numero " + N + " son: ");
        System.out.println("");
        for (int i = 0; i < num.length; i++) {
            double numeroAleatorio = (double) (Math.random() * 10 + 1);
            if (numeroAleatorio == N) {
                System.out.println(i + " :NUMERO ALEATORIO: " + numeroAleatorio);
                System.out.println("");
            }
        }
    }
}
