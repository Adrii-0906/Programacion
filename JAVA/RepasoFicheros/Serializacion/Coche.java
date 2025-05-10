package Serializacion;

import java.io.Serializable;
import java.util.Date;

public class Coche implements Serializable {

    // Atributos
    private String marca;
    private String modelo;
    private int precio;

    // Constructor

    public Coche(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
