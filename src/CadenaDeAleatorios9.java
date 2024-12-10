import java.util.Random;

/**
 * 9. Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
 * termine de generar números hasta que no saque el 24. El programa deberá decir al final cuántos
 * números se han generado.
 */
public class CadenaDeAleatorios9 {
        static Random random = new Random();
    public static void main(String[] args) {
        //ZDV
        int num1=0;
        mostrasPar(num1);

    }

    public static void mostrasPar(int a) {
        int contRep = 0;
        while (a != 24) {
         a=random.nextInt(101);
            if ((a % 2) == 0) {
                System.out.println(a);
            }
            contRep++;
        }
        System.out.println("El Numero que salio fue: ");
        System.out.println(a);
        System.out.println("Las veces que salio un numero hasta 24 fue: ");
        System.out.println(contRep);
    }
}
