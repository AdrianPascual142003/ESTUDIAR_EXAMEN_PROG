package es.pascual.pruebas_estudiar.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeset {

    public static void main(String[] args) {

        Set<Persona> personas = new TreeSet<>();

        Persona jorge = new Persona("Jorge", "Gregori", 18);
        Persona miguel = new Persona("Miguel", "Castro", 48);
        Persona adrian = new Persona("Adrian", "Pascual", 19);
        Persona jorge2 = new Persona("Jorge", "Gregori", 18);
        Persona paco = new Persona("Miguel", "Castro", 48);

        personas.add(jorge);
        personas.add(miguel);
        personas.add(adrian);
        personas.add(paco);
        personas.add(jorge2);

        System.out.println(personas);

    }

}
