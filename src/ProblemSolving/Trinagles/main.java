import java.util.*;

public class main {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("$");
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("$");
            }
            System.out.println();
        }

        System.out.println();



        
        System.out.println();
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int k = 6; k >= i; k--) {
                System.out.print(" ");
            }
            for (int k = 6; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }
        for (int k = 7; k >= 0; k--) {
            System.out.print("# ");
        }
        


        System.out.println(); 
        System.out.println();
        System.out.println();
                for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int k = 6; k >= i; k--) {
                System.out.print(" ");
            }
            for (int k = 6; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }
        for (int i = 6; i >= 1; i--) {
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }
 
    }
}
