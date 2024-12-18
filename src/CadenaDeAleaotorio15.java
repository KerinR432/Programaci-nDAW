import java.util.Random;

public class CadenaDeAleaotorio15 {
    public static void main(String[] args)//PRINCIPIO KISS
    {
        String[] figuras =
                {"Corazón " + " diamante " + " herradura " + " campana " + " limón"};
        int[] freqFiguras = new int[5];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int numAle = random.nextInt(5);
            System.out.println(figuras[numAle]);
            freqFiguras[numAle]++;
        }
        comprobarSiHasGanando(freqFiguras);

    }

    public static void comprobarSiHasGanando(int[] freqfiguras) {
        for (int i = 0; i < freqfiguras.length; i++) {
            if (freqfiguras[i] == 3) {
                System.out.println("Enhorabuenas, ha ganado 10 monedas");
                return;

            }
            if (freqfiguras[i] == 2) {
                System.out.println("Bien, ha recuperado su moneda");
                return;
            }


        }
        System.out.println("Has perdido");
        return;
    }
}
