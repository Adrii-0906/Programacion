public class Caballo {
    private String nombre;
    private String color;
    private int edad;
    private int carrerasGanadas;
    public Caballo(String nombre, String color, int edad, int carrerasGanadas) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.carrerasGanadas = carrerasGanadas;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void cabalga() {
        System.out.println("Tocata Tocata Tocata");
    }
    public void relincha(){
        System.out.println("Vieeeeeeeeennnnn");
    }

    public static void main(String[] args) {
        Caballo caballo = new Caballo("Adrian","Negro",11,189);
        caballo.cabalga();
        caballo.relincha();
    }
}
