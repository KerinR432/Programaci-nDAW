import java.util.Random;
import java.util.Scanner;

/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y
 * tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
 * oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
 */
public class CadenaDeRandomEj6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        //ZDV
        final int turnos = 5;
        int oportunidades = 5;
        int jugada = 0;
        int Aleatorio = random.nextInt(101);
        numeroAletorioYgandor(oportunidades, Aleatorio);
    }

    private static void numeroAletorioYgandor(int oportunidades, int Aleatorio) {
        int jugada;
        while (oportunidades >= 1) {
            System.out.println("Introduce un numero y adivina cual es: ");
            jugada = scanner.nextInt();
            if (jugada == Aleatorio) {
                System.out.println("¡Has Ganado!, el nuemero Aleatorio era: ");
                System.out.println(Aleatorio);
                oportunidades = 0;
            }
            if (jugada < Aleatorio) {
                System.out.println("Error el numero es mayor");
                oportunidades--;
                System.out.println("Te quedan " + oportunidades + " Sigue intentando");
            }
            if (jugada > Aleatorio) {
                System.out.println("Error el numero es menor");
                oportunidades--;
                System.out.println("Te quedan " + oportunidades + " Sigue intentando");
            }

        }
        System.out.println("Finaliza el juego");
    }

}
