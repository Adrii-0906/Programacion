public class Fraccion {
    // Atributos
    private int num; // numero
    private int den; // denominador

    // Constructor
    Fraccion() {
        this.num = 0;
        this.den = 1;
    }

   Fraccion(int num, int den) {
       this.num = num;
       this.den = den;
   }
   Fraccion(int num) {
        this.num = num;
        this.den = 1;
   }

    // Setters y Getters
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getDen() {
        return den;
    }
    public void setDen(int den) {
        this.den = den;
    }

    // Metodo suma
    public Fraccion sumar(Fraccion f) {
         int op1 = this.num * f.getDen();
         int op2 = this.den * f.getNum();
         int num_result = op1 + op2;
         int den_result = this.den * f.getDen();
         return new Fraccion(num_result, den_result);
    }

    // Metodo restar
    public Fraccion restar(Fraccion f) {
       int op1 = this.num * f.getDen();
       int op2 = this.den * f.getNum();
       int num_result = op1 - op2;
       int den_result = this.den * f.getDen();
       return new Fraccion(num_result, den_result);
    }

     // Metodo multiplicar
     public Fraccion multiplicar(Fraccion f) {
       int op1 = this.num * f.getNum();
       int op2 = this.den * f.getDen();
       return new Fraccion(op1, op2);
    }

    // Metodo dividir
    Fraccion dividir(Fraccion f) {
       int op1 = this.num * f.getDen();
       int op2 = this.den * f.getNum();
       return new Fraccion(op1, op2);
    }

    // Metodo toString


    @Override
    public String toString() {
        return num + "/" + den;
    }
}
