public class BibliotecaMates {

    public static boolean esPrimo(int num) {
        if (num % num == 0 && num % 1 == 0) {
            return true;
        } else{
            return false;
        }
    }
    public static int siguientePrimo(int num) {
        while (esPrimo(num++)) {
            System.out.println(num);
        }

        return num;
    }

}
