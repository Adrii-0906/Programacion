public class Terminal {
    private String numeros;

    public Terminal(String numeros) {
        this.numeros = numeros;
    }
    public String getNumeros() {
        return numeros;
    }
    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public void llama(Terminal numeros, int seg) {
        numeros.setNumeros(numeros.getNumeros());
        System.out.println("Nº "+numeros.getNumeros()+" - "+seg+"s de conversacion");
    }

    public static void main(String[] args) {
        Terminal t1 = new Terminal("678 11 22 33");
        Terminal t2 = new Terminal("644 74 44 69");
        Terminal t3 = new Terminal("622 32 89 09");
        Terminal t4 = new Terminal("664 73 98 18");
        System.out.println(t1);
        System.out.println(t2);
        t1.llama(t2, 320);
        t1.llama(t3, 200);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}
