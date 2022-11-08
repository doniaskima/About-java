import java.util.Scanner;

public class X {
    static double method(double i, double d) {
        System.out.println("methode static 2");
        return i + d;
    }

    
    public  static void main(String[] args) {
    
    Scanner input= new Scanner(System.in);
    double i=input.nextDouble();
    double d =input.nextDouble();

   double k= X.method(i,d);
}


}

 