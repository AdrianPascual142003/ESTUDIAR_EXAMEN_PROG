package es.pascual.examen.escaparate;

import es.pascual.examen.Marca;
import es.pascual.examen.Producto;
import es.pascual.examen.StockProducto;

import java.util.ArrayList;

public class EscaparateFinExistencias extends Escaparate {

    private boolean isCerrado;

    public EscaparateFinExistencias(String nombre, Marca marca, ArrayList<Producto> listadoProductos, boolean isCerrado) {
        super(nombre, marca, listadoProductos);
    }

    public void cerrar() {
        this.isCerrado = true;
    }

    @Override
    public boolean isAbierto() {
        return (!isCerrado && quedanProductosStock());
    }

    private boolean quedanProductosStock() {
        for (StockProducto producto: productos) {
            if (producto.isAviable()) {
                return true;
            }
        }
        return false;
    }


}
