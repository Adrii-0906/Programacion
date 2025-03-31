import javax.swing.*;

public class JOption {
    public static void main(String[] args) {
        String[] paises = new String[2];
        int[] numeros = new int[2];
        for (int i = 0; i < 2; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce el pais " + (i + 1)+": ");
            System.out.println(paises[i]);
        }
        for (int j = 0; j < numeros.length; j++) {
            numeros[j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero " + (j + 1)+": "));
            System.out.println(numeros[j]);
        }
    }
}
