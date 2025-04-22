package Ejercicio2_POO;

public class Main02 {

    public static void main(String[] args) {
        Electrodomestico electrodomestico1 = new Electrodomestico("Frigorifico",25);

        System.out.println(electrodomestico1);

        System.out.println(electrodomestico1.getConsumo(7));
        System.out.println(electrodomestico1.getCosteConsumo(2,8.89));

        Lavadora lavadora1 = new Lavadora("samsung", 23,554,true);

        System.out.println(lavadora1);

        System.out.println(lavadora1.getCosteConsumo(3, 14.87));
        System.out.println(lavadora1.getconsumo(48));

    }
}
