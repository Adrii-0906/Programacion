package Ejemplo1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //Usuario user = new Usuario("Pepe", "pepe@gmail.com");
       // Usuario user2 = new Usuario("Adri","adri@gmail.com");

        ObjectMapper mapper = new ObjectMapper();

        // Convertir el objeto a JSON
      //  mapper.writeValue(new File("/home/adrian/Documentos/1DAM/Programación/JAVA/JSON/Ejemplo1/javausuario.json"), user);
       // System.out.println("Usuario guardado en JSON: " + user);

        // Leer el JSON y convertirlo a objeto
        // Usuario user2 = mapper.readValue(new File("/home/adrian/Documentos/1DAM/Programación/JAVA/JSON/Ejemplo1/javausuario.json"), Usuario.class);
       // Usuario[] usuarios = mapper.readValue(new File("/home/adrian/Documentos/1DAM/Programación/JAVA/JSON/Ejemplo1/javausuario.json"), Usuario[].class);
       // for (Usuario u : usuarios) {
     //       System.out.println("Usuario leído desde JSON: " + u);
       // }

        //System.out.println("Usuario leído desde JSON: " + user2);

    }
}