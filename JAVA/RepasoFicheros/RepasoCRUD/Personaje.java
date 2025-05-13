package RepasoCRUD;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Personaje {

    // Atributos
    private int id;
    private String nombre;
    private int poder;
    private int edad;

    // Constructor
    public Personaje() {
    }

    public Personaje(int id, String nombre, int poder, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.poder = poder;
        this.edad = edad;
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

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Metodo toString

    @Override
    public String toString() {
        return "Personaje{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", poder=" + poder +
                ", edad=" + edad +
                '}';
    }

    // Metodos para realizar el CRUD
    private ArrayList<Personaje> personajes = new ArrayList<>();
    private String archivo = "RepasoCRUD/personajes.json";
    private Scanner sc = new Scanner(System.in);
    private ObjectMapper mapper = new ObjectMapper();

    // Cargar JSON
    public void cargarJSON() {
        File file = new File(archivo);

        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            personajes = mapper.readValue(file, new TypeReference<ArrayList<Personaje>>() {});

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Guardar JSON
    public void guardarJSON() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(archivo), personajes);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Crear personajes
    public void crearPersonaje() {
        System.out.println("Dime la id del personaje: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime el nombre del personaje: ");
        String nombre = sc.nextLine();

        System.out.println("Dime el poder del personaje: ");
        int poder = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime la edad que tiene el personaje: ");
        int edad = sc.nextInt();
        sc.nextLine();

        personajes.add(new Personaje(id, nombre, poder, edad));
        guardarJSON();
        System.out.println("Personaje creado y guardado perfectamente");
    }

    // Listar personajes
    public void listarTodosPersonajes() {
        System.out.println("== TODOS LOS PERSONAJES ==");
        for (Personaje p : personajes) {
            System.out.println(p);
        }
    }

    // Buscar personaje
    public void buscarPersonaje() {
        System.out.println("Dime la id del personaje que estamos buscando: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Personaje p : personajes) {
            if (p.getId() == id) {
                System.out.println(p);
                System.out.println("Personaje encontrado");
                return;
            }
        }
        System.out.println("Personaje no encontrado");
    }

    // Actualizar personaje
    public void actualizarPersonaje() {
        System.out.println("Dime la id del personaje que quieres actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Personaje p : personajes) {
            if (p.getId() == id) {
                System.out.println("Dime el nuevo nombre del personaje: ");
                String nombreNuevo = sc.nextLine();
                p.setNombre(nombreNuevo);
                guardarJSON();
                System.out.println("Personaje actualizado correctamente");
                return;
            }
        }
        System.out.println("Personaje no entontrado");
    }

    // Eliminar personaje
    public void eliminarPersonaje() {
        System.out.println("Dime la id del personaje que quieres eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Personaje p : personajes) {
            if (p.getId() == id) {
                personajes.remove(p);
                guardarJSON();
                System.out.println("Personaje eliminado correctamente");
                return;
            }
        }
        System.out.println("Personaje no encontrado");
    }
}
