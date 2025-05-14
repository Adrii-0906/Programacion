package Ejercicio3CRUD;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    // Atributos
    private int id;
    private String nombre;
    private String email;
    private int edad;

    // Contructores
    public Usuario() {
    }

    public Usuario(int id, String nombre, String email, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                '}';
    }

    // Pasos para hacer el CRUD
    ArrayList<Usuario> usuarios = new ArrayList<>();
    private ObjectMapper mapper = new ObjectMapper();
    private Scanner sc = new Scanner(System.in);
    private String archivo = "Ejercicio3CRUD/usuarios.json";

    // Cargar archivos en el JSON
    public void cargarJSON() {
        try {
            File file = new File(archivo);
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            usuarios = mapper.readValue(file, new TypeReference<ArrayList<Usuario>>() {});

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Guardar JSON
    public void guardarJSON() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter(archivo), usuarios);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Pasamos con los metodos del CRUD

    // Crear usuarios
    public void crearUsuario() {
        System.out.println("Dime la id del usuario: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime el nombre del usuario: ");
        String nombre = sc.nextLine();

        System.out.println("Dime el email del usuario: ");
        String email = sc.nextLine();

        System.out.println("Dime la edad del usuario: ");
        int edad = sc.nextInt();
        sc.nextLine();

        usuarios.add(new Usuario(id, nombre, email, edad));
        guardarJSON();
        System.out.println("Usuario creado correctamente");
    }

    // Leer usuarios / Listar todos los usuarios
    public void listarTodosLosUsuarios() {
        System.out.println("== TODOS LOS USUARIOS ==");

        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }

    // Buscar un usuario en la lista
    public void buscarUsuario() {
        System.out.println("Dime el id del usuario que quieres buscar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                System.out.println(u);
                System.out.println("Usuario encontrado");
                return;
            }
        }
        System.out.println("Usuario no encontrado");
    }

    // Actualizar el nombre del usuario
    public void actualizarUsuario() {
        System.out.println("Dime la id del usuario que quieres actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                System.out.println("Dime el nuevo nombre del usuario: ");
                String nuevoNombre = sc.nextLine();
                 u.setNombre(nuevoNombre);
                 guardarJSON();
                System.out.println("Nombre actualizado correctamente");
                return;
            }
        }
        System.out.println("Usuario no encontrado");
    }

    // Eliminar un usuario de la lista
    public void eliminarUsuario() {
        System.out.println("Dime la id del usuario que quieres eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                usuarios.remove(u);
                guardarJSON();
                System.out.println("Usuario eliminado correctamente");
                return;
            }
        }
        System.out.println("Usuario no encotrado");
    }
}
