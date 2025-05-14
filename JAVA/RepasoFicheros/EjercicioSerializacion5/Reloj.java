package EjercicioSerializacion5;

import java.io.Serializable;

public class Reloj implements Serializable {

    // Atributos
    private int id;
    private String marca;
    private double precio;

    // Constructor
    public Reloj() {
    }

    public Reloj(int id, String marca, double precio) {
        this.id = id;
        this.marca = marca;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Reloj{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
