package Ejercicio6CRUD;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dinero {

    // Atributos
    private int id;
    private int cantidad;
    private String tipo; // Monedas o billetes

    // Constructor
    public Dinero() {
    }

    public Dinero(int id, int cantidad, String tipo) {
        this.id = id;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Dinero{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    // Pasos para hacer un CRUD
    private ArrayList<Dinero> dineros = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private String archivo = "Ejercicio6CRUD/dineros.json";
    private ObjectMapper mapper = new ObjectMapper();

    // Ahora vamos crear los metodos para crear el JSON

    // Cargar JSON
    public void cargarJSON() {
        try {
            File file = new File(archivo);
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            dineros = mapper.readValue(file, new TypeReference<ArrayList<Dinero>>() {});

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Guardar JSON
    public void guardarJSON() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter(archivo), dineros);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Ahora vamos con los metodos del CRUD

    // Crear dinero
    public void crearDinero() {
        System.out.println("Dime la id del dinero: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime la cantidad de dinero: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime el tipo del dinero (Billetes/Monedas): ");
        String tipo = sc.nextLine();

        dineros.add(new Dinero(id, cantidad, tipo));
        guardarJSON();
        System.out.println("Guardado correctamente");
    }

    // Leer Dinero
    public void listarTodoElDinero() {
        System.out.println("== TODO EL DINERO CREADO ==");

        for (Dinero d : dineros) {
            System.out.println(d);
        }
    }

    // Buscar dinero
    public void buscarDinero() {
        System.out.println("Dime la id del dinero que quieres buscar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Dinero d : dineros) {
            if (d.getId() == id) {
                System.out.println(d);
                return;
            }
        }
        System.out.println("Dinero no econtrado");
    }

    // Actualizar dinero
    public void actualizarDinero() {
        System.out.println("Dime la id del dinero que quieres actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Dinero d : dineros) {
            if (d.getId() == id) {
                System.out.println("Dime la nueva cantidad del dinero: ");
                int cantidadNueva = sc.nextInt();
                sc.nextLine();
                d.setCantidad(cantidadNueva);
                guardarJSON();
                System.out.println("Cantidad actualiza con exito");
                return;
            }
        }
    }

    // Eliminar dinero
    public void eliminarDinero() {
        System.out.println("Dime la id del dinero que quieres: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Dinero d : dineros) {
            if (d.getId() == id) {
                dineros.remove(d);
                guardarJSON();
                System.out.println("Dinero eliminado correctamente");
                return;
            }
        }
    }


}
