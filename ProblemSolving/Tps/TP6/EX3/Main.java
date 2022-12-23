public class Main 
{
    public static void insertion (int x , int t[] , int index) throws IndexOutOfBoundsException
    {
        if (index > t.length)
            throw new IndexOutOfBoundsException("index out of bounds");
        else {
            for (int i = t.length - 1; i >= 0; i--) {
                t[i] = t[i - 1];
            }
            t[index] = x;
        }
    }

    public static void afficher(int t[]) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i] + " ");
        }
    }


    public static void main(String[] args) {
        int t[] = new int[5];
        t[0] = 1;
        t[1] = 2;
        t[2] = 5;
        t[3] = 29;
        System.out.println("lerableau initial :\n");
        afficher(t);

        insertion(3, t, 2);
        afficher(t);

    }
}