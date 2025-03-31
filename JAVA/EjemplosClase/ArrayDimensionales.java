public class ArrayDimensionales {
    public static void main(String[] args) {
        int[][] n = new int[3][2];

        n[0][0] = 20;
        n[1][0] = 67;
        n[1][1] = 33;
        n[2][1] = 7;

        int fila, columna;

        for (fila = 0; fila < 3; fila++) {
            System.out.println("Fila: " + fila);
            for (columna = 0; columna < 2; columna++) {
                System.out.println("Columna: " + columna);
            }
        }
    }
}
