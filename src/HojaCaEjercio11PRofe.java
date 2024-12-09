import java.util.Scanner;

public class HojaCaEjercio11PRofe {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        //ZDV
        String email = "";
        System.out.println("Introduce un Email");
        email=scanner.nextLine();
        //AVERGUAR SI TIENE UNA ARROBA
        if (!contieneEspacio(email)) {
            if (contieneUnaArroba(email)) {
                if (!contieneDosPuntosSeguidos(email)) {
                    System.out.println("Email Correcto!");
                } else {
                    System.out.println("Email incorrecto: Tiene 2 puntos seguidos.");
                }

            } else {
                System.out.println("Email Incorrecto: contine mas de una arroba o ninguna");

            }
        }else{
            System.out.println("Email Incorrecto: Contiene espacios!");
        }
    }

    //1.1 FUNCIÓN CONTIENE UNA SOLA 1
    public static boolean contieneUnaArroba(String email) {
        int cont = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                cont++;
            }
        }
        if (cont == 1) {
            return true;
        }
        return false;
    }

    //1.2 FUNCIÓN NO PUEDE TENER DOS PUNTOS SEGUIDO, supongo que solo tiene una arroba
    public static boolean contieneDosPuntosSeguidos(String email) {
        String[] partesEmail = email.split("@");
        return partesEmail[1].contains("..");
    }

    //1.3 NO PUEDE TENER ESPACIO EN BLANCO
    public static boolean contieneEspacio(String email) {
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == ' ') {
                return true;
            }
        }
        return false;
    }

}
