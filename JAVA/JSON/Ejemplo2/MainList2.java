package Ejemplo2;

import Ejemplo1.Usuario;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainList2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();
        List<Usuario> usuarios = new ArrayList<>();

        System.out.println("Cuantos usuarios quieres crear?");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce los datos de los usuarios");
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Edad: ");
            int edad = sc.nextInt();

            usuarios.add(new Usuario(nombre, email, edad));
        }


    }
}
