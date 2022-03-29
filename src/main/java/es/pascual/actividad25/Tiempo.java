package es.pascual.actividad25;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tiempo {

    private LocalDateTime tiempoActual;

    public Tiempo() {
        this.tiempoActual = LocalDateTime.now();
    }

    public void anyadirDias(int dias) {
        tiempoActual = tiempoActual.plusDays(dias);
    }

    public void anyadirHoras(int horas) {
        tiempoActual = tiempoActual.plusHours(horas);
    }

    public void anyadirMinutos(int minutos) {
        tiempoActual = tiempoActual.plusMinutes(minutos);
    }

    @Override
    public String toString() {
        return DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm").format(tiempoActual);
    }

}
