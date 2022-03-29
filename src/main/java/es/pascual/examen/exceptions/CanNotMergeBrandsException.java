package es.pascual.examen.exceptions;

public class CanNotMergeBrandsException extends RuntimeException {

    public CanNotMergeBrandsException() {
        super("ERROR! Los productos y el escaparate son de distintas marcas");
    }

}
