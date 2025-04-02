package Ejercicio4_POO;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio{

    // Atributos de la clase
    private double superficie;
    private double precioPintura;

    // Constructor de la clase, heredando los atributos de la clase abstracta Servicio
    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    // Getters y Setters
    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }


    @Override
    double costeMaterial() {
        double coste_material = (superficie / 7.8) * precioPintura;
        return coste_material;
    }

    @Override
    double costeManoObra() {
        double coste_mano_obra = (superficie / 10) * 9.5;
        return coste_mano_obra;
    }

    @Override
    double costeTotal() {
        double coste_total = costeMaterial() + costeManoObra();
        return coste_total;
    }


    public double costeAdicional() {
        if (superficie < 50) {
            double coste_adicional = (costeTotal() / 100) * 15;
            return coste_adicional;
        } else {
            return 0;
        }
    }

    @Override
    String detalleServicio() {
        System.out.println("TRABAJO DE PINTURA");
        System.out.println("Cliente: " + getCliente());
        System.out.println("Fecha de inicio: " + getFechaInicio());
        System.out.println("------------------------------------------------------");
        System.out.println("Pintor: " + getTrabajador());
        System.out.println("Coste Material: " + costeMaterial());
        System.out.println("Coste Mano Obra: " + costeManoObra());
        System.out.println("Coste Adicional: " + costeAdicional());
        System.out.println("TOTAL: " + (costeTotal() - costeAdicional()));
        System.out.println("------------------------------------------------------");
        return "";
    }
}
