public class PruebaPagos {

    public static void main(String[] args) {
        ProcesoPago paypal = new Paypal();
        ProcesoPago tarjeta = new TarjetaCredito();
        ProcesoPago transferencia = new Tranferecnia();

        paypal.procesarPago(100);
        tarjeta.procesarPago(100);
        transferencia.procesarPago(100);

        transferencia.cancelarPago();

    }
}
