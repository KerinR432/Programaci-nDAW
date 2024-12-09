import java.util.Scanner;

public class Separador {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[]args)
    {
        //ZDV
        String email="";
        String separador="";
        int separar=0;
        String emailParteUna="";
        System.out.println("Introduce un Gmail");
        email=scanner.nextLine();
        System.out.println("Introduce el separador");
        separador=scanner.nextLine();
        separar=separardos(email,separador);
        for (int i = 0; i < separar; i++) {
            emailParteUna=email;
        }
        System.out.println(emailParteUna);
    }
    //SEPARAR
    public static int separardos(String cadena,String a)
    {
        int cont=0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena==a)
            {
            }
                cont=i;
        }
        return cont;
    }
}
