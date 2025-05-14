package EjercicioSerializacion4;

import java.io.Serializable;

public class Componente implements Serializable {

    // Atributos
    private int id;
    private String tipo;

    // Constructor
    public Componente() {
    }

    public Componente(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
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

    // Metodo toString
    @Override
    public String toString() {
        return "Componente{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
