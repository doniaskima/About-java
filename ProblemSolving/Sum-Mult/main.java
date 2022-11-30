import java.util.*;

public class main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b=sc.nextInt();
        int sum = 0, mult = 1;
        if (a<b){
            for (int i = a; i < b; i++) {
                sum = sum + i;
                mult = mult * i;
            }
            System.out.println("Sum:" + sum + " Mult:" + mult);
        }
    }
}
