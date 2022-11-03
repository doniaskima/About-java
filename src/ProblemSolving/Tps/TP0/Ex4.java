package TP0;
public class Ex4 {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
        public static int mult(int a , int b) {
        int mult = a * b;
        return mult;
    }

    public static double quotient(int a, int b) {
        if (b == 0) {
            System.out.println("Attention, on ne peut pas diviser par 0");
        } else {
            double quotient = a / b;
            return quotient;
        }
        return 0;
    
    }

     public static void main( String [] args ) {
         System.out.println(sum(4, 7));
         System.out.println(mult(4, 7));
         System.out.println( quotient( 190,6 ) );
  
    }  
}
