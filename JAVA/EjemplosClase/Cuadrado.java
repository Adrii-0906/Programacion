public class Cuadrado {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    public String toString() {
        StringBuilder cuadrado = new StringBuilder();
        int lado = this.getLado();
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                if (i == 1 || j == 1 || i == lado || j == lado) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        return cuadrado.toString();
    }

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(4);
        System.out.println(cuadrado);
    }
}
