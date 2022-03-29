package es.pascual.pruebas_estudiar.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {

        Map<String, Integer> tablaPuntuaciones = new HashMap<>();

        tablaPuntuaciones.put("Adrian",12);
        tablaPuntuaciones.put("Jorge",21);
        tablaPuntuaciones.put("Miguel",4);

        System.out.println(tablaPuntuaciones);

        //ITERAR HASHMAP

        for (Map.Entry jugador: tablaPuntuaciones.entrySet()) {
            System.out.println(jugador.getKey() + "\t");
            System.out.println(jugador.getValue());
        }


    }

}
