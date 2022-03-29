package es.pascual.pruebas_estudiar.hashset;

import java.util.HashSet;
import java.util.Set;

public class TestHashet {

    public static void main(String[] args) {

        Set<Persona> personas = new HashSet<>();

        Persona jorge = new Persona("Jorge", "Gregori", 18);
        Persona miguel = new Persona("Miguel", "Castro", 48);
        Persona adrian = new Persona("Adrian", "Pascual", 19);
        Persona jorge2 = new Persona("Jorge", "Gregorio", 18);

        personas.add(jorge);
        personas.add(miguel);
        personas.add(adrian);
        personas.add(jorge2);

        System.out.println(personas);

    }

}
