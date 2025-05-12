package CRUD;

public class Equipo {

    // Atributos

    private int id;
    private String nombre;
    private int titulos;

    // Constructor

    public Equipo() {
    }

    public Equipo(int id, String nombre, int titulos) {
        this.id = id;
        this.nombre = nombre;
        this.titulos = titulos;
    }

    // Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    // Metodo toString

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", titulos=" + titulos +
                '}';
    }
}
