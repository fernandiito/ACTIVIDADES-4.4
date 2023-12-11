
/**
 * Crea un programa que cree un array con 100 números reales aleatorios entre
 * 0.0 y 1.0,
 * utilizando Math.random(), y luego le pida al usuario un valor real R. Por
 * último, mostrará
 * cuántos valores del array son igual o superiores a R.
 * 
 * @author Fernando Lara Millan
 */
public class prueba {
    public static void main(String[] args) {
        int[] num = new int[100];
        int cont = 0;
        double real = Double.parseDouble(System.console().readLine("Introduce un numero real entre 0.0 y 1.0: "));
        System.out.println("");
        System.out.println("Los numeros iguales o mayores a tu numero son: ");
        System.out.println("");
        for (int i = 0; i < num.length; i++) {
            double numeroAleatorio = (double) (Math.random());
            if (numeroAleatorio >= real) {
                cont++;
            }
        }
        System.out.println("Hay " + cont + " numeros iguales o mayores al que has introducido.");
    }
}
