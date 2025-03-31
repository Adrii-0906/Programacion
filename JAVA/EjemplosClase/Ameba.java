public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Soy una Ameba y peso " + peso + " microgramos";
    }

    public void come(Ameba comida) {
       peso += comida.getPeso()-1;
       comida.setPeso(0);
    }

    public void come(int peso) {
        this.peso += peso-1;

    }

    public static void main(String[] args) {
        Ameba a1 = new Ameba();
        a1.come(2);
        System.out.println(a1);
        Ameba a2 = new Ameba();
        a2.come(4);
        System.out.println(a2);
        a1.come(a2);
        System.out.println(a1);
        System.out.println(a2);
        a2.come(3);
        System.out.println(a2);
    }
}
