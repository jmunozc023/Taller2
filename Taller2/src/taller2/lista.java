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

    public lista(nodoListaSimple primero, nodoListaSimple ultimo) {
        this.primero = primero;
        this.ultimo = ultimo;
    }

    public lista() {

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
        lista lista = new lista(primero, ultimo);
        primero= null;
        ultimo= null;
    }

    public Producto solicitarProducto() {
        int cod=0;
        String desc=null;
        int prec=0;
        Producto producto = new Producto(cod, desc, prec);
        System.out.println("Ingrese el codigo del producto: ");
        cod = scanner.nextInt();
        //scanner.next();
        producto.setCodigoProducto(cod);
        System.out.println("Ingrese la descripcion del producto: ");
        desc = scanner.next();
        producto.setDescripcionProducto(desc);
        System.out.println("Ingrese el precio del producto: ");
        prec = scanner.nextInt();
        producto.setPrecioProducto(prec);
        return producto;
    }

    public void ingresarFinal(Producto producto) {
        solicitarProducto();
        nodoListaSimple nodoNuevo = new nodoListaSimple();
        nodoNuevo.producto = producto;
        if (getPrimero() == null) {
            setPrimero(nodoNuevo);
            getPrimero().siguiente = null;
            setPrimero(primero);
        } else {
            getUltimo().siguiente = nodoNuevo;
            nodoNuevo.siguiente = null;
            setUltimo(nodoNuevo);
        }
    }

    public void buscar(Producto producto) {
        int dato = 0;
        nodoListaSimple actual = new nodoListaSimple();
        actual = getPrimero();
        while (actual != null) {
            if (actual.producto.getCodigoProducto() == dato) {
                System.out.println("nodo encontrado");
            }
            actual = actual.siguiente;
        }
    }

    public void eliminar(Producto producto) {
        int dato = 0;
        nodoListaSimple actual = new nodoListaSimple();
        nodoListaSimple anterior = new nodoListaSimple();
        actual = getPrimero();
        anterior = null;
        while (actual != null) {
            if (actual.producto.getCodigoProducto() == dato) {
                if (actual == getPrimero()) {
                    setPrimero(getPrimero().siguiente);
                } else {
                    anterior.siguiente = actual.siguiente;
                }
            }
            anterior = actual;
            actual = actual.siguiente;
        }
    }

    public void imprimirLista() {
        nodoListaSimple auxiliar = new nodoListaSimple();
        auxiliar = getPrimero();
        while (auxiliar != null) {
            System.out.println(auxiliar.producto.getCodigoProducto() + " " + auxiliar.producto.getDescripcionProducto() + " " + auxiliar.producto.getPrecioProducto());
            auxiliar = auxiliar.siguiente;
        }
    }
}
