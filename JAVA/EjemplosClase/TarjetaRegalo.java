import java.util.Random;

public class TarjetaRegalo {
    private String Tarjeta;
    private int saldo;

    public TarjetaRegalo(int saldo) {
        this.Tarjeta = crearTarjeta();
        this.saldo = saldo;
    }

    public String getTarjeta() {
        return Tarjeta;
    }
    public void setTarjeta(String Tarjeta) {
        this.Tarjeta = Tarjeta;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Tarjeta N. "+ Tarjeta + " - Saldo: "+ saldo + "€";
    }

    public String crearTarjeta() {
        Random aleatorio = new Random();
        int numero=0; 
        int contador = 0;
        String tarjeta = "";
        while (contador < 5) {
            contador++;
            numero = aleatorio.nextInt(0,9);
            tarjeta += numero;
        }
        return tarjeta;
    }

    public double gasta(double gastos) {

        if (saldo >= gastos) {
            saldo -= gastos;
        } else {
            System.out.println("Saldo Insuficiente para gastar "+ saldo + "€");
        }
        return gastos;
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjeta) {
        int fusion = saldo + otraTarjeta.saldo;
        saldo = 0;
        TarjetaRegalo nuevaTarjeta = new TarjetaRegalo(fusion);
        otraTarjeta.saldo= 0;
        return nuevaTarjeta;
    }

    public static void main(String[] args) {
        TarjetaRegalo t1 = new TarjetaRegalo(100);
        TarjetaRegalo t2 = new TarjetaRegalo(120);
        System.out.println(t1);
        System.out.println(t2);
        t1.gasta(45.90);
        t2.gasta(5);
        t2.gasta(200);
        t1.gasta(3.55);
        System.out.println(t1);
        System.out.println(t2);
        TarjetaRegalo t3 = t1.fusionaCon(t2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
