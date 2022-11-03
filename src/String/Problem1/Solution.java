import java.util.Scanner;

class Solution {
    public static String addStrings(String num1, String num2) {
        int unmber1 = Integer.parseInt(num1);
        int unmber2 = Integer.parseInt(num2);
        int result = unmber1 + unmber2;
        String Output = Integer.toString(result);
        return Output;

    }

    public static void main(String[] args) {
        System.out.println(addStrings("34", "6473"));
    }
    
}