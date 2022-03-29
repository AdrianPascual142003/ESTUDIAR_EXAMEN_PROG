package es.pascual.examen.escaparate;

import es.pascual.examen.Marca;
import es.pascual.examen.Producto;

import java.util.ArrayList;

public class EscaparateTemporal extends Escaparate {

    public static final int MILISEGUNDOS_SEGUNDO = 1000;
    public static final int SEGUNDOS_DIAS = 86400;

    private int numeroDiasAbierto;

    private long creadoEnTimeStamp;

    public EscaparateTemporal(String nombre, Marca marca, ArrayList<Producto> listadoProductos, int numeroDiasAbierto) {
        super(nombre, marca, listadoProductos);
        this.numeroDiasAbierto = numeroDiasAbierto;
        this.creadoEnTimeStamp = System.currentTimeMillis();
    }

    public int getDiasTranscurridos() {
        long timestampActual = System.currentTimeMillis();
        long segundosTranscurridos = (creadoEnTimeStamp - timestampActual) / MILISEGUNDOS_SEGUNDO;
        return (int) segundosTranscurridos / SEGUNDOS_DIAS;
    }

    public int getDiasRestantesApertura() {
        return numeroDiasAbierto - getDiasTranscurridos();
    }

    @Override
    public boolean isAbierto() {
        return getDiasTranscurridos() < numeroDiasAbierto;
    }
    
}
