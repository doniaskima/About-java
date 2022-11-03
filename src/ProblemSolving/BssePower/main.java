import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        int Base = sc.nextInt();
        System.out.println("Power :");
        int Power = sc.nextInt();
        int i = 1, result = 1;
        do{
            result =result*Base;
            i++;
        }while(i<=Power);
        System.out.println("result="+result);
    }
}
