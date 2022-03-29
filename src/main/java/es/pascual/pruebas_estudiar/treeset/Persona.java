package es.pascual.pruebas_estudiar.treeset;


public class Persona implements Comparable<Persona> {

    private String nombre;

    private String apellido;

    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}' + "\n";
    }

    @Override
    public int compareTo(Persona o) {
        return o.getEdad()-edad;
    }

}
