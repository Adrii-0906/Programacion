import java.util.Scanner;

public class MiniJuego {
    // Se coloca una mina y un tesoro de forma aleatoria en un cuadrado de 4 filas y 5 columnas. El usuario intentara averiguar adonde esta el tesero

    // Declaramos las siguientes variables
    static final int vacio = 0;
    static final int mina = 1;
    static final int tesoro = 2;
    static final int intento = 3;


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaramos las variables x, y
        int x;
        int y;

        //Hacemos el cuadrante donde vamos a jugar
        int[][] cuadrante = new int[5][4];

        //Usamos el for para iniciar el array
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 4; y++) {
                cuadrante[x][y] = vacio;
            }
        }

        //Ahora generamos la mina con el Math.random

        int minaX = (int) (Math.random() * 5);
        int minaY = (int) (Math.random() * 4);
        cuadrante[minaX][minaY] = mina;

        // Ahora vamos a colocar el tesero

        int tesoroX;
        int tesoroY;

        do {
            tesoroX = (int) (Math.random() * 5);
            tesoroY = (int) (Math.random() * 4);
        } while (minaX == tesoroX && minaY == tesoroY); // Si el tesoroX y tesoroY ya generados coincide con minaX y minaY, el bucle se detiene.

        cuadrante[tesoroX][tesoroY] = tesoro;

        System.out.println("BUSCA EL TESORO!");
        boolean salir = false;
        String c = "";

        do {
            // Pinta el cuadrante
            for(y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for(x = 0; x < 5; x++) {
                    if (cuadrante[x][y] == intento) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println("  ----------\n  0 1 2 3 4\n");

            //Pedimos las cordenadas
            System.out.println("Dime la x: ");
            x = entrada.nextInt();
            System.out.println("Dime la y: ");
            y = entrada.nextInt();

            // Mira lo que hay en las coordenadas indicadas por el usuario
            switch(cuadrante[x][y]) {
                case vacio:
                    cuadrante[x][y] = intento;
                    if ((Math.abs(x - minaX) < 2) && (Math.abs(y - minaY) < 2)) {
                        System.out.println("Cuidado, hay una mina cerca.");
                    }
                    break;
                case mina:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                case tesoro:
                    System.out.println("Enhorabuena, has encontrado el tesoro.");
                    salir = true;
            }
        } while (!salir);
        // Pinta el cuadrante
        for(y = 3; y >= 0; y--) {
            System.out.print(y + " ");
            for(x = 0; x < 5; x++) {
                switch(cuadrante[x][y]) {
                    case vacio:
                        c = "  ";
                        break;
                    case mina:
                        c = "* ";
                        break;
                    case tesoro:
                        c = "€ ";
                        break;
                    case intento:
                        c = "x ";
                        break;
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("  ----------\n  0 1 2 3 4\n");
    }
}