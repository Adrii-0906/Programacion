import java.awt.desktop.OpenURIEvent;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int edad;
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    String getNombre() {
        return nombre;
    }
    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    int getEdad() {
        return edad;
    }
    void setEdad(int edad) {
        this.edad = edad;
    }
    String getMatricula() {
        return matricula;
    }
    void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    void mostrarInformacion() {
        String n, m;
        int e;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre: ");
        n = entrada.nextLine();
        System.out.println("Edad: ");
        e = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Matricula: ");
        m = entrada.nextLine();

        System.out.println("-----------------");
        System.out.println("Nombre: "+ n);
        System.out.println("Edad: "+ e);
        System.out.println("Matricula: "+ m);
        System.out.println("-----------------");


    }
    public static void registrarEstudiante(ArrayList<Estudiante> estudiantes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el edad del estudiante: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el matricula del estudiante: ");
        String matricula = sc.nextLine();

        Estudiante nuevoEstuddiante = new Estudiante(nombre, edad, matricula);
        estudiantes.add(nuevoEstuddiante);
        System.out.println("Estudiante registrado exitosamente");
    }

    public static void main(String[] args) {
        Estudiante Pepe = new Estudiante("Pepe", 18, "Numero1");
        Pepe.mostrarInformacion();

        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        registrarEstudiante(estudiantes);

    }

}
