public class Paypal implements ProcesoPago {

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago de " + cantidad + " mediante PayPal.");
    }
    @Override
    public void cancelarPago() {
        System.out.println("Cancelar pago de Paypal.");
    }
}
