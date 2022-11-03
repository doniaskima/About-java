import java.util.*;

public class main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("print a number a= ");
       int a = sc.nextInt();
       int q = a / 10;
       int result = 1;
       while (q != 0) {
           q = a / 10;
           result++;
       }
       System.out.println(result);
    }
}
