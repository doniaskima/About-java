import java.util.List;
import java.util.List;
import java.util.Scanner;


public class Waiter {
    private static int number;

    public static void getOrder() {
        Scanner scanner = new Scanner(System.in);
        try {
            number = Integer.valueOf(scanner.nextInt());
        } catch (InterruptedException e) {
            System.out.println("Please enter numbers only .");
            number = Integer.valueOf(scanner.nextInt());
        }

        while (number > 3) {
            System.out.println("We only have 3 items Today . Please try again");
            number = scanner.nextInt();
        }

        if (number == 1) {
            Cook.setOption(number);
        } else if (number == 2) {
            Cook.setOption(number);
        } else {
            Cook.setOption(number);
        }

        while (number != 1 && number != 2 && number != 3) {
            System.out.println("Please enter numbers only");
            try {
                number = Integer.valueOf(scanner.nextLine());
                if (number > 3) {
                    int x = 1 / 0;
                }
            } catch (ArithmeticException e) {
                System.out.println("We only have 3 items today. Please enter again.");
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter numbers only.");
                number = Integer.valueOf(scanner.nextLine());
            }
        }
    }
    
    public static void serverFood() {
        if (number == 1) {
            System.out.println("Enjy your pizza");
        } else if (number == 2) {
            System.out.println("Enjoy your Sandwich");
        } else {
            System.out.println("Enjoy your Burger");
        }
    }
    

    static double itemsOrdered(){
        return number;
    }
}
