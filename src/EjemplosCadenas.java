public class EjemplosCadenas {
    public static void main(String []args)
    {
        String cadena="aaa,bbb,ccc";
        String[] cadenas=cadena.split(",");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas);
        }
    }

}
