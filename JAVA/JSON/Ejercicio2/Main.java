package Ejercicio2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        File archivoContacto = new File("/home/adrian/Documentos/1DAM/Programación/JAVA/JSON/Ejercicio2/contactos.json");
        

        // Menu del gestor de contactos

        int option;

        do {
            System.out.println(" == GESTOS DE CONTACTOS ==");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Listar todos los contactos");
            System.out.println("5. Guardar y salir");

            System.out.println("Elige la opcion que quieres hacer: ");
            option = sc.nextInt();

            switch (option) {
                case 1:


                case 2:

            }
        } while(option != 5);



        public static void crearContacto(List<Contactos> contactos) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Dime el nombre del contacot que quieres agregar: ");
            String nombre = entrada.nextLine();

            System.out.println("Dime el telefono del contacto: ");
            int telefono = entrada.nextInt();
            sc.nextLine();

            System.out.println("Dime el email del alumno: ");
            String email = entrada.nextLine();

            Contactos contacto = new Contactos(nombre, telefono, email);
            contactos.add(contacto);
        }
    }


}
