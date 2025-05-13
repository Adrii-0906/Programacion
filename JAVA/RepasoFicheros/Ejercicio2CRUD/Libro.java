package Ejercicio2CRUD;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Libro {

    // Atributos
    private int ISBN;
    private String autor;
    private String titulo;
    private int paginas;
    private double precio;

    // Constructor
    public Libro() {
    }

    public Libro(int ISBN, String autor, String titulo, int paginas, double precio) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
        this.precio = precio;
    }

    // Getters & Setters
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
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
        return "Libro{" +
                "ISBN=" + ISBN +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                ", precio=" + precio +
                '}';
    }

    // Metodos para crear el CRUD
    private ArrayList<Libro> libros = new ArrayList<>();
    private String archivo = "Ejercicio2CRUD/libros.json";
    private ObjectMapper mapper = new ObjectMapper();
    private Scanner sc = new Scanner(System.in);

    // Cargar archivo
    public void cargarJSON() {
        File file = new File(archivo);

        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            libros = mapper.readValue(file, new TypeReference<ArrayList<Libro>>() {});

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Guardar JSON
    public void guardarJSON() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(archivo), libros);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Crear Libro
    public void crearLibro() {
        System.out.println("Dime el ISBN del libro: ");
        int ISBN = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime el autor del libro: ");
        String autor = sc.nextLine();

        System.out.println("Dime el titulo del libro: ");
        String titulo = sc.nextLine();

        System.out.println("Dime las paginas del libro: ");
        int paginas = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime el precio del libro: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        libros.add(new Libro(ISBN, autor, titulo, paginas, precio));
        guardarJSON();
        System.out.println("Libro creado correctamente");
    }

    // Listar libros
    public void listarLibros() {
        System.out.println("== TODOS LOS LIBROS ==");

        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    // Buscar libro
    public void buscarLibro() {
        System.out.println("Dime el ISBN del libro que quieres buscar: ");
        int ISBN = sc.nextInt();
        sc.nextLine();

        for (Libro l : libros) {
            if (l.getISBN() == ISBN) {
                System.out.println(l);
                System.out.println("El libro ha sido encontrado");
                return;
            }
        }
        System.out.println("El libro no ha sido encontrado");
    }

    // Actualizar libro
    public void actualizarLibro() {
        System.out.println("Dime el ISBN del libro que quieres actualizar: ");
        int ISBN = sc.nextInt();
        sc.nextLine();

        for (Libro l : libros) {
            if (l.getISBN() == ISBN) {
                System.out.println("Dime el nuevo titulo del libro: ");
                String tituloNuevo = sc.nextLine();
                l.setTitulo(tituloNuevo);
                guardarJSON();
                System.out.println("Titulo actualizado correctamente");
                return;
            }
        }
        System.out.println("ISBN no encontrado");
    }

    // Eliminar libro
    public void eliminarLibro() {
        System.out.println("Dime el ISBN del libro que quieres eliminar: ");
        int ISBN = sc.nextInt();
        sc.nextLine();

        for (Libro l : libros) {
            if (l.getISBN() == ISBN) {
                libros.remove(l);
                guardarJSON();
                System.out.println("Libro eliminado correctamente");
                return;
            }
        }
        System.out.println("ISBN no encontrado");
    }
}
