import java.util.Scanner;

public class CadenasDeCaracteresEj12Profesor {
    //Definición de variables globales
    static String[] nombre;
    static double[] precio;
    static int[] cantidad;
    final static int TAM = 10;
    static int pos = 0;

    public static void main(String[] args) {
        //Contruimos las Variables globales
        nombre = new String[TAM];
        precio = new double[TAM];
        cantidad = new int[TAM];
        String nombres = "";
        double precios = 0;
        int cantidades = 0;
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce nombre, precio y cantidad");
                    nombres = scanner.nextLine();
                    nombres = scanner.nextLine();
                    precios = scanner.nextDouble();
                    cantidades = scanner.nextInt();
                    if (darDeAltaProducto(nombres, precios, cantidades))
                        System.out.println("Producto insertado");
                    else
                        System.out.println("Producto NO insertado");
                    break;
                case 2:
                    System.out.println("Introduce el nombre del producto que buscas");
                    nombres = scanner.nextLine();
                    nombres = scanner.nextLine();
                    buscarYMostrarProducto(nombres);
                    break;
                case 3:
                    System.out.println("Introduce el nombre del producto que buscas");
                    nombres = scanner.nextLine();
                    nombres = scanner.nextLine();
                    System.out.println("Introduce nuevo precio: ");
                    precios = scanner.nextDouble();
                    System.out.println("Introduce una nueva cantidad: ");
                    cantidades = scanner.nextInt();
                    if (modficiarProductos(nombres, precios, cantidades))
                        System.out.println("Cambio Insertado con exito");
                    else
                        System.out.println("El cambio no se pudo realizar, no existe el producto");
                    break;
                case 4:
                    System.out.println("Has salido");
                    break;
                default:
                    System.out.println("Es numero es valido");
            }
        } while (opcion != 4);
    }

    public static void mostrarMenu() {
        System.out.println("¿Que obsión quieres?.");
        System.out.println("1. Dar de alta un producto.\n" + "2.Buscar un producto\n" +
                "3. Modificar el Stock y precio de un producto.\n" + "4.Salir");
    }

    public static boolean darDeAltaProducto(String nombres, double precios, int cantidades) {
        if (pos == TAM)//el almacen esta lleno
            return false;
        for (int i = 0; i < pos; i++) {
            if (nombres.equals(nombre[i])) {
                return false;
            }
        }
        //El Almacen tiene espacio y el producto no existe
        nombre[pos] = nombres;
        precio[pos] = precios;
        cantidad[pos] = cantidades;
        pos++;
        return true;
    }

    public static void buscarYMostrarProducto(String nombres) {

        for (int i = 0; i < pos; i++) {
            if (nombres.equalsIgnoreCase(nombre[i])) {
                System.out.println(nombre[i] + " Tiene lo siguiente:");
                System.out.println("El precio: " + precio[i] + "€");
                System.out.println("La cantidad es: " + cantidad[i] + " Unidades");
                return;
            }
        }
        System.out.println("Error has introducido una mayuscula o minuscula mal o el producto no esta");
    }

    public static boolean modficiarProductos(String nombres, double precios, int cantidades) {
        for (int i = 0; i < pos; i++) {
            if (nombres.equalsIgnoreCase(nombre[i])) {
                precio[i] = precios;
                cantidad[i] = cantidades;
                return true;
            }
        }
        return false;
    }
}