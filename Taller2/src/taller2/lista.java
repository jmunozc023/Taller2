package taller2;

/**
 *
 * @author josep
 */
public class lista {
    nodoListaSimple primero;
    nodoListaSimple ultimo;

    public lista() {
        primero = null;
        ultimo = null;
    }
    public boolean Vacia(){
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }
    public void ingresarFinal(int dato){
        nodoListaSimple nodoNuevo = new nodoListaSimple();
        nodoNuevo.dato= dato;
        if (primero == null) {
            primero = nodoNuevo;
            primero.siguiente = null;
            ultimo = primero;
        } else {
            ultimo.siguiente= nodoNuevo;
            nodoNuevo.siguiente= null;
            ultimo =  nodoNuevo;
        }
    }
    public void buscar(int dato){
        nodoListaSimple actual = new nodoListaSimple();
        actual=primero;
        while (actual != null) {            
            if (actual.dato== dato) {
                System.out.println("nodo encontrado");
            }
            actual =  actual.siguiente;
        }
    }
    public void eliminar(int dato){
        nodoListaSimple actual = new nodoListaSimple();
        nodoListaSimple anterior = new nodoListaSimple();
        actual = primero;
        anterior = null;
        while (actual != null) {            
            if (actual.dato== dato) {
                if (actual == primero) {
                    primero= primero.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
            }
            anterior= actual;
            actual= actual.siguiente;
        }
    }
    public void imprimirLista(){
        nodoListaSimple auxiliar = new nodoListaSimple();
        auxiliar = primero;
        while (auxiliar != null) {            
            System.out.println(auxiliar.dato);
            auxiliar = auxiliar.siguiente;
        }
    }
}
