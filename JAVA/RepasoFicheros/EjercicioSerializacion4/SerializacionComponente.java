package EjercicioSerializacion4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializacionComponente {

    public static void main(String[] args) {
        ArrayList<Componente> componentes = new ArrayList<>();

        componentes.add(new Componente(1, "Placa Base"));
        componentes.add(new Componente(2, "Procesador"));
        componentes.add(new Componente(3, "RAM"));

        try {
            ObjectOutputStream fileout = new ObjectOutputStream(new FileOutputStream("EjercicioSerializacion4/componentes.dat"));

            fileout.writeObject(componentes);

            fileout.close();
            System.out.println("Serializacion completada");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
