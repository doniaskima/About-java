import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public boolean isPalindrom(String s, String t) {
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length()-1;i++){
            for(int j=t.length()-1;j>=0;j--){
                if(s.charAt(i)!=t.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}