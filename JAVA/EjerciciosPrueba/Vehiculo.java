public class Vehiculo {

    private int vehiculosCreados;
    private int kilometrosTotales;
    private int kilometrosRecorridos;

    public Vehiculo() {
        this.vehiculosCreados = 0;
        this.kilometrosTotales = 0;
        this.kilometrosRecorridos = 0;
    }
    public int getVehiculosCreados() {
        return vehiculosCreados;
    }
    public void setVehiculosCreados(int vehiculosCreados) {
        this.vehiculosCreados = vehiculosCreados;
    }
    public int getKilometrosTotales() {
        return kilometrosTotales;
    }
    public void setKilometrosTotales(int kilometrosTotales) {
        this.kilometrosTotales = kilometrosTotales;
    }
    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }



    public class bicicletas extends Vehiculo {
        super(int vehiculosCreados, int kilometrosTotales);

    }

    public class coche extends Vehiculo {

    }
}
