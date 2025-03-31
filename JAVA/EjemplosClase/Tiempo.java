public class Tiempo {
     private int horas;
     private int minutos;
     private int segundos;

     public Tiempo(int horas, int minutos, int segundos) {
     this.horas = horas;
     this.minutos = minutos;
     this.segundos = segundos;
     formatHoras();
     }

        private void formatHoras() {
         if (segundos >= 60) {
             minutos += segundos / 60;
             segundos = segundos % 60;
         } else if (segundos < 0) {
             minutos -= (Math.abs(segundos) / 60) + 1;
             segundos = 60 - (Math.abs(segundos) % 60);
         }

         if (minutos >= 60) {
             horas += minutos / 60;
             minutos = minutos % 60;
         } else if (minutos < 0) {
             horas -= (Math.abs(minutos) / 60) + 1;
             minutos = 60 - (Math.abs(minutos) % 60);
         }
         if (horas >= 24) {
             horas = horas % 24;
         } else if (horas < 0) {
             horas -= 24 - (Math.abs(horas) / 24) + 1;
         }
     }

     public void sumar(Tiempo otro) {
         this.horas += otro.horas;
         this.minutos += otro.minutos;
         this.segundos += otro.segundos;
         formatHoras();
     }
     public void restar(Tiempo otro) {
         this.horas -= otro.horas;
         this.minutos -= otro.minutos;
         this.segundos -= otro.segundos;
         formatHoras();
     }

     public int getHoras() {
         return horas;
     }
     public int getMinutos() {
         return minutos;
     }
     public int getSegundos() {
         return segundos;
     }

     @Override
     public String toString() {
         return String.format("%02d:%02d:%02d", horas, minutos, segundos);
     }

    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 23,00 );
        Tiempo t2 = new Tiempo(4, 23, 00);

        System.out.println("Tiempo: " + t1);
        System.out.println("Tiempo: " + t2);
        t1.sumar(t2);
        System.out.println("Despues de sumar: " + t1);

        t1.restar(new Tiempo(1, 23, 00));
        System.out.println("Despues de restar: " + t1);

    }
}
