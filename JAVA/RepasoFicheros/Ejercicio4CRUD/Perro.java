package Ejercicio4CRUD;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Perro {

    // Atributos
    private int id;
    private String nombre;
    private String raza;

    // Constructor
    public Perro() {
    }

    public Perro(int id, String nombre, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
    }

    // Geters & Setters
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Metodo toString

    @Override
    public String toString() {
        return "Perro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }

    // Pasos para hacer la persistencia
    private ArrayList<Perro> perros = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    String archivo = "Ejercicio4CRUD/perros.json";
    private ObjectMapper mapper = new ObjectMapper();

    // Cargar el JSON
    public void cargarJSON() {
        try {
            File file = new File(archivo);
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            perros = mapper.readValue(file, new TypeReference<ArrayList<Perro>>() {});
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Guardar JSON
    public void guardarJSON() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter(archivo), perros);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Crear Perro
    public void crearPerro() {
        System.out.println("Dime la id del perro: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime el nombre del perro: ");
        String nombre = sc.nextLine();

        System.out.println("Dime la raza del perro: ");
        String raza = sc.nextLine();

        perros.add(new Perro(id, nombre, raza));
        guardarJSON();
        System.out.println("El perro se ha creado");
    }

    // Listar todos los perros
    public void listarTodosLosPerros() {
        System.out.println("== LISTA DE LOS PERROS ==");

        for (Perro p : perros) {
            System.out.println(p);
        }
    }

    // Buscar un perro
    public void buscarPerro() {
        System.out.println("Dime la id del perro que quieres buscar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Perro p : perros) {
            if (p.getId() == id) {
                System.out.println(p);
                System.out.println("Perro econtrado");
                return;
            }
        }
        System.out.println("Perro no encontrado");
    }

    // Actualizar perro
    public void actualizarPerro() {
        System.out.println("Dime la id del perro que quieres actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Perro p : perros) {
            if (p.getId() == id) {
                System.out.println("Dime el nombre nuevo del perro: ");
                String nuevoNombre = sc.nextLine();
                p.setNombre(nuevoNombre);
                guardarJSON();
                System.out.println("Perro actualizado correctamente");
                return;
            }
        }
        System.out.println("Perro no encontrado");
    }

    // Eliminar perro
    public void eliminarPerro() {
        System.out.println("Dime la id del perro que quieres eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Perro p : perros) {
            if (p.getId() == id) {
                perros.remove(p);
                guardarJSON();
                System.out.println("Perro eliminado correctamente");
                return;
            }
        }
        System.out.println("Perro no encontrado");
    }
}
