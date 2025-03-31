public class Piramide {
    private int altura;

    public Piramide(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public String toString() {/*
        String cadena = "";
        int espacio = altura-1;
        int planta = 1;
        int longitudDeLineas = 1;

        while (planta <= this.altura) {

            //Insertamos los espacios
            for (int i = 1; i <= espacio; i++) {
                cadena += " ";
            }

            //Insertar linea de la piramide

            for (int i = 1; i <= longitudDeLineas; i++) {
                cadena += "*";
            }
            cadena += "\n";
            planta++;
            espacio--;
            longitudDeLineas += 2;

        }
        return cadena;
        */
        StringBuilder piramide = new StringBuilder();

        for (int i = 1; i < altura; i++) {
            //Agrego espacios
            for (int j = 1; j < altura - i; j++) {
                piramide.append(" ");
            }
            //Agrego asteriscos:
            //Patron de los asteriscos:
            //  primera fila: 1 asterisco, segunda fila: 3, tercera fila: 5, etc
            for (int j = 1; j <= 2 * i - 1; j++) {
                piramide.append("*");
            }
            //Agregar salto de linea
            piramide.append("\n");
        }
        return piramide.toString();
    }



    public static void main(String[] args) {
        Piramide piramide = new Piramide(5);
        System.out.println(piramide);
    }
}
