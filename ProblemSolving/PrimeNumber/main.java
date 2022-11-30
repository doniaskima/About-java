import java.util.*;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print a number a=");
        int a = sc.nextInt();
        Boolean     isPrime = true;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
            if (isPrime) {
                System.out.println("Yes");
            }else {
                 System.out.println("NOO");
            }
        }
    }
}
