//You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character.
//Return the minimum number of steps to make t an anagram of s.
//An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
class Solution {
    public int minSteps(String s, String t) {
       return isAnagram(s,t);
    
    }
    
    public int isAnagram(String s , String t){
        int counts[] =new int[26];
        for(int i=0;i<s.length();i++){
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
            
        }
        int steps=0;
        for(int i:counts){
            if(i<0){
                steps=steps-(i);
            }
        }
        return steps;
    }
}