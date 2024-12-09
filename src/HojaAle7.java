import java.util.Random;

public class HojaAle7 {
    public static void main(String[] args) {
        //SACAR LA APUESTA
        for (int j = 1; j < 4; j++) {
            System.out.println("Apuesta " + j);
            for (int i = 1; i < 15; i++) {
                System.out.println(i + "." + dameResultado());
            }
        }
        System.out.println("Pleno al 15: " + dameResultado());
    }

    //VAMOS A CREAR UNA FUNCIÓN DE RESULTADO
    public static char dameResultado() {
        Random random = new Random();
        String posibleResultado = "1X2";
        char resultado = posibleResultado.charAt(
                random.nextInt(3));
        return resultado;
    }
}
