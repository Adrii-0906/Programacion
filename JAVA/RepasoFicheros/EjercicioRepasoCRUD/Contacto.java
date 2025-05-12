package EjercicioRepasoCRUD;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Contacto {

    // Atributos
    private String nombre;
    private int telefono;
    private String email;

    // Constructor

    public Contacto() {
    }

    public Contacto(String nombre, int telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Metodo ToString

    @Override
    public String toString() {
        return "Contactos{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                '}';
    }

    // Creacion de la persistencia de datos
    ArrayList<Contacto> contactos = new ArrayList<>();
    ObjectMapper mapper = new ObjectMapper();
    private Scanner sc = new Scanner(System.in);
    private String archivo = "EjercicioRepasoCRUD/contactos.json";

    // Metodo para cargar el JSON
    public void cargarContactos() {
        File file = new File(archivo);
        try {
            contactos = mapper.readValue(file, new TypeReference<ArrayList<Contacto>>() {});

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Metodo para guardar los archivos en el JSON
    public void guardarContacto() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(archivo), contactos);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Crear contactos
    public void crearContacto() {
        System.out.println("Dime el nombre del contacto que quieres agregar: ");
        String nombre = sc.nextLine();

        System.out.println("Dime el telefono del contacto que quieres agregar: ");
        int telefono = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime email del contacto que quieres agregar: ");
        String email = sc.nextLine();

        contactos.add(new Contacto(nombre, telefono, email));
        guardarContacto();
        System.out.println("Contacto creado y guardado correctamente");
    }

    // Listar contactos
    public void leerContactos() {
        System.out.println("== TODOS LOS CONTACTOS ==");

        for (Contacto c : contactos) {
            System.out.println(c);
        }
    }

    // Buscar contacto
    public void buscarContacto() {
        System.out.println("Dime el nombre del contacto que quieres buscar: ");
        String nombre = sc.nextLine();

        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(c);
                System.out.println("El contacto ha sido econtrado correctamente");
                return;
            }
        }
        System.out.println("Contacto no encontrado");
    }

    // Actualizar contactos
    public void actualizarContactos() {
        System.out.println("Dime el nombre del contacto que quieres actulizar: ");
        String nombre = sc.nextLine();

        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Dime el nombre nuevo del contacto: ");
                String nombreNuevo = sc.nextLine();
                c.setNombre(nombreNuevo);
                guardarContacto();
                System.out.println("Contacto actualizado correctamente");
                return;
            }
        }
        System.out.println("El contacto no ha sido encontrado");
    }

    // Eliminar contacto
    public void eliminarContacto() {
        System.out.println("Dime el nombre del contacto que quieres eliminar: ");
        String nombre = sc.nextLine();

        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(c);
                guardarContacto();
                System.out.println("Contacto eliminado correctamente");
                return;
            }
        }
        System.out.println("El contacto no ha sido encontrado");
    }
}
