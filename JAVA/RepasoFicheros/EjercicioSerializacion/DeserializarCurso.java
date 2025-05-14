package EjercicioSerializacion;

import Serializacion.Coche;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializarCurso {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("EjercicioSerializacion/coche.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Curso curso = (Curso) ois.readObject();
            System.out.println(curso.toString());
            fis.close();
            ois.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
