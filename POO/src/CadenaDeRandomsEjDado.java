import java.util.Random;

public class CadenaDeRandomsEjDado {
    public static void main(String[] args) {
        Random random = new Random();
        int tirada = random.nextInt(6) + 1;
        int tirada2 = random.nextInt(6) + 1;
        int cont = 1;
        while (tirada != tirada2) {
            tirada = random.nextInt(6) + 1;
            System.out.println(tirada+",");
            tirada2 = random.nextInt(6) + 1;
            System.out.println(tirada2);
            cont++;
        }
        System.out.println("las veces que los dados fueron iguales son: " + cont);
    }
}
