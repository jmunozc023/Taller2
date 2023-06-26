package taller2;

/**
 *
 * @author josep
 */
public class Producto {
    private int codigoProducto;
    private String descripcionProducto;
    private int PrecioProducto;

    public Producto(int codigoProducto, String descripcionProducto, int PrecioProducto) {
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
        this.PrecioProducto = PrecioProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(int PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }
    
}
