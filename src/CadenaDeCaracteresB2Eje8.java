import java.util.Scanner;

/**
 *8. Repite el ejercicio anterior pero usando indexOf.
 */
public class CadenaDeCaracteresB2Eje8 {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[]args)
    {
        String Frase=" ";
        char caracter=' ';
        System.out.println("Introduce Una frase ");
        Frase=scanner.nextLine();
        System.out.println("Introduce un Caracter");
        caracter=scanner.nextLine().charAt(0);
        for (int i = 0; i < Frase.length(); i++) {
            Frase.indexOf(caracter);
            System.out.println(i);
        }
    }
}
