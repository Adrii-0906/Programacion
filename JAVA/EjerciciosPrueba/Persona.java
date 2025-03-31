package EjerciciosPrueba;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;


    public Persona() {
        this.nombre = "Desconocido";
        this.apellido = "Desconocido";
        this.edad = 0;
        this.altura = 0.0;
    }
    public Persona(String nombre, String apellido, int edad, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa");
        }
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("La altura no puede ser negativa");
        }
    }
    public void saludar() {
        System.out.println("¡Hola! Me llamo " + nombre + ".");
    }
    public boolean esMayorEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        System.out.println("Persona 1(constructor por defecto):");
        persona1.saludar();
        System.out.println("Nombre:" + persona1.getNombre());
        System.out.println("Apellido:" + persona1.getApellido());
        System.out.println("Es mayor de edad:" + persona1.esMayorEdad());
        System.out.println();

        persona1.setNombre("Adrian");
        persona1.setApellido("Raña");
        persona1.setEdad(18);
        persona1.setAltura(1.83);
        System.out.println("Persona 1 despues de cambiar sus atributos");
        persona1.saludar();
        System.out.println("Nombre:" + persona1.getNombre());
        System.out.println("Apellido:" + persona1.getApellido());
        System.out.println("Es mayor de edad:" + persona1.esMayorEdad());
        System.out.println();

    }
}
