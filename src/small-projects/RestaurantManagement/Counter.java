import java.util.Scanner;

public class Counter {
    public static void payMessage() {
        System.out.println("please enter p to pay your Bill");
    }

    public static calculateTotalAmount(){
        Scanner scanner = new Scanner(System.in);
        String pay=scanner.nextLine();
        while(!pay.equalsIgnoreCase("p")){
            System.out.println("Please enter P to you billing address");
            pay=scanner.nextLine();
        }
        if(pay.equalsIgnoreCase("p")){
            double amount=Waiter.itemsOrdered();
            if(amount==1){
                System.out.println("Your total amount is "+30);
            }else if(amount==2){
                System.out.println("Your total amount is"+20);
            }else {
                 System.out.println("Your total amount is"+50);
            }
        }
    }
}
