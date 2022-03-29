package es.pascual.actividad25.menu.Opciones;

import es.pascual.actividad25.Tiempo;

import java.util.Scanner;

public class OpcionSumarHoras extends Opcion {

    public OpcionSumarHoras() {
        super("Sumar horas");
    }

    @Override
    public void ejecutar() {
        Scanner teclado = new Scanner(System.in);
        Tiempo tiempo = new Tiempo();
        System.out.print("Qué cantidad de horas quieres añadir: ");
        int horasIntroducidas = teclado.nextInt();
        tiempo.anyadirHoras(horasIntroducidas);
        System.out.println(tiempo);
        setFinalizar(true);
    }

}
