public class HojaCaEjercio11PRofe {
    public static void main(String[] args) {

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

    //1.2 FUNCIÓN NO PUEDE TENER DOS PUNTOS SEGUIDO
    public static boolean contieneDosPuntosSeguidos(String email) {

    }

    //1.2 NO PUEDE TENER ESPACIO EN BLANCO
    public static boolean contieneEspacio(String email) {
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == ' ') {
                return true;
            }
        }
        return false;
    }
}
