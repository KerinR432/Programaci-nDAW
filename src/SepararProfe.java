public class SepararProfe {
    public static void main(String[] args) {
        String email = "hola@gmail.es";
        String[] partes = separa(email, "@");
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);
        }
    }

    public static String[] separa(String cad, String sep) {
        int contSep = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (sep.equals(cad.charAt(i) + "")) {
                contSep++;
            }
        }
        String[] cadenasSep = new String[contSep + 1];
        String parteActual = "";
        int pos = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (sep.equals(cad.charAt(i) + "")) {
                cadenasSep[pos] = parteActual;
                pos++;
                parteActual = "";
            } else {
                parteActual += cad.charAt(i);
            }
        }
        cadenasSep[pos] = parteActual;
        return cadenasSep;
    }
}

