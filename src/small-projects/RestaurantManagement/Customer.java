import java.util.Scanner;


public class Customer {
    private int tableNumber;

    public int getNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public static void acceptFood() {
        Scanner scanner = new Scanner(System.in);
        String accept = scanner.nextLine();
        while (!accept.equalsIgnoreCase(a)) {
            System.out.println("Please enter A to accept your food");
            accept = scanner.nextLine();
        }
        if (accept.equalsIgnoreCase("a")) {
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
