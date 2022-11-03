//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []result = new int[nums.length];
        for(int i =0 ;i<nums.length;i++){
          int small=nums[i];
            int t=0;
            for(int j=0;j<nums.length;j++){
                if (nums[j]<nums[i] && i!=j){
                    t++;
                }
            }
       
            result[i]=t;
        }
         return result;
    }
 
}

//autre methode 
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] result = new int[101];
        for (int i = 0; i < nums.length; i++) {
            result[nums[i]]++;
        }
        int sum=0;

        for (int i = 0; i < result.length; i++) {
            int temp = result[i];
            result[i] = sum;
            sum = sum + temp;
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[nums[i]];
        }
        return nums;
    }
}