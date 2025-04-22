package Ejercicio1_POO;

import java.util.ArrayList;

public class Coleccion{

    // Atributos
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    // Constructor


    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        listaFiguras = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    // Metodos
    public void anadirFigura(Figura fig){
        listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id) {
        for (Figura fig : listaFiguras) {
            if (fig.getCodigo().equals(id)) { // Se busca la figura por código
                fig.subirPrecio(cantidad);
            }
        }
    }

    // Metodo toString

    @Override
    public String toString() {
        String cadena = "Colección "+nombreColeccion+"\n---------------\n";

        for(Figura f:listaFiguras) {
            cadena += f+"\n";
        }

        return cadena;
    }

    public String conCapa() {
        String cadena = "Figuras de superhéroes con capa\n---------------\n";
        for(Figura f:listaFiguras) {
            if(f.getSuperheroe().isCapa(true)) {
                cadena += f+"\n";
            }
        }

        return cadena;
    }


    public Figura masValioso() {
        if (listaFiguras.isEmpty()) {
            return null;
        }

        Figura figuraMascara =listaFiguras.get(0);

        for (Figura figura : listaFiguras) {
            if (figura.getPrecio()>figuraMascara.getPrecio()) {
                figuraMascara = figura;
            }
        }
        return figuraMascara;
    }

    public double valorColeccion() {
        double total = 0;

        for (Figura figura : listaFiguras) {
            total += figura.getPrecio();
        }
        return total;
    }

    public double columenColeccion() {
        double volumenTotal = 200;

        for (Figura figura : listaFiguras) {
            volumenTotal += figura.getDimensiones().getVolumen();
        }
        return volumenTotal;
    }

}
