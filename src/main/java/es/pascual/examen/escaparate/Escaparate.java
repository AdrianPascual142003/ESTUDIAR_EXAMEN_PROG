package es.pascual.examen.escaparate;

import es.pascual.examen.Marca;
import es.pascual.examen.Producto;
import es.pascual.examen.StockProducto;
import es.pascual.examen.exceptions.CanNotMergeBrandsException;
import es.pascual.examen.exceptions.NoExistsEnoughtItemException;
import es.pascual.examen.exceptions.ShowRoomNotOpenException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public abstract class Escaparate {

    private String nombre;

    private Marca marca;

    protected HashSet<StockProducto> productos;

    private Random generadorAleatorios;

    public Escaparate(String nombre, Marca marca, ArrayList<Producto> listadoProductos) {
        this.nombre = nombre;
        this.marca = marca;
        this.productos = new HashSet<>(20);
        this.generadorAleatorios = new Random();
        anyadirProducto(listadoProductos);
    }


    public abstract boolean isAbierto();

    public HashSet<StockProducto> getProductosEnStock() {
        HashSet<StockProducto> productosConStock = new HashSet<>();
        for (StockProducto stockProducto : productos) {
            if (stockProducto.isAviable()) {
                productosConStock.add(stockProducto);
            }
        }
        return productosConStock;
    }

    private StockProducto getProductosEnStock(Producto productoABuscar) {
        for (StockProducto producto : productos) {
            if (producto.getProducto().equals(productoABuscar)) {
                return producto;
            }
        }
        return null;
    }

    public int getUnidadesEnVenta(Producto producto) {
        StockProducto stockProducto = getProductosEnStock(producto);
        if (stockProducto != null) {
            return stockProducto.getUnidades();
        }
        return 0;
    }

    public void comprar(Producto producto, int numeroUnidades) throws ShowRoomNotOpenException {
        if (!isAbierto()) {
            throw new ShowRoomNotOpenException();
        }
        if (getUnidadesEnVenta(producto) < numeroUnidades) {
            throw new NoExistsEnoughtItemException();
        }
        StockProducto stockProducto = getProductosEnStock(producto);
        if (stockProducto != null) {
            stockProducto.decrementar(numeroUnidades);
        }
    }

    private void anyadirProducto(ArrayList<Producto> productosPasados) {
        for (Producto producto: productosPasados) {
            if (producto.getMarca() != marca) {
                throw new CanNotMergeBrandsException();
            }
            this.productos.add(new StockProducto(producto,getCantidadAleatoria()));
        }
    }

    private int getCantidadAleatoria() {
        final int MAX_CANTIDAD = 10;
        return generadorAleatorios.nextInt(MAX_CANTIDAD);
    }


}
