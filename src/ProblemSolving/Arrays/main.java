import java.util.*;

public class main {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,6,7,8,9,10};

        int []arr2={11,12,13,14,15,16,17,18,19,20};

        int []arr3 = new int[20];
        int index=0;
        for(int i=0;i<arr1.length;i++){
            arr3[index++]=arr1[i];
            arr3[index++]=arr2[i];
        }
          for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
          }
    }
}
