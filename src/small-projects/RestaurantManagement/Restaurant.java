import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {

    public static void displayWelcomeMessage() {
        System.out.println("---Welcome to our  restaurant :)");
        try {
            Thread.sleep(1000)
        } catch (InterruptedException e) {
             e.printStackTrace(); //gerer les exeptions et les erreurs .
        }

        System.out.println("Please choose your table and enter table number")
    }
    
}
