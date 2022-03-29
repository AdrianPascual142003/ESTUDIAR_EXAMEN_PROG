package es.pascual.examen;

public class StockProducto {

    public static final int MAX_CANTIDAD = 10;

    public static final int MIN_CANTIDAD = 1;

    private int unidades;

    private Producto producto;

    public StockProducto(Producto producto, int unidades) {
        this.producto = producto;
        this.unidades = unidades;
    }

    public int getUnidades() {
        return unidades;
    }

    public boolean isAviable() {
        return unidades > 0;
    }

    public Producto getProducto() {
        return producto;
    }

    public void decrementar(int unidades) {
        this.unidades -= unidades;
    }

}
