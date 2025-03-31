public abstract class Animal {
    private int edad;
    private String nombre;

    public Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void dormir() {
        System.out.println(nombre+" Esta durmiendo");
    }
    public abstract void hacerSonido();

}
