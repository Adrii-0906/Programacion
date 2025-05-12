package CRUDPersistencia;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bebida {

    // Atributos
    private int id;
    private String nombre;
    private Boolean alcohol;

    // Constructor

    public Bebida() {

    }

    public Bebida(int id, String nombre, Boolean alcohol) {
        this.id = id;
        this.nombre = nombre;
        this.alcohol = alcohol;
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

    public Boolean getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Boolean alcohol) {
        this.alcohol = alcohol;
    }

    // Metodo toString

    @Override
    public String toString() {
        return "Bebida{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", alcohol=" + alcohol +
                '}';
    }


    // Cosas para crear la persistencia
    private ArrayList<Bebida> bebidas = new ArrayList<>();
    private String archivo = "CRUDPersistencia/bebidas.json";
    private ObjectMapper mapper = new ObjectMapper();
    private Scanner sc = new Scanner(System.in);

    // Cargar las bebidas
    public void cargarBebidas() {
        File file = new File(archivo);

        if (file.exists()) {
            try {
                bebidas = mapper.readValue(file, new TypeReference<ArrayList<Bebida>>() {});

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    // Guardar JSON
    public void guardarBebidas() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(archivo), bebidas);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Crear Bebidas
    public void crearBebida() {
        System.out.println("Dime la id de la bebida");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime el nombre de la bebida");
        String nombre = sc.nextLine();

        System.out.println("Dime si la bebida lle alcohol");
        Boolean alcohol = sc.nextBoolean();
        sc.nextLine();

        bebidas.add(new Bebida(id, nombre, alcohol));
        guardarBebidas();
        System.out.println("Bebida creada y guardada");
    }

    // Listar Bebidas
    public void leerBebida() {
        System.out.println("Lista de bebidas guardadas");

        for (Bebida b : bebidas) {
            System.out.println(b);
        }
        System.out.println();
    }

    // Actualizar Bebidas
    public void actualizarBebida() {
        System.out.println("Dime la id de la bebida");
        int id = sc.nextInt();
        sc.nextLine();

        for (Bebida b : bebidas) {
            if (b.getId() == id) {
                System.out.println("Dime el nombre nuevo de la bebida");
                String nuevoNombre = sc.nextLine();
                b.setNombre(nuevoNombre);
                guardarBebidas();
                System.out.println("Bebida guardada y actulizada");
                return;
            }
        }
        System.out.println("Bebida no encontrada");
    }

    // Eliminar Bebibas
    public void eliminarBebida() {
        System.out.println("Dime la id de la bebida que quieras eliminar");
        int id = sc.nextInt();
        sc.nextLine();

        for (Bebida b : bebidas) {
            if (b.getId() == id) {
                bebidas.remove(b);
                guardarBebidas();
                System.out.println("Bebida eliminada correctamente");
                return;
            }
        }
        System.out.println("Bebida no encontrada");
    }
}
