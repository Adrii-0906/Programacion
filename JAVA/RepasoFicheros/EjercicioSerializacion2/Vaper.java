package EjercicioSerializacion2;

import java.io.Serializable;

public class Vaper implements Serializable {

    // Atributos
    private int id;
    private String marca;
    private int caladas;

    // Constructor
    public Vaper() {
    }

    public Vaper(int id, String marca, int caladas) {
        this.id = id;
        this.marca = marca;
        this.caladas = caladas;
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

    public int getCaladas() {
        return caladas;
    }

    public void setCaladas(int caladas) {
        this.caladas = caladas;
    }

    // Metodo toString

    @Override
    public String toString() {
        return "Vaper{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", caladas=" + caladas +
                '}';
    }
}
