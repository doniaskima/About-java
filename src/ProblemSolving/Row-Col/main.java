
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Rows :");
       int Rows = sc.nextInt();
        System.out.println("Cols :");
        int Cols = sc.nextInt();
        if(Rows<=0 || Cols <=0){
            System.out.println("error");
        }else{
            for(int i=1;i<Rows;i++){
                for(int j=0;j<Cols;j++){
                    System.out.print("B");
                }
                System.out.println();
            }
        }

    }
}

