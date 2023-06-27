package taller2;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Taller2 {

    public static void menu() {
        System.out.println("----- MENÚ PRINCIPAL -----");
        System.out.println("1. Iniciar Lista");
        System.out.println("2. Insertar al Final");
        System.out.println("3. Eliminar de la Lista (por codigo)");
        System.out.println("4. Buscar Elemento (por codigo)");
        System.out.println("5. Modificar elemento (por codigo)");
        System.out.println("6. Imprimir Lista");
        System.out.println("7. Insertar antes");
        System.out.println("8. Obtener el total");
        System.out.println("9. Salir");
        System.out.println("Seleccione una opcion: ");
    }

    public static void main(String[] args) {
        int opcion = 0;
        int codigo = 0;
        Scanner sc = new Scanner(System.in);
        lista lista = new lista();
        do {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    lista.inicializarLista();
                    break;
                case 2:
                    lista.ingresarFinal();
                    break;
                case 3:
                    System.out.println("Ingrese el codigo: ");
                    codigo = sc.nextInt();
                    lista.eliminar(codigo);
                    break;
                case 4:
                    System.out.println("Ingrese el codigo: ");
                    codigo = sc.nextInt();
                    lista.buscar(codigo);
                    break;
                case 5:
                    System.out.println("Ingrese el codigo: ");
                    codigo = sc.nextInt();
                    lista.modificar(codigo);
                    break;
                case 6:
                    lista.imprimirLista();
                    break;
                case 7:
                    lista.ingresarAntes();
                    break;
                case 8:
                    System.out.println("Total de la suma de precios es: " + lista.obtenerTotal());
                    break;
                case 9:
                    System.out.println("Gracias por utilizar el sistema");
                    break;

                default:
                    System.out.println("Opcion incorrecta, intente de nuevo.");
            }
        } while (opcion != 9);

    }

}
