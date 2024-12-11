import java.util.Scanner;

/**
 * Ejercicio 12. Realizar un programa en java que gestione los datos de stock de una
 * tienda de comestibles,la información a recoger será: nombre del producto(no se
 * puede repetir), precio, cantidad en stock.
 * La tienda dispone de 10 productos distintos. El programa debe ser capaz de:
 * 1. Dar de alta un producto nuevo.
 * 2. Buscar un producto por su nombre.
 * 3. Modificar el stock y precio de un producto dado.
 */
public class CadenasDeCaracteresEj12 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opción = 0;
        String[] producto = new String[10];
        double[] precio = new double[10];
        int[] stock = new int[10];
        String nombreProducto = " ";
        do {
            System.out.println("¿Que obsión quieres?.");
            System.out.println("1. Dar de alta un producto.\n" + "2.Buscar un producto\n" + "3. Modificar el Stock y precio de un producto.\n"
            +"4.Salir");
            opción = scanner.nextInt();
            switch (opción) {
                case 1:
                    darDeAltaProductos(producto, precio, stock);
                    break;
                case 2:
                    buscarUnProductoPorSuNombre(nombreProducto, producto, precio, stock);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:

            }
        } while (opción != 4);
        System.out.println("Finaliza el programa");
    }

    //INTRODUCIR DATOS
    public static void darDeAltaProductos(String[] producto, double[] precio, int[] stock) {

        for (int i = 0; i < 2; i++) {
            System.out.println("Introduce el nombre del producto: ");
            producto[i] = scanner.nextLine();
            producto[i] = scanner.nextLine();
            System.out.println("Introduce el precio del producto: ");
            precio[i] = scanner.nextDouble();
            System.out.println("Introduce el stock de producto: ");
            stock[i] = scanner.nextInt();
        }
    }

    public static void buscarUnProductoPorSuNombre(String nombreProducto, String[] producto, double[] precio, int[] stock) {
        System.out.println("Introduce el Nombre del prodcuto: ");
        nombreProducto = scanner.nextLine();
        nombreProducto = scanner.nextLine();
        if (producto.equals(nombreProducto)==true) {
            for (int i = 0; i < 10; i++) {
                System.out.println(producto[i]);
                System.out.println(precio[i]);
                System.out.println(stock[i]);
            }
        } else {
            System.out.println("Error has introducido una mayuscula o minuscula mal o el producto no esta");
            System.out.println("Introduce el Nombre del productos: ");
            nombreProducto = scanner.nextLine();
        }
    }
}
