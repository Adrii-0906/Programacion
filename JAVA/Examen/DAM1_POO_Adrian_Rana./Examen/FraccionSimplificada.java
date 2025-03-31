public class FraccionSimplificada extends Fraccion {

    // Constructor
    public FraccionSimplificada(int num, int den) {
        super(num, den);
    }

    private int mcd() {
        int u = Math.abs(getNum());
        int v = Math.abs(getDen());
        while (v != 0) {
            int r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    public String simplificar(Fraccion fraccion) {
        int num1_result = fraccion.getNum() / mcd();
        int den1_result = fraccion.getDen() / mcd();

        return num1_result + "/" + den1_result;
    }

    // Metodo toString
    @Override
    public String toString() {
        return getNum() + "/" + getDen();
    }
}
