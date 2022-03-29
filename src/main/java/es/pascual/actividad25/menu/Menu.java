package es.pascual.actividad25.menu;

import es.pascual.actividad25.menu.Opciones.Opcion;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private String titulo;

    private ArrayList<Opcion> opciones;

    public Menu(String titulo) {
        this.titulo = titulo;
        opciones = new ArrayList<>();
    }

    public void anyadir(Opcion opcion) {
        opciones.add(opcion);
    }

    private void mostrar() {
        System.out.print("\n" + titulo + "\n===================");
        for (int i = 0; i < opciones.size() ; i++) {
            opciones.get(i).mostrar(i + 1);
        }
    }

    private Opcion getOpcion() {
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println(" \nSeleccione una opción [1-" + opciones.size() + "]:");
            if (teclado.hasNextInt()) {
                int opcion = teclado.nextInt();
                if (opcion >= 1 && opcion <= opciones.size()) {
                    return this.opciones.get(opcion - 1);
                }
            }
            System.out.println("¡ERROR! La opción seleccionada no existe");
            teclado.nextLine();
        }while (true);
    }

    public void ejecutar() {
        Opcion opcion;
        do {
            mostrar();
            opcion = getOpcion();
            opcion.ejecutar();
        }while (!opcion.finalizar());
    }


}
