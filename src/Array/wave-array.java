import java.util.Arrays;
//https://www.interviewbit.com/problems/wave-array/
public class wave-array {
    public int[] wave(int[] A) {
        Arrays.sort(A);
        for(int i=0;i<A.length-1;i=i+2){
            swap(A,i,i+1);
        }
        return A;
    }
    
    public int[] swap(int[] A, int i, int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
        return A;
    }
}

