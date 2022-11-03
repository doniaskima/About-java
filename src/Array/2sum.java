//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

class 2sum {
    public int[] twoSum(int[] numbers, int target) {
        for(int index1=0; index1<=numbers.length-1;index1++){
           int number1=numbers[index1];
            for(int index2=index1+1;index2<=numbers.length;index2++){
                int number2=numbers[index2];
                if(number1+number2==target && index1<index2){
                   int result[]={index1+1, index2+1};
                    return result;
                }
            }
        }
        return new int[2];
    }
}