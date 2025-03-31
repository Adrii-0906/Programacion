public class Tranferecnia implements ProcesoPago{

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Proceso de pago de " + cantidad + " mediante transferencia.");
    }
    @Override
    public void cancelarPago() {
        System.out.println("Proceso de transferencia de cancelado.");
    }
}
