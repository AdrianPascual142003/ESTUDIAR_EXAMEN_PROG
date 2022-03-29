package es.pascual.actividad26;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tiempo {

    private LocalDateTime tiempoActual;

    public Tiempo() {
        tiempoActual = LocalDateTime.now();
    }

    private String localDate() {
        return "ISO_LOCAL_DATE: -> " + DateTimeFormatter.ISO_LOCAL_DATE.format(tiempoActual);
    }

    private String localTime() {
        return "ISO_LOCAL_TIME: -> " + DateTimeFormatter.ISO_LOCAL_TIME.format(tiempoActual);
    }

    private String localDateTime() {
        return "ISO_LOCAL_DATE_TIME: -> " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(tiempoActual);
    }

    @Override
    public String toString() {
        return localDate() + "\n" + localTime() + "\n" + localDateTime();
    }

}
