package EjercicioSerializacion;

import java.io.Serializable;

public class Curso implements Serializable {

    // Atributos
    private int id;
    private String nombre;
    private int horas;

    // Constructor
    public Curso() {
    }

    public Curso(int id, String nombre, int horas) {
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
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

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", horas=" + horas +
                '}';
    }
}
