package Ejercicio2_POO;

public class Lavadora extends Electrodomestico{

    // Atributos
    private double precio;
    private boolean aguaCaliente;

    // Constructores

    public Lavadora(String marca, double potencia, boolean aguaCaliente) {
        super(marca, potencia);
        this.aguaCaliente = false;
    }

    public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente) {
        super(marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    // Getters y Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

    public double getconsumo(int horas) {
        if (aguaCaliente == false) {
            return horas*getPotencia();
        } else {
            return horas * (getPotencia() + getPotencia() * 0.20);
        }
    }

    public double getCosteConsumo(int horas, double costeHora) {
        return getPotencia() * horas * costeHora;
    }
}
