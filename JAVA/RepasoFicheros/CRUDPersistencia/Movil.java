package CRUDPersistencia;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Movil {

    // Atributos
    private int id;
    private String marca;
    private String modelo;
    private double precio;

    // Constructor
    public Movil() {
    }

    public Movil(int id, String marca, String modelo, double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Movil{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }

    // Cosas para la persistencia de datos
    private ArrayList<Movil> moviles = new ArrayList<>();
    String archivo = "CRUDPersistencia/moviles.json";
    private ObjectMapper mapper = new ObjectMapper();
    private Scanner sc = new Scanner(System.in);

    // Cargamos los datos de JSON
    public void cargarMoviles() {
        File file = new File(archivo);

        if (file.exists()) {
            try {
                moviles = mapper.readValue(file, new TypeReference<ArrayList<Movil>>() {});

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    // Guardamos los datos en el JSON
    public void guardarJSON() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(archivo), moviles);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Crear movil
    public void crearMovil() {
        System.out.println("Dime la id del movil: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime el la marca del movil: ");
        String marca = sc.nextLine();

        System.out.println("Dime el modelo del movil: ");
        String modelo = sc.nextLine();

        System.out.println("Dime el precio del movil: ");
        double precio = sc.nextDouble();

        moviles.add(new Movil(id, marca, modelo, precio));
        guardarJSON();
        System.out.println("Movil creado y guardado correctamente");
    }

    // Listar moviles
    public void leerMovil() {
        System.out.println("Lista de moviles");

        for (Movil m : moviles) {
            System.out.println(m);
        }
        System.out.println();
    }

    // Actualizar movil
    public void actualizarMovil() {
        System.out.println("Dime la id del movil que quieres actualizar");
        int id = sc.nextInt();
        sc.nextLine();

        for (Movil m : moviles) {
            if (m.getId() == id) {
                System.out.println("Dime el modelo nuevo de tu movil");
                String modeloNuevo = sc.nextLine();
                m.setModelo(modeloNuevo);
                guardarJSON();
                System.out.println("Modelo actualizado y guardado correctamente");
                return;
            }
        }
        System.out.println("Movil no encontrado");
    }

    // Eliminar movil
    public void eliminarMovil() {
        System.out.println("Dime la id del movil que quieres eliminar");
        int id = sc.nextInt();
        sc.nextLine();

        for (Movil m : moviles) {
            if (m.getId() == id) {
                moviles.remove(m);
                guardarJSON();
                System.out.println("Movil elminado correctamente");
                return;
            }
        }
        System.out.println("Movil no encontrado");
    }

}
