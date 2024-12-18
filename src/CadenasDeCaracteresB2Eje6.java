import java.util.Scanner;

/**
 * 6. Elabora un programa que escriba todos los caracteres de una cadena cada uno en una línea.
 */
public class CadenasDeCaracteresB2Eje6 {
       static Scanner scanner=new Scanner(System.in);
    public static void main(String[]args)
    {
        String Palabra="";
        String[]mostrarCaracter=new String[200];
        System.out.println("Introduce la palabra que quieras");
        Palabra=scanner.nextLine();
        mostrarCaracteres(Palabra, mostrarCaracter);
    }

    public static void mostrarCaracteres(String Palabra, String[] mostrarCaracter) {
        for (int i = 0; i < Palabra.length(); i++) {
            mostrarCaracter[i]= Palabra;
            System.out.println(mostrarCaracter[i].charAt(i));
        }
    }
}
