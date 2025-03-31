import java.util.Scanner;

public class ExpoCoches {
    private int entradasPrincipal;
    private int entradasCompraVenta;
    private int entradasVip;

    public ExpoCoches(int entradasPrincipal, int entradasCompraVenta, int entradasVip) {
        this.entradasPrincipal = entradasPrincipal;
        this.entradasCompraVenta = entradasCompraVenta;
        this.entradasVip = entradasVip;
    }
    public int getEntradasPrincipal() {
        return entradasPrincipal;
    }
    public void setEntradasPrincipal(int entradasPrincipal) {
        this.entradasPrincipal = entradasPrincipal;
    }
    public int getEntradasCompraVenta() {
        return entradasCompraVenta;
    }
    public void setEntradasCompraVenta(int entradasCompraVenta) {
        this.entradasCompraVenta = entradasCompraVenta;
    }
    public int getEntradasVip() {
        return entradasVip;
    }
    public void setEntradasVip(int entradasVip) {
        this.entradasVip = entradasVip;
    }

    public void mostrar() {
        System.out.println("Sala Principal: "+entradasPrincipal+" entradas");
        System.out.println("Sala Compra: "+entradasCompraVenta+" entradas");
        System.out.println("Sala Vip: "+entradasVip+" entradas");
    }

    public void venta() {
        Scanner entrada = new Scanner(System.in);

        int zona;
        int venta;

        System.out.println("En que zona quieres comprar las entradas? ");
        zona = entrada.nextInt();

        if (zona == 1) {
            if (entradasPrincipal <= 1000) {
                System.out.println("En la Sala Principal hay vendidas "+entradasPrincipal+" entradas");
                int entradasDisponibles = 1000 - entradasPrincipal;
                System.out.println("Pudes comprar "+ entradasDisponibles +" entradas");
            } else {
                System.out.println("En la Sala Principal estamos sold out");
            }
        } else if (zona == 2) {
            if (entradasCompraVenta <= 200) {
                System.out.println("En la zona compra/venta hay vendidas "+entradasCompraVenta+" entradas");
                int entradasDisponibles1 = 200 - entradasCompraVenta;
                System.out.println("Puedes comprar "+ entradasDisponibles1 +" entradas");
            } else {
                System.out.println("En la zona compra estamos sold out");
            }
        } else if (zona == 3) {
            if (entradasVip <= 25) {
                System.out.println("En la zona compra/venta hay vendidas " + entradasVip + " entradas");
                int entradasDisponibles2 = 25 - entradasVip;
                System.out.println("Puedes comprar " + entradasDisponibles2 + " entradas");
            } else {
                System.out.println("En la zona compra estamos sold out");
            }
        }

        System.out.println("Dime la zona donde quieres comprar tus entradas: ");
        zona = entrada.nextInt();

        if (zona == 1) {
            if (entradasPrincipal <= 1000) {
                System.out.println("Cuantas entradas quieres? ");
                venta = entrada.nextInt();
                int PrincipalDisponible = 1000 - entradasPrincipal;
                if (venta <= PrincipalDisponible) {
                    entradasPrincipal = venta + entradasPrincipal;
                } else {
                    System.out.println("Sold Out");
                }
            }
        } else if (zona == 2) {
            if (entradasCompraVenta <= 200) {
                System.out.println("Cuantas entradas quieres? ");
                venta = entrada.nextInt();
                int ventaCompraDisponible = 200 - entradasCompraVenta;
                if (venta <= ventaCompraDisponible) {
                    entradasCompraVenta = venta + entradasCompraVenta;
                } else {
                    System.out.println("Sold Out");
                }
            }
        } else if (zona == 3) {
            if (entradasVip <= 25) {
                System.out.println("Cuantas entradas quieres? ");
                venta = entrada.nextInt();
                int ventaVipDisponible = 25 - entradasVip;
                if (venta <= ventaVipDisponible) {
                    entradasVip = venta + entradasVip;
                } else {
                    System.out.println("Sold Out");
                }
            }
        }
    }

    public static void main(String[] args) {
        ExpoCoches coches = new ExpoCoches(100, 50, 5);

        Scanner entrada = new Scanner(System.in);

        int opcion;
        do {
            System.out.println();
            System.out.println("Bienvenido el menu!. Que deseas hacer");
            System.out.println("1. Mostrar entradas disponibles");
            System.out.println("2. Comprar entradas");
            System.out.println("3. salir");

            System.out.println("Ingrese opcion: ");
            opcion = entrada.nextInt();

            if (opcion == 1){
                coches.mostrar();
            } else if (opcion == 2){
                coches.venta();
            } else if (opcion == 3){
                System.out.println("Salir");
            }
        } while (opcion != 3);

    }
}