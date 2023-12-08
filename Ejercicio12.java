/**
 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
 * menú con
 * distintas opciones:
 * a. Mostrar valores.
 * b. Introducir valor.
 * c. Salir.
 * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá
 * un valor V y una
 * posición P, luego escribirá V en la posición P del array. El menú se repetirá
 * indefinidamente
 * hasta que el usuario elija la opción ‘c’ que terminará el programa.
 * 
 * @author Fernando Lara Millan
 * 
 */
public class Ejercicio12 {
    /* declaro el array como global para que sea accesible por todo el programa */
    public static int[] array = new int[10];

    public static void main(String[] args) {
        String opcion = "";

        do {
            menu();
        } while (!opcion.equals("c"));
    }

    public static void menu() {

        System.out.println("MENU:");
        System.out.println("a. Mostrar valores.");
        System.out.println("b. Introducir valor.");
        System.out.println("c. Salir.");
        System.out.println("------------------");
        String opcion = System.console().readLine("Elige una opcion: ");
        switch (opcion) {
            case "a":
                mostrarValores();
                break;
            case "b":
                int pos = Integer
                        .parseInt(System.console().readLine("En que posicion del array vas a insertar(entre 0 y 9): "));
                int valor = Integer
                        .parseInt(System.console().readLine("Que valor quieres introducir en esa posicion: "));
                array[pos] = valor;
                System.out.println("Valor " + valor + " en la posicion " + pos + " guardado");
                break;
            case "c":
                System.out.println("Fin del programa.");
                break;
            default:
                System.out.println("Valor introducido incorrecto.");
                break;
        }
    }

    public static void mostrarValores() {
        System.out.println("Mostrando todo el array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
/*
 * public static void opcionA(int[] array) {
 * for (int i = 0; i < array.length; i++) {
 * System.out.println(array[i]);
 * }
 * }
 * 
 * public static void opcionB(int[] array) {
 * int pos = Integer.parseInt(System.console().
 * readLine("Que posicion del array quieres ver (entre 0 y 9): "));
 * int valor = Integer.parseInt(System.console().
 * readLine("Que valor quieres introducir en esa posicion: "));
 * System.out.println("Valor " + valor + " en la posicion " + pos +
 * " guardado");
 * }
 */
