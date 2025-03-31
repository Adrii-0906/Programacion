public class Boletin1_EjemploArray {
    public static void main(String[] args) {
        int[] n;

        n = new int[4]; //Se usa para decir los huecos que tendra la array
        int[] num = {0,1,2,3,4,5,6,7,8,9}; //Podemos poder la array de forma que le pongamos los valoraes directos

        System.out.println("Los valores del array son: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();

        //Podemos sustituir valores
        num[0] = 10;

        System.out.println("Una vez sustituido los valores del array son: ");

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();

        //Tambien podemos susmar sus valores
        num[2] = num[6] + num[7];

        System.out.println("Una vez sumado dos valores del array son: ");

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();

        //Ahora le decimos que valor va a tener cada hueco
        n[0] = 23;
        n[1] = 24;
        n[2] = 25;
        n[3] = 26;

        System.out.println("Los valores del array son: ");
        System.out.println(n[0] + " " + n[1] + " " + n[2] + " " + n[3]); // Imprimimos los valores del array de manera bruta

        System.out.println("Los valores del array son: ");
        for (int i = 0; i < n.length; i++) { // Imprimos los valores con un for.
            System.out.print(n[i]+" ");
        }
    }
}
