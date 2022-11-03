import java.util.*;
import java.io.*;
import java.lang.*;
class isAnagram {
  public static void main(String[] args) {
    String s="anagram", t="nagaram" ;

        if(s.length()!=t.length())
            System.out.println("false");
        
        int counts[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            // System.out.println(s.charAt(i) - 'a');
            counts[t.charAt(i) - 'a']--;
            // System.out.println(t.charAt(i) - 'a');
        }
        System.out.println(counts);
        for (int i:counts){
            if(i!=0)
                System.out.println("false");
                 break;
        }
        System.out.println("true");
    }
}