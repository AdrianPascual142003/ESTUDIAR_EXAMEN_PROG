package es.pascual.examen.exceptions;

public class NoExistsEnoughtItemException extends RuntimeException {

    public NoExistsEnoughtItemException() {
        super("No existen suficientes unidades");
    }
}
