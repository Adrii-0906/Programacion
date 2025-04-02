package Ejercicio5_POO;

import java.util.ArrayList;
import java.util.Collections;

public class Parking {

    //Atributos
    private ArrayList<String> matriculas;
    private String nombre;

    // Constructor
    public Parking(String nombre, int plazas) {
        this.nombre = nombre;
        this.matriculas = new ArrayList<>(Collections.nCopies(plazas, null));
    }

    // Metodos

    public String getNombre(){
        return nombre;
    }

    public boolean entrada(String matricula, int plaza) throws ParkingException{
        if (matricula.length() < 4) {
            throw new ParkingException("Matrícula incorrecta");
        } else if (matriculas.get(plaza) != null){
            throw new ParkingException("Plaza ocupada");
        } else if (matriculas.contains(matricula)) {
            throw new ParkingException("Matricula repetida");
        } else {
            matriculas.set(plaza, matricula);
            System.out.println("Matricula registrada");
        }
        return true;
    }

    public int salida(String matrcula) throws ParkingException{
        if (matrcula == null) {
            throw new ParkingException("Matricula no existenete");
        } else {
            matriculas.remove(matrcula);
            System.out.println("Matricula quitada con exito");
        }
        return 0;
    }

    public int getPlazasTotales() {
        return matriculas.size();
    }

    public int getPlazasOcupadas() {
        return getPlazasTotales() - getPlazasLibres();
    }

    public int getPlazasLibres() {
       return Collections.frequency(matriculas, null);
    }

    // Metodo toString

    @Override
    public String toString() {
        StringBuilder parking = new StringBuilder("Parking " + nombre + "\n");
        parking.append("--------------------------------------------------\n");
        for (int i = 0; i < matriculas.size(); i++) {
            parking.append("Plaza" + i + ": ");
            if (matriculas.get(i) == null) {
                parking.append("(vacio)");
            } else {
                parking.append(matriculas.get(i));
            }
            parking.append("\n");
        }
        parking.append("--------------------------------------------------\n");
        return parking.toString();
    }
}
