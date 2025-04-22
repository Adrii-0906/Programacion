package Ejercicio4_POO;

import java.time.LocalDate;

public abstract class Servicio {

    // Atributos comunes
    private String trabajador;
    private LocalDate fechaInicio;
    private String cliente;

    // Constructor
    public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    abstract double costeMaterial();
    abstract double costeManoObra();
    abstract double costeTotal();
    abstract String detalleServicio();

}
