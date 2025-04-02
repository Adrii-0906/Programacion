package Ejercicio3_POO;

import java.time.*;

public class Cereales implements EsAlimento{

    //Atributos de la clase
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate caducidad;

    //Constructor
    public Cereales(String marca, double precio, String tipoCereal, LocalDate fecha) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
        this.caducidad = fecha;
    }

    //Getters y Setters
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

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }


    // Metodos de las interfaces

    //Metodo EsAlimento

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        fc = caducidad;
    }


    @Override
    public int getCalorias() {
        if (tipoCereal.equalsIgnoreCase("espelta")) {
            return 5;
        } else if (tipoCereal.equalsIgnoreCase("maiz")) {
            return 8;
        } else if (tipoCereal.equalsIgnoreCase("trigo")) {
            return 12;
        } else {
            return 15;
        }
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoCereal='" + tipoCereal + '\'' +
                ", caducidad=" + caducidad +
                '}';
    }
}
