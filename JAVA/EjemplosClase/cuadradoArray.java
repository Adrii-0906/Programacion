import java.lang.reflect.Array;

public class cuadradoArray {
    private int lado;

    public cuadradoArray(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    public void pintarCuadrado() {
        int [][] lado = new int[this.lado][this.lado];

        for (int i = 0; i < this.lado; i++) {
            for (int j = 0; j < this.lado; j++) {
                if (i == 0 || j == 0 || i == this.lado || j == this.lado) {
                    lado[i][j] = (int) (Math.random() * 10);
                    System.out.print(" * ");
                } else {
                    lado[i][j] = (int) (Math.random() * 10);
                }
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        cuadradoArray cuadrado = new cuadradoArray(5);
        cuadrado.pintarCuadrado();
    }
}
