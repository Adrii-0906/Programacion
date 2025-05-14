package Ejercicio5CRUD;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cancion {

    // Atributos
    private int id;
    private String nombre;
    private String genero;

    // Constructor
    public Cancion() {
    }

    public Cancion(int id, String nombre, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Cancion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    // Pasos para crear el CRUD
    private ArrayList<Cancion> canciones = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private ObjectMapper mapper = new ObjectMapper();
    private String archivo = "Ejercicio5CRUD/canciones.json";

    // CargarJSON
    public void cargarJSON() {

        try {
            File file = new File(archivo);
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            canciones = mapper.readValue(file, new TypeReference<ArrayList<Cancion>>() {});

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // GuardarJSON
    public void guardarJSON() {

        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter(archivo), canciones);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Pasamos con la creacion de los metodos del CRUD

    // Crear cancion
    public void crearCancion() {
        System.out.println("Dime la id de la cancion: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime el nombre de la cancion: ");
        String nombre = sc.nextLine();

        System.out.println("Dime el genero de la cancion: ");
        String genero = sc.nextLine();

        canciones.add(new Cancion(id, nombre, genero));
        guardarJSON();
        System.out.println("Cancion guardada correctamente");
    }

    // Listar todas las canciones
    public void listarTodasLasCanciones() {
        System.out.println("== TODAS LAS CANCIONES ==");


        if (canciones.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            for (Cancion c : canciones) {
                System.out.println(c);
            }
        }
    }

    // Buscar una cancion en la lista
    public void buscarCancion() {
        System.out.println("Dime la id de la cancion que quieres buscar: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (canciones.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            for (Cancion c : canciones) {
                if (c.getId() == id) {
                    System.out.println(c);
                    return;
                }
            }
        }
    }

    // Actualizar el nombre de la cancion
    public void actualizarCancion() {
        System.out.println("Dime la id de la cancio que quieres actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (canciones.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            for (Cancion c : canciones) {
                if (c.getId() == id) {
                    System.out.println("Dime el nombre nuevo de la cancion: ");
                    String nuevoNombre = sc.nextLine();
                    c.setNombre(nuevoNombre);
                    guardarJSON();
                    return;
                }
            }
        }
    }

    // Eliminar cancion de la lista
    public void eliminarCancion() {
        System.out.println("Dime la id de la cancion que quieres eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (canciones.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            for (Cancion c : canciones) {
                if (c.getId() == id) {
                    canciones.remove(c);
                    guardarJSON();
                    return;
                }
            }
        }
    }
}
