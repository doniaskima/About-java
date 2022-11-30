 
import java.util.*;

public class main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int i = 2, small = 0, large = 0;
        System.out.println("Num 1: ");
        int a = sc.nextInt();
        small = a;
        large = a;
        while (i <= 10) {
            System.out.print("Num" + i + ":");
            int b = sc.nextInt();
            if (b < small) {
                small = b;
            }
            if (b > large) {
                large = b;
            }
            i++;
        }
        System.out.println("Larger : " + large + " smaller : " + small);
    }
}
