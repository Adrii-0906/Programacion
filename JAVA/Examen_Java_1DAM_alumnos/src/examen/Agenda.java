package src.examen;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Clase que gestiona una lista de contactos.
 * Se deben implementar los métodos indicados y completar getters y setters de la clase Agenda
 */
public class Agenda {
    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    Scanner sc = new Scanner(System.in);


    /**
     * Agrega un nuevo contacto a la agenda.
     */
    public void agregarContacto(Contacto contacto) {
        // TODO: Añadir el contacto a la lista
        contactos.add(contacto);
        guardarJSON();
    }

    /**
     * Elimina un contacto por nombre.
     * @return true si se eliminó correctamente, false si no se encontró
     */
    public boolean eliminarContacto(String nombre) {
        // TODO: Buscar y eliminar contacto por nombre (ignorar mayúsculas/minúsculas)

        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(c);
                guardarJSON();
                System.out.println("Contacto eliminado");
                return true;
            }
        }
        return false;
    }

    /**
     * Busca todos los contactos que contengan el nombre dado.
     */
    public List<Contacto> buscarContacto(String nombre) {
        // TODO: Buscar contactos cuyo nombre contenga el texto indicado

        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(c);
                System.out.println("Contacto encontrado");
            }
        }
        return contactos;
    }

    public List<Contacto> listarTodosLosContactos() {

        for (Contacto c : contactos) {
            System.out.println(c);
        }

        return null;
    }

    // Pasos para implementar el CRUD

    private ObjectMapper mapper = new ObjectMapper();
    String archivo = "resources/contactos.json";

    // Cargar JSON
    public void cargarJSON() {

        File file = new File(archivo);

        try {

            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            contactos = mapper.readValue(file, new TypeReference<ArrayList<Contacto>>() {});

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Guardar JSON
    public void guardarJSON() {

        try {

            mapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter(archivo), contactos);

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
