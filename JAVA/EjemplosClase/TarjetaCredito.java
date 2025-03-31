public class TarjetaCredito implements ProcesoPago{

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago de " + cantidad + " mediante tarjeta de credito.");
    }
    @Override
    public void cancelarPago() {
        System.out.println("Se ha cancelado el proceso de pago mediante tarjeta de credito.");
    }
}
