import java.util.Scanner;

/**
 * 7. Pedir al usuario una frase y un carácter, y decir en qué posiciones está ese carácter, o indicar
 * que no está si procede. No se puede usar indexOf o similar
 */
public class CadenaDeCaracteresB2Eje7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String Frase = " ";
        char caracter = ' ';
        System.out.println("Introduce Una frase ");
        Frase = scanner.nextLine();
        System.out.println("Introduce un Caracter");
        caracter = scanner.nextLine().charAt(0);
        for (int i = 0; i < Frase.length(); i++) {
            if (Frase.equalsIgnoreCase(String.valueOf(caracter))) {
                System.out.println(i);
            }
        }
        System.out.println("no exite");
    }
}
