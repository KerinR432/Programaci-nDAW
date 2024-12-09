/**
 * Ejercicio 1
 * Escribir por pantalla cada carácter de una cadena introducida por teclado.
 */

import java.util.Scanner;

public class CadenasDeCaracteresEj11 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String texto = "";
        texto = pedirTexto();
        sacarLetraALetra(texto);
    }

    private static void sacarLetraALetra(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
    }

    private static String pedirTexto() {
        String texto;
        System.out.println("Introduce el texto que quieras");
        texto = scanner.nextLine();
        return texto;
    }
}
