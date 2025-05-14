package EjercicioSerializacion4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializacionComponente {

    public static void main(String[] args) {
        ArrayList<Componente> componentesRecuperados = new ArrayList<>();

        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("EjercicioSerializacion4/componentes.dat"));
            componentesRecuperados = (ArrayList<Componente>) input.readObject();

            for (Componente c : componentesRecuperados) {
                System.out.println(c);
            }

            input.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
