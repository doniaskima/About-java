import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0, large = 0;
        boolean isPrime = true;

        for (int i = 1; i < a; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i != 2) {
                count++;
                large = i;
                System.out.println(i);
                isPrime = false;
            }
        }
        System.out.println(count +"largest "+ large);
    }
}
