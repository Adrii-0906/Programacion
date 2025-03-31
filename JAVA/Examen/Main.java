public class Main {
    public static void main(String[] args) {
        // PARTE 1

        // Creacion de ficheros
        Fraccion f1 = new Fraccion(1, 4);
        Fraccion f2 = new Fraccion(1, 2);
        Fraccion f3 = new Fraccion();
        Fraccion f4 = new Fraccion(4);


        // Operacion aritmeticas
        Fraccion suma = f1.sumar(f2);
        Fraccion resta = f1.restar(f3);
        Fraccion prducto = f1.multiplicar(f4);
        Fraccion cociente = f1.dividir(f2);

        // Mostrar resultado
        System.out.println("----------RESULTADO PARTE 1----------\n");
        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + prducto);
        System.out.println(f1 + " / " + f2 + " = " + cociente + "\n");
        System.out.println("---------------------------------------");


        // Parte 2
        FraccionSimplificada fs1 = new FraccionSimplificada(6, 2);

        System.out.println("Muestro una fraccion: " + fs1 + " y ahora la simplifico obteniendo: " + fs1.simplificar(fs1));
    }
}
