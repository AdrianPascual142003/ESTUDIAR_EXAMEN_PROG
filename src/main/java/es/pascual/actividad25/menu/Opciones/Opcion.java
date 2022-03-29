package es.pascual.actividad25.menu.Opciones;

public abstract class Opcion {

    private String titulo;

    private boolean finalizar;

    public Opcion(String titulo) {
        this.titulo = titulo;
    }

    public void mostrar(int numOpcion) {
        System.out.print("\n" + numOpcion + " - " + titulo);
    }

    public abstract void ejecutar();

    public boolean finalizar() {
        return finalizar;
    }

    protected void setFinalizar(boolean finalizar) {
        this.finalizar = finalizar;
    }

}
