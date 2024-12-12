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
        int elige = 0;
        String nombre = " ";
        do {
            System.out.println("¿Que obsión quieres?.");
            System.out.println("1. Dar de alta un producto.\n" + "2.Buscar un producto\n" +
                    "3. Modificar el Stock y precio de un producto.\n" + "4.Salir");
            opción = scanner.nextInt();
            switch (opción) {
                case 1:
                    darDeAltaProductos(nombre, producto, precio, stock);
                    break;
                case 2:
                    buscarUnProductoPorSuNombre(nombreProducto, producto, precio, stock);
                    break;
                case 3:
                    modificarProductos(elige, nombreProducto, producto, precio, stock);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (opción != 4);
        System.out.println("Finaliza el programa");
    }

    //INTRODUCIR DATOS
    public static void darDeAltaProductos(String nombre, String[] producto, double[] precio, int[] stock) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce el nombre del producto: ");
            scanner.nextLine();
            nombre = scanner.nextLine();
            if (noSeRepite(nombre, producto) == true) {
                System.out.println("Error ya exites este nombre");
                return;
            }
            producto[i] = nombre;
            System.out.println("Introduce el precio del producto: ");
            precio[i] = scanner.nextDouble();
            System.out.println("Introduce el stock de producto: ");
            stock[i] = scanner.nextInt();
        }
    }

    public static void buscarUnProductoPorSuNombre(String nombreProducto, String[] producto, double[] precio, int[] stock) {
        System.out.println("Introduce el Nombre del producto: ");
        scanner.nextLine();
        nombreProducto = scanner.nextLine();
        for (int i = 0; i < producto.length; i++) {
            if (nombreProducto.equals(producto[i])) {
                System.out.println("Este es el producto que buscabas: " + producto[i]);
                System.out.println("Aqui tienes el precio: " + precio[i] + "€");
                System.out.println("Aqui esta el stock son: " + stock[i] + " Unidades\n");
                return;
            }
        }
        System.out.println("Error has introducido una mayuscula o minuscula mal o el producto no esta");
    }

    public static void modificarProductos(int elige, String nombreProducto, String[] producto, double[] precio, int[] stock) {
        System.out.println("Introduce el Nombre del producto: ");
        scanner.nextLine();
        nombreProducto = scanner.nextLine();
        for (int i = 0; i < producto.length; i++) {
            if (nombreProducto.equals(producto[i])) {
                System.out.println("1. Si quieres cambiar precio\n2. quieres cambiar el stock");
                elige = scanner.nextInt();
                if (elige == 1) {
                    System.out.println("Introduce el nuevo precio del producto: ");
                    precio[i] = scanner.nextDouble();
                }
                if (elige == 2) {
                    System.out.println("Introduce el nuevo precio del producto: ");
                    stock[i] = scanner.nextInt();
                }
            }

        }
    }

    public static boolean noSeRepite(String nombre, String[] producto) {
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] == null) {
                continue;
            }
            if (nombre.toLowerCase().equals(producto[i].toLowerCase())) {
                return true;
            }

        }
        return false;
    }
}
