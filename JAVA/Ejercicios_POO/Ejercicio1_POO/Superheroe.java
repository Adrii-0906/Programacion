package Ejercicio1_POO;

public class Superheroe {

    // Atributos
    private String nombre;
    private String descripcion;
    private boolean capa;

    // Constructores

    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }


    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCapa(boolean capa) {
        return capa;
    }

    public void setCapa(boolean b) {
        this.capa = capa;
    }


    // Metodo toString

    @Override
    public String toString() {
        return "Superheroe{" +
                "nombre = '" + nombre + '\'' +
                ", descripcion = '" + descripcion + '\'' +
                ", capa = " + capa +
                '}';
    }
}