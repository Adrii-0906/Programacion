public class DoWhile {
    public static void main(String[] args) {
        System.out.println("20 numeros aleatorios entre 0 y 10");
        System.out.println("Sin llegar a 10 (con decimales)");
        for (int i = 1; i <= 20; i++) {
            System.out.println((int)(Math.random() * 10) + i+" ");
        }
    }
}
