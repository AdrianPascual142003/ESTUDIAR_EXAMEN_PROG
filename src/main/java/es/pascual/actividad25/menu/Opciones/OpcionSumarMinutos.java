package es.pascual.actividad25.menu.Opciones;

import es.pascual.actividad25.Tiempo;

import java.util.Scanner;

public class OpcionSumarMinutos extends Opcion {

    public OpcionSumarMinutos() {
        super("Añadir minutos");
    }

    @Override
    public void ejecutar() {
        Scanner teclado = new Scanner(System.in);
        Tiempo tiempo = new Tiempo();
        System.out.print("Qué cantidad de minutos quieres añadir: ");
        int minIntroducidos = teclado.nextInt();
        tiempo.anyadirMinutos(minIntroducidos);
        System.out.println(tiempo);
        setFinalizar(true);
    }

}

