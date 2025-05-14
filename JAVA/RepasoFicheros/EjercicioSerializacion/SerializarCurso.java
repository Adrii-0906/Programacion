package EjercicioSerializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarCurso {

    public static void main(String[] args) {
        Curso curso = new Curso(1, "DAM", 1750);

        try {
            FileOutputStream fileout = new FileOutputStream("EjercicioSerializacion/coche.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);

            out.writeObject(curso);

            fileout.close();
            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
