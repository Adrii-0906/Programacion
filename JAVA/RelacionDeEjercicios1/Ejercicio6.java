//Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA). La base imponible estará almacenada en una variable.
public class Ejercicio6 {
    public static void main(String[] args) {
        float precioBase = 564.56f;
        double factura;
        factura = precioBase * 1.21;
        System.out.println(factura);
    }
}
