import java.util.Scanner;

public class EjercicioUtilitario {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] Nombres = new String[5];
        int[] edades = new int[5];
        IntroducirNombresYEdades(Nombres, edades);
        MostrarEdadesYNombres(Nombres, edades);
    }

    public static void IntroducirNombresYEdades(String[] Nombres, int[] edades) {
        for (int i = 0; i < Nombres.length; i++) {
            System.out.println("Introduce los nombres de las personas");
            Nombres[i] = scanner.nextLine();
            System.out.println("Rellena la Edad de las personas: ");
            edades[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    public static void MostrarEdadesYNombres(String[] Nombres, int[] edades) {
        for (int i = 0; i < Nombres.length; i++) {
            System.out.println(Nombres[i]);
            System.out.println(edades[i]);

        }
    }
}
