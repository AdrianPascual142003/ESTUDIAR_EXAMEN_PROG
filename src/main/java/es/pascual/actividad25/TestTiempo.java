package es.pascual.actividad25;

import es.pascual.actividad25.menu.Menu;
import es.pascual.actividad25.menu.Opciones.Opcion;
import es.pascual.actividad25.menu.Opciones.OpcionSumarDias;
import es.pascual.actividad25.menu.Opciones.OpcionSumarHoras;
import es.pascual.actividad25.menu.Opciones.OpcionSumarMinutos;

public class TestTiempo {

    public static void main(String[] args) {

        Menu menu = new Menu("Menu del tiempo");
        menu.anyadir(new OpcionSumarDias());
        menu.anyadir(new OpcionSumarHoras());
        menu.anyadir(new OpcionSumarMinutos());
        menu.ejecutar();
    }

}
