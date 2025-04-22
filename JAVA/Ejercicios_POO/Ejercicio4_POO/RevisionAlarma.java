package Ejercicio4_POO;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{

    // Atributos
    private int numeroAlarmas;


    // Constructor
    public RevisionAlarma(String trabajador, LocalDate fechaInicio, String cliente, int numeroAlarmas) {
        super(trabajador, fechaInicio, cliente);
        this.numeroAlarmas = numeroAlarmas;
    }

    // Get y Set

    public int getNumeroAlarmas() {
        return numeroAlarmas;
    }

    public void setNumeroAlarmas(int numeroAlarmas) {
        this.numeroAlarmas = numeroAlarmas;
    }


    @Override
    double costeMaterial() {
        return 0;
    }

    @Override
    double costeManoObra() {
        double coste_mano_obra = (numeroAlarmas / 3) * 40;
        return coste_mano_obra;
    }

    @Override
    double costeTotal() {
        double coste_total = costeManoObra();
        return coste_total;
    }

    @Override
    String detalleServicio() {
        System.out.println("REVISION PREIODICA ALARMAS CONTRAINCENCIOS");
        System.out.println("Clientes: " + getCliente());
        System.out.println(("Fecha Revision: " + getFechaInicio()));
        System.out.println("----------------------------------------------------------");
        System.out.println("TOTAL: " + costeTotal());
        System.out.println("----------------------------------------------------------");
        return "";
    }
}
