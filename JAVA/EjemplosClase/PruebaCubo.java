public class PruebaCubo {
    public static void main(String[] args) {
        Cubo cubito = new Cubo(2);
        Cubo cubazo = new Cubo(7);

        cubito.pinta();
        cubazo.pinta();

        cubito.vuelcaEn(cubazo);

        System.out.println(cubito);
    }
}
