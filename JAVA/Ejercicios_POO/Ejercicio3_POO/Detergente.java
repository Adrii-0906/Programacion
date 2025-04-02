package Ejercicio3_POO;

public class Detergente implements EsLiquido, ConDescuento{

    // Atributos de la clase
    private String marca;
    private double precio;
    private String tipoEnvase;
    private double descuento;
    private double volumen;

    // Constructor

    public Detergente(String marca, double precio, String tipoEnvase, double descuento, double volumen) {
        this.marca = marca;
        this.precio = precio;
        this.tipoEnvase = tipoEnvase;
        this.descuento = descuento;
        this.volumen = volumen;
    }

    //Getters y Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        precio = precio;
    }

    //Metodos de las intefaces

    //Metodos ConDescuento

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
        return precio - (precio - descuento);
    }

    //Metodo EsLiquido
    @Override
    public void setVolumen(double v) {
        v = volumen;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        env = tipoEnvase;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    // Metodo toString para mostrar la informacion del producto

    @Override
    public String toString() {
        return "Detergente{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                ", descuento=" + descuento +
                ", volumen=" + volumen +
                '}';
    }
}

