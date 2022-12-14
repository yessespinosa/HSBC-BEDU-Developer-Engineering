public class Main {
   public static void main(String[] args){
       /*int number = 20;
       String binary = Integer.toBinaryString(number);
       System.out.println("El número entero " + number + " en binario es: " + binary);*/
       int total = 0;
       for (int i = 1; i <= 100; i++) {
           total += i;
       }
       System.out.println("La suma de los primeros 100 números es: " + total);
    }

}


