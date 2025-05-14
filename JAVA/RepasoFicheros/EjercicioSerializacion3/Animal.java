package EjercicioSerializacion3;

import java.io.Serializable;

public class Animal implements Serializable {

    // Atributos
    private int id;
    private String tipo;
    private String nombre;

    // Constructor
    public Animal() {
    }

    public Animal(int id, String tipo, String nombre) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo toString

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
