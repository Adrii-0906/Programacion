package Ejercicio1_POO;

public class Figura{

    // Atributos
    private String codigo;
    private double precio;
    private Dimension dimensiones;
    private Superheroe superheroe;


    // Constructor
    public Figura(String codigo, double precio, Dimension dimensiones, Superheroe superheroe) {
        this.codigo = codigo;
        this.precio = precio;
        this.dimensiones = dimensiones;
        this.superheroe = superheroe;
    }


    // Setters y Getters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Figura{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", dimensiones=" + dimensiones +
                ", superheroe='" + superheroe + '\'' +
                '}';
    }

    //Metodo
    public void subirPrecio(double cantidad) {
        precio += cantidad;
    }
}
