public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
        String cadena = "";
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                cadena += "*";
            }
            cadena += "\n";
        }
        return cadena;
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(6, 2);
        System.out.println(rectangulo);
    }
}
