package Ejercicio2_POO;

public class Electrodomestico {

    // Atributos
    private String tipo;
    private String marca;
    private double potencia;

    // Constructor
    public Electrodomestico(String tipo, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    // Getters y Setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }

    // Metodos
    public int getConsumo(int horas) {
        return (int) (horas * this.potencia);
    }

    public double getCosteConsumo(int horas, double costeHora) {
        return this.potencia * horas * costeHora;
    }
}
