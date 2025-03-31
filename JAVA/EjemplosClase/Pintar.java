public class Pintar {

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

        public String toString() {
            return "Piramide [altura=" + altura + "]";
        }

        public void pintaPiramide(int num) {
            for(altura = 1; altura<=num; altura++){
                for(int blancos = 1; blancos<=num-altura; blancos++){
                    System.out.print(" ");
                }

                for(int i=1; i<=(altura*2)-1; i++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

    public class Rectangulo {

    }


}
