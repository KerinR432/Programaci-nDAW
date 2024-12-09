import java.util.Random;

/**
 * 5. Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
 * espacios. Muestra también el máximo, el mínimo y la media de esos números.
 */
public class CadenaDeRadomEj5 {
    public static void main(String[] args) {
        //ZDV
        Random random = new Random();
        int maximo = 0;
        int minimo = 199;
        int media = 0;
        NuemerosAleatorios(random, minimo, maximo, media);
    }
//AQUI VA LA FUNCION PARA SACAR 50.
    public static void NuemerosAleatorios(Random random, int minimo, int maximo, int media) {
        for (int i = 0; i < 50; i++) {
            int aletorio = random.nextInt(100) + 100;
            System.out.print(aletorio + " ");
            if (aletorio < minimo) {
                minimo = aletorio;
            }
            if (aletorio > maximo) {
                maximo = aletorio;
            }
            media += aletorio;
        }
        System.out.println("\nLa maximo de 50 numeros aleatorios son: \n" + maximo);
        System.out.println("La minima de 50 numeros aleatorios son: \n" + minimo);
        System.out.println("La media de todos los numeros aletorios son: \n" + (double) media / 50);
    }
}
