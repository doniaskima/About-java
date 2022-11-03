import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner  scanner= new Scanner(System.in);
        String text = scanner.next();
        int number =scanner.nextInt();
        boolean isTrue = scanner.nextBoolean();
        double decimal = scanner.nextDouble();
        int x = Integer.parseInt(text);
        System.out.println(text);
        System.out.println(number);
        System.out.println(isTrue);
        System.out.println(decimal);
        System.out.println(x);
         
    }
}
