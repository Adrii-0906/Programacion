package Ejercicio3_POO;

import java.time.LocalDate;

public class Vino implements EsLiquido, ConDescuento, EsAlimento {

    // Atributos de la clase Vino
    private String marca;
    private String tipoVino;
    private int gradosAlcohol;
    private double precio;
    private double descuento;
    private String tipoEnvase;
    private LocalDate caducidad;
    private double volumen;

    // Constructor'

    public Vino(String marca, String tipoVino, int gradosAlcohol, double precio, double descuento, String tipoEnvase, LocalDate caducidad, double volumen) {
        this.marca = marca;
        this.tipoVino = tipoVino;
        this.gradosAlcohol = gradosAlcohol;
        this.precio = precio;
        this.descuento = descuento;
        this.tipoEnvase = tipoEnvase;
        this.caducidad = caducidad;
        this.volumen = volumen;
    }


    // Getters y Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public int getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(int gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodos de las interfaces

    // Metodos descuento
    @Override
    public void setDescuento(double des){
        des = descuento;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio -(precio - descuento);
    }


    // Metodos EsAlimento
    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public int getCalorias() {
        return 10 * gradosAlcohol;
    }


    // Metodo EsLiquido
    @Override
    public void setTipoEnvase(String env) {
        env = tipoEnvase;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}
