import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        //Piedra papel tijera
        System.out.println("Genera un piedra, papel o tijera");

        switch ((int) (Math.random() * 3)) {
            case 0:
                System.out.println("Piedra");
                break;
            case 1:
                System.out.println("Papel");
                break;
            case 2:
                System.out.println("Tijera");
                break;
        }
    }
}

