import java.util.Random;
import java.util.Scanner;

/**
 * 6. Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y
 * tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
 * oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
 * 7
 */
public class CadenaDeRandomEj6 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int jugadas = 0;
        System.out.println("Introduce un numero: ");
        jugadas = scanner.nextInt();
        int oportunidad = 5;
        int Aleatorio = random.nextInt(101);
        do {
            if (comprobarIgual(Aleatorio,jugadas) == false) {
                oportunidad--;
                System.out.println("Has fallado, Te quedan: ");
                System.out.println(oportunidad);
                System.out.println("Introduce otro numero: ");
                jugadas = scanner.nextInt();
            }
            if (comprobarIgual(Aleatorio,jugadas) == true) {
                System.out.println("Has ganado!");
                oportunidad = 1;
            }
        } while (oportunidad == 1);
        System.out.println("Fin de juego");
    }

    public static boolean comprobarIgual(int Aleatorio,int jugadas) {
        final int turnos = 5;
        for (int i = 0; i < 1; i++) {
            if (jugadas == Aleatorio) {
                return true;
            }
        }
        return false;
    }
}
