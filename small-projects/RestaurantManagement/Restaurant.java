import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
public class Restaurant {

    static List<Food> items = new ArrayList<Food>();

    public static void displayWelcomeMessage() {
        System.out.println("---Welcome to our  restaurant :)");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
             e.printStackTrace(); //gerer les exeptions et les erreurs .
        }

        System.out.println("Please choose your table and enter table number");
    }


    static {
        setMenu();
    }

    static void setMenu() {
        Food pizza = new Food();
        pizza.setFoodDetail("Pizza", 30);
        items.add(pizza);
        Food sandwich = new Food();
        sandwich.setFoodDetail("Sandwich", 20);
        items.add(sandwich);
        Food Burger = new Food();
        Burger.setFoodDetail("Burger", 50);
        items.add(Burger);
    }

    public static void customerGuide() {
        Scanner scanner = new Scanner(System.in);
        Customer customer1 = new Customer();
        int tableNumber = scanner.nextInt();
        while (tableNumber > 20) {
            System.out.println("We only have 20 tables please enter table number again.");
            tableNumber = scanner.nextInt();
        }

        customer1.setTableNumber(tableNumber);
        System.out.println("Please be sitted in table number" + customer1.getTableNumber());
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("Here is our menu :");
        Iterator<Food> itr = items.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    static void displayOptions() {
        System.out.println("*******************");
        System.out.println("Press 1 fror Pizza");
        System.out.println("Press 2 for Sandwich");
        System.out.println("Press 3 for Burger");
    }
    
    static void displayBye() {
        System.out.println("Thank you for visiting");
    }



}
