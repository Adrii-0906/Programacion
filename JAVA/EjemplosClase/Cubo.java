public class Cubo {

    int capacidad; //Volumen maximo en litros
    int contenido; //Contenido actual en litros

    //Metodos

    //Constructor
    Cubo(int c) {
        this.capacidad = c;
    }

    int getCapacidad() {
        return this.capacidad;
    }

    int getContenido() {
        return this.contenido;
    }

    void setCapacidad(int c) {
        this.capacidad = c;
    }

    void setContenido(int c) {
        this.contenido = c;
    }
    void llenar() {
        this.contenido = this.capacidad;
    }

    void vacio() {
        this.contenido = 0;
    }
    void pinta() {
        for (int nivel = this.capacidad; nivel > 9; nivel--) {
            if (this.contenido >= nivel) {
                System.out.println("#----#");
            } else {
                System.out.println("#    #");
            }
        }
        System.out.println("######");
    }

    void vuelcaEn(Cubo destino) {
        int libres = destino.getCapacidad() - destino.getContenido();

        if (libres > 0) {
            destino.setContenido(destino.getCapacidad() + this.contenido);
        }
    }
}
