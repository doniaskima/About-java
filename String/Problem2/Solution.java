// @author Farheen Bano
//Constraints:

// 1 <= num1.length, num2.length <= 104
// num1 and num2 consist of only digits.
// num1 and num2 don't have any leading zeros except for the zero itself.
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str=new StringBuilder(); //it constructs a Blank String builder with a capacity of 16 caracters.
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0 || j>=0){
            int add=carry;
            if(i>=0){
                add+=(num1.charAt(i)-'0');
                i--;
            }
            if(j>=0){
                add+=(num2.charAt(j)-'0');
                j--;
            }
            str.append(add%10);            
            carry=add/10;
        }
        if(carry!=0)
            str.append(carry);            
    
        return str.reverse().toString();
    }
}


// Notes 
//public StringBuilder (int capacity): creates a string builder with no characters and with specified capacity.
//Note: capacity should not be less than zero , otherwise it will throw NegativeArraySizeException.


//3. public StringBuilder (String str):creates a string builder with specified string as initial content.