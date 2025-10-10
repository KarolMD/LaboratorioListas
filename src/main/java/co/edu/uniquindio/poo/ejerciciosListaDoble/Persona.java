package co.edu.uniquindio.poo.ejerciciosListaDoble;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private String cedula;

    // Constructor
    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Override
    public String toString() {
        return nombre + " (" + cedula + ")";
    }

    @Override
    public int compareTo(Persona otra) {
        return this.cedula.compareTo(otra.cedula);
    }
}