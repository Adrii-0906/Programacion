import java.util.Scanner;


public class Boletin1_Ejercicio1 {
    public static void main(String[] args) {
        //Pedir los coeficientes de una ecuación se 2o grado, y muestre sus soluciones reales. Si no existen,debe indicarlo.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los numeros de la ecuacion: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese los numeros de la ecuacion: ");
        double b = sc.nextDouble();
        System.out.println("Ingrese los numeros de la ecuacion: ");
        double c = sc.nextDouble();
        double d = Math.pow(b,2)-4*a*c;
        if (d < 0){
            System.out.println("No hay solucion posible");
        } else {
            double raiz = Math.sqrt(d);
            double x1 = (-b + raiz) / 2*a;
            double x2 = (-b - raiz) / 2*a;
            System.out.println("La primera solucion es:" + x1);
            System.out.println("La segunda solucion es:" + x2);
        }
    }

}
