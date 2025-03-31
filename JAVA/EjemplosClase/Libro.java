public class Libro extends Publicacion{
    private boolean prestado = false;

    public Libro(String titulo, int ISBN, int anioPublicacion) {
        super(titulo, ISBN, anioPublicacion);
    }

    public void presta() {

    }

    public void estaPrestado() {
        if (prestado==true) {
            System.out.println("Esta prestado");
        } else {
            System.out.println("No esta prestado");
        }
    }

    public void devuelve() {
        this.prestado = true;
    }

}
