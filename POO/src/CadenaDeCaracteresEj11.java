import java.util.Scanner;

/**
 * Ejercicio 11. Realizar una función a la que se le pasa por parámetro una cadena
 * con un email, y dicha función devuelve si el mail está bien formado.
 * Un email está bien formado cuando:
 * 1.1.- Contiene una y solo una arroba.
 * 1.2.- No puede contener dos puntos seguidos '.' después de la arroba.
 * 1.3.- No puede contener ' '
 */
public class CadenaDeCaracteresEj11 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ZDV
        String email = "Tueresunbobo@gmail.com";
        //zona de pedir
        /**
         * System.out.println("Introduce tu correo electronico: ");
         *         email=scanner.nextLine();
         */
        //VER SINO SE REPITE ARROBA
        noRepetirArroba(email);
        //NO PERMITIR MAS PUNTOS DESPUES DE LA @
        PosicionDelPunto(email);


    }

    public static boolean PosicionDelPunto(String email) {
        for (int i = email.indexOf('@'); i < email.length() - 1; i++) {
            if (email.charAt(i) == '.' && email.charAt(i + 1) == '.') {
                return true;
            }
        }
        return false;
    }

    public static void noRepetirArroba(String email) {
        int cont = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == 64) {
                cont++;

            }
        }
        if (cont != 1) {
            System.out.println("La cantidad de arroba es: " + cont);
            System.out.println("Error vuelve a escribir el correo");
        } else {
            System.out.println("Solo tienes un arroba esta correcto");
        }

    }
}
