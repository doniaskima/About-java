import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String s = "abccccdd";
        HashMap<Character, Integer> map = new HashMap<>();
        char arr[] = s.toCharArray();
        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        //{a=1, b=1, c=4, d=2}
        int longest = 0;
        for (char key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                longest++;
            }
        }
        return longest > 0 ? s.length() - longest + 1 : s.length();
        //7
    }
}
