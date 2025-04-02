package Ejercicio4_POO;

import java.time.LocalDate;

public class Main04 {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(1995, 5, 20);
        TrabajoPintura pintura1 = new TrabajoPintura("Alex", fecha,"Adrii", 49,45);

        pintura1.detalleServicio();

        RevisionAlarma alarma1 = new RevisionAlarma("Alex",fecha,"Oscar",10);

        alarma1.detalleServicio();
    }
}
