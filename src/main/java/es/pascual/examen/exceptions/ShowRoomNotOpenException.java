package es.pascual.examen.exceptions;

public class ShowRoomNotOpenException extends Exception {

    public ShowRoomNotOpenException() {
        super("EL escaparate está cerrado");
    }
}
