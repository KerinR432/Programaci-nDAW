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
    static Scanner scanner=new Scanner(System.in);
    public static void main (String[]args){
        //ZDV
        String email="Tueresunbobo@gmail.com";
        //zona de pedir
        /**
         * System.out.println("Introduce tu correo electronico: ");
         *         email=scanner.nextLine();
         */
        //VER SINO SE REPITE ARROBA
        noRepetirArroba(email);
        noHayQueTenerPuntos(email);
        int arroba = noEsArroba(email);
        for (int i = 0; i < arroba; i++)
        {
            if (email.charAt(i)==46)
            {
                System.out.println("¡El Email esta correcto!");
            }else
            {
                System.out.println("El email no esta correcto!");
            }
        }



    }

    private static void noHayQueTenerPuntos(String email) {
        if (noRepetirArroba(email)==false)
        {
            System.out.println("El email tiene una arroba repetida");
        }
        if (noRepetirArroba(email)==true)
        {
            System.out.println("El email no tiene una arroba repetida");
        }
    }

    private static int noEsArroba(String email) {
        int cont=0;
        int arroba= email.indexOf('@');
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)==64)
            {
                cont++;
            }
        }
        if (cont!=1)
        {
            System.out.println("El email tiene una arroba repetida");
        }else
        {
            System.out.println("El email no tiene una arroba repetida");
        }
        return arroba;
    }

    public static boolean noRepetirArroba(String email) {
        int cont=0;
        int arroba=email.indexOf('@');
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)==64)
            {
                cont++;
            }
        }
        if (cont!=1)
        {
            return false;
        }else
        {
            return true;
        }
    }
}
