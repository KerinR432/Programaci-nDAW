import java.util.Scanner;

/**
 * Programa que pida un carácter c y un número n y que devuelva una cadena con c repetido n
 * veces.
 */
public class CadenasDeCaracteresB2Eje5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String letraC = " ";
        int numero = 0;
        System.out.println("Introduce un numero de las veces que quieras que se repita es letra");
        numero = scanner.nextInt();
        System.out.println("Introduce un Caracter C");
        letraC = scanner.nextLine();
        letraC = scanner.nextLine();
        String[] muchasLetras = new String[numero];
        letrasNVeces(numero, muchasLetras, letraC);
    }

    public static void letrasNVeces(int numero, String[] muchasLetras, String letraC) {
        for (int i = 0; i < numero; i++) {
            muchasLetras[i] = letraC;
            System.out.print(muchasLetras[i]);
        }
    }
}
