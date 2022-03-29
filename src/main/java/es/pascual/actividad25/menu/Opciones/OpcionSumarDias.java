package es.pascual.actividad25.menu.Opciones;

import es.pascual.actividad25.Tiempo;

import java.util.Scanner;

public class OpcionSumarDias extends Opcion {

    public OpcionSumarDias() {
        super("Sumas dias");
    }

    @Override
    public void ejecutar() {
        Scanner teclado = new Scanner(System.in);
        Tiempo tiempo = new Tiempo();
        System.out.println("Qué cantidad de días quieres añadir: ");
        int numeroDias = teclado.nextInt();
        tiempo.anyadirDias(numeroDias);
        System.out.println(tiempo);
        setFinalizar(true);
    }
}
