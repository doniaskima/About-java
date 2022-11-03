//https://www.interviewbit.com/problems/inversions/
public class Solution {
    public int countInversions(int[] A) {
         int s=0;
        for(int i=0 ;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j] && i<j){
                    s++;
                }
            }
        }
        return s;
    }
}
