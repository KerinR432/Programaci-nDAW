import java.util.Random;

/**
 * 15. Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles:
 * corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su
 * moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
 */
public class PrincipalEjercicio15 {
    static Random random = new Random();

    public static void main(String[] args) {
        String[] figuras = {"corazón " + " diamante " + " herradura " + " campana " + " limón"};
        String[]Palabras=new String[3];
        random.nextInt(4);
        Palabras=comprobarSiSonIguales(figuras);
        mostrarFiguras(Palabras);
    }

    public static void mostrarFiguras(String[] Figuras) {
        for (int i = 0; i < Figuras.length; i++) {

            System.out.println(Figuras[i]);
        }
    }

    public static String[] comprobarSiSonIguales(String[ ] Figuras) {
        String[] palabras = new String[3];
        int cont = 0;
        for (int i = 0; i < Figuras.length; i++) {
            if (Figuras.equals(Figuras)) {
                cont++;
                palabras[i] = Figuras[i];
            }
        }
        return palabras;
    }

    public static void siHaGanado() {

    }
}
