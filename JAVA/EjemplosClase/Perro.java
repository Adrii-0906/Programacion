public class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(edad, nombre);
    }
    @Override
    public void hacerSonido(){
        System.out.println("GUAU GUAU GUAU");
    }

}
