package EjercicioSerializacion7;

import java.io.Serializable;

public class Ropa implements Serializable {

    // Atributos
    private int id;
    private String marca;
    private String conjunto;

    // Constructor
    public Ropa() {
    }

    public Ropa(int id, String marca, String conjunto) {
        this.id = id;
        this.marca = marca;
        this.conjunto = conjunto;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getConjunto() {
        return conjunto;
    }

    public void setConjunto(String conjunto) {
        this.conjunto = conjunto;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Ropa{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", conjunto='" + conjunto + '\'' +
                '}';
    }
}
