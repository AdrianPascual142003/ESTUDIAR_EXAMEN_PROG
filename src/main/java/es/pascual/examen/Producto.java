package es.pascual.examen;

import java.util.Objects;

public class Producto {

    private String identificador;

    private double precio;

    private Marca marca;

    public Producto(String identificador, double precio, Marca marca) {
        this.identificador = identificador;
        this.precio = precio;
        this.marca = marca;
    }

    public String getIdentificador() {
        return identificador;
    }

    public double getPrecio() {
        return precio;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Producto)) {
            return false;
        }
        return ((Producto) other).getIdentificador().equals(identificador);

    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

}
