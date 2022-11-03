//Enoncee 
//A phrase is a palindrome if, after converting all uppercase letters into 
//lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
import java.util.*;
import java.lang.*;
public class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int right = len - 1;
        int left = 0;
        s = s.toLowerCase();
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            else if (s.charAt(right) != s.charAt(left)) {
                return false
            }
        }
        return true;
    }
}
