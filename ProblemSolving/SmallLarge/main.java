 

public class main {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 8, 23, 3993, 1944 };
        int small = arr[0];
        int large = arr[0];
        int s_small=-1, s_large=-1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                s_small = small;
                small = arr[i];
            }
            if (arr[i] > large) {
                s_large = large;
                large = arr[i];
            }

        }
        System.out.println("s_small " +s_small + " " + "s_large " + s_large);
    }
}
