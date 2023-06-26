package taller2;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class lista {

    Scanner scanner = new Scanner(System.in);
    private nodoListaSimple primero;
    private nodoListaSimple ultimo;

    public lista() {
        primero = null;
        ultimo = null;
    }

    public nodoListaSimple getPrimero() {
        return primero;
    }

    public void setPrimero(nodoListaSimple primero) {
        this.primero = primero;
    }

    public nodoListaSimple getUltimo() {
        return ultimo;
    }

    public void setUltimo(nodoListaSimple ultimo) {
        this.ultimo = ultimo;
    }

    public void inicializarLista() {
        primero = null;
        ultimo = null;
        System.out.println("Lista inicializada correctamente. ");
    }

    public Producto solicitarProducto() {
        System.out.println("Ingrese el codigo del producto: ");
        int cod = scanner.nextInt();
        System.out.println("Ingrese la descripcion del producto: ");
        String desc = scanner.next();
        System.out.println("Ingrese el precio del producto: ");
        int prec = scanner.nextInt();
        Producto producto = new Producto(cod, desc, prec);
        return producto;
    }

    public void ingresarFinal() {
        Producto producto = solicitarProducto();
        nodoListaSimple nodoNuevo = new nodoListaSimple();
        nodoNuevo.producto = producto;
        if (getPrimero() == null) {
            setPrimero(nodoNuevo);
            setUltimo(nodoNuevo);
            nodoNuevo.siguiente = null;
            setPrimero(nodoNuevo);
        } else {
            getUltimo().siguiente = nodoNuevo;
            nodoNuevo.siguiente = null;
            setUltimo(nodoNuevo);
        }
        System.out.println("Producto ingresado exitosamente. ");
    }

    public void ingresarAntes() {
        Producto producto = solicitarProducto();
        nodoListaSimple nodoNuevo = new nodoListaSimple();
        nodoNuevo.producto = producto;
        if (getPrimero() == null) {
            setPrimero(nodoNuevo);
            setUltimo(nodoNuevo);
            nodoNuevo.siguiente = null;
        } else {
            nodoNuevo.siguiente = getPrimero();
            setPrimero(nodoNuevo);
        }
        System.out.println("Producto ingresado exitosamente. ");
    }

    public int obtenerTotal() {
        int total = 0;
        nodoListaSimple actual = getPrimero();
        while (actual != null) {
            total += actual.producto.getPrecioProducto();
            actual = actual.siguiente;
        }
        return total * 100;
    }

    public void buscar(int codigo) {
        nodoListaSimple actual = getPrimero();
        while (actual != null) {
            if (actual.producto.getCodigoProducto() == codigo) {
                System.out.println("Producto encontrado");
                System.out.println("Codigo: " + actual.producto.getCodigoProducto());
                System.out.println("Descripcion: " + actual.producto.getDescripcionProducto());
                System.out.println("Precio: " + actual.producto.getPrecioProducto());
            } else {
                System.out.println("Producto no encontrado. ");
            }
            actual = actual.siguiente;
        }
        
    }

    public void eliminar(int codigo) {
        nodoListaSimple actual = getPrimero();
        nodoListaSimple anterior = null;
        while (actual != null) {
            if (actual.producto.getCodigoProducto() == codigo) {
                if (actual == getPrimero()) {
                    setPrimero(getPrimero().siguiente);
                } else {
                    anterior.siguiente = actual.siguiente;
                }
            }
            anterior = actual;
            actual = actual.siguiente;
            
        }
        System.out.println("Producto eliminado correctamente");
    }

    public void modificar(int codigo) {
        nodoListaSimple actual = getPrimero();
        while (actual != null) {
            if (actual.producto.getCodigoProducto() == codigo) {
                System.out.println("Ingrese el nuevo código del producto:");
                int nuevoCodigo = scanner.nextInt();
                actual.producto.setCodigoProducto(nuevoCodigo);
                System.out.println("Ingrese la nueva descripción del producto:");
                String nuevaDescripcion = scanner.next();
                actual.producto.setDescripcionProducto(nuevaDescripcion);
                System.out.println("Ingrese el nuevo precio del producto:");
                int nuevoPrecio = scanner.nextInt();
                actual.producto.setPrecioProducto(nuevoPrecio);
            }
            actual = actual.siguiente;
            System.out.println("Producto modificado correctamente");
        }
    }

    public void imprimirLista() {
        nodoListaSimple auxiliar = getPrimero();
        while (auxiliar != null) {
            Producto producto = auxiliar.producto;
            System.out.println("Codigo: " + auxiliar.producto.getCodigoProducto() + " Descripcion: " + auxiliar.producto.getDescripcionProducto() + " Precio: " + auxiliar.producto.getPrecioProducto());
            auxiliar = auxiliar.siguiente;
        }
    }
}
