// index of some sort (such as to an array, to a string, or to a vector) is out of range.

public class Main {
    public static void insertion(int x, int t[], int ind) throws IndexOutOfBoundsException {
        if (ind > t.length) {
            throw new IndexOutOfBoundsException("index out of bounds");
        } else {
            for (int i = t.length - 1; i > ind; i--) {
                t[i] = t[i - 1];
            }
            t[ind] = x;
        }
    }
   	public static void afficher(int t[])
 	{
    	for(int i=0;i<t.length;i++)
        {
            System.out.print(t[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        int t[] = new int[5];
        t[0] = 2;
        t[1] = 3;
        t[2] = 7;
        t[3] = 9;
        
 		System.out.println("tableau initial :\n");
 		afficher(t);
		insertion(99 ,t , 3 );
        System.out.println("\n\ntableau apres insertion :\n");
    	afficher(t);

    }
}
























