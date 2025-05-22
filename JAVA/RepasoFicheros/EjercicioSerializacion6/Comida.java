package EjercicioSerializacion6;

import java.io.Serializable;

public class Comida implements Serializable {

    // Atributos
    private int id;
    private String nombre;
    private String tipo; // Carne o Verdura

    // Constructor
    public Comida() {
    }

    public Comida(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Comida{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
