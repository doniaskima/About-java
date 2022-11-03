public class main {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 6; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("&");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println('@');
        for (int i = 5; i >= 1; i--) {
            System.out.print('@');
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println('@');

        }
        for (int j = 5; j > 0; j--) {
            System.out.print('@');
        }

        System.out.println();
         System.out.println();
         System.out.println();
        //EX2
        for (int a = 1, b = 10, c = 11, d = 20, e = 21, f = 30; a <= 10; a++, b--, c++, d--, e++, f--) {
            System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
        }
     
    

    }

    }
 