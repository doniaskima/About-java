import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {

    static List<Food> items = new ArrayList<Food>();

    public static void displayWelcomeMessage() {
        System.out.println("---Welcome to our  restaurant :)");
        try {
            Thread.sleep(1000)
        } catch (InterruptedException e) {
             e.printStackTrace(); //gerer les exeptions et les erreurs .
        }

        System.out.println("Please choose your table and enter table number")
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
        items.add(sandwich)
        Food Burger = new Food();
        Burger.setFoodDetail("Burger", 50);
        items.add(Burger);
    }

    public static void customerGuide() {
        Scanner scanner = new Scanner(System.in);
        Customer customer1= new Customer();
    }



}
