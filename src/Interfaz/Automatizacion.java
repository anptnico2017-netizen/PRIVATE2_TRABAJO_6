package Interfaz;

public class Automatizacion {
    private String nombre;
    private String tipo;
    private double lectura;
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
    }
    void mostrarLectura() {
        System.out.println("Lectura: "+lectura);
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {

        return nombre;
    }
}
