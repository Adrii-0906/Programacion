package Serializacion.Ejemplo2;

import Serializacion.Ejemplo1.Persona;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializarLista {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Pepe", 25));
        listaPersonas.add(new Persona("Adrian", 18));
        listaPersonas.add(new Persona("Carlos", 22));
        listaPersonas.add(new Persona("Javi", 21));

        System.out.println("Lista de personas serializadas: ");
        System.out.println(listaPersonas + "\n");

        try (ObjectInputStream in = new ObjectInputStream()) {

        }
    }
}