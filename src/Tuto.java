package Tuto;
import java.util.*;

public class Tuto {
    public static void main(String[] args) {
      //  System.out.println("Hello world!");
      //  System.out.println("Hello world 2");

        // PRIMITIVE
        // int hello_world=5;
        // double num2 =5.0;
        // boolean b = false;
        //char c = 'o';
        // String str="donia";
        // int tim = hello_world;
       // System.out.println(tim);
        int x ;
        x=6;
        System.out.println(x);

        // Operations
        double w=5;
        double y=2;
        double z=56;
        double sum = w+y*z;
        double d =Math.pow(y,w);
        double u = z/ (double)w;
        System.out.println(sum);
        System.out.println(d);
        System.out.println(u);
        int ab = 56 % 5;
        System.out.println(ab);

        // Input and scanners

         Scanner sc = new Scanner(System.in);
         String scanned = sc.next();
         // int scanned = sc.nextInt();
         // Boolean scanned = sc.Boolean();
         int m = Integer.parseInt(scanned);
          System.out.println(m);

         // Conditions and Booleans

        int o=6;
        int p=7;
        int k =10;
        // > < == >= <= !=
        boolean compare= o < p ;
        //boolean compare= o > p ;
        //boolean compare= o != p ;
        //boolean compare= o >= p ;
        boolean compare0 = o > p && p<k ;
        System.out.println(compare);
        System.out.println(compare0);

        String S="hello";
        String H ="Hi";
        boolean compare1= S !=H ;
        System.out.println(compare1);

        // if / else / else if

        Scanner SS = new Scanner(System.in);
        String C = SS.nextLine();

        if (C.equals("donia")) {
           System.out.println("u typed donia");
        } else if (C.equals("hello")) {
            System.out.println("HI!!");
        } else {
            System.out.println("Print");
        }

        // Netsed Statements

        System.out.print("Input ur age: ");
        Scanner SC = new Scanner(System.in);
        String CO = SC.nextLine();
        int age = Integer.parseInt(CO);
        if( age > 18 ) {
            System.out.println(" Input ur favourite food: ");
            String food = SC.nextLine();
            if(food.equals("pizza")){
                System.out.println("Mine too!");
            }
            else {
                System.out.println(" Not Mine too!");
            }
        }
        else if (age >= 13 ){
            System.out.println("u are a teenager !");
        }
        else {
            System.out.println(" u are not a teenager or an adult !");
        }

        // Arrays

        // int[] newArr = new int[5];
         String[] newArr = new String[5];
       // {"hello", "hi" , "donia" ,"marwa","jihen"}
        newArr[0]="hello";
        newArr[1]="hi";
        newArr[2]="donia";
        newArr[3]="marwa";
        newArr[4]="jihen";
        int[] nums = {12,23,32,99,56};
        double[] nums2 = {123,3673,23,32,99,56};

       String Array =newArr[0];
       int Array1= nums[3];
       System.out.println(Array);
       System.out.println(Array1);

       // For loops

        int[] arr4={1,2,3,4,5,6};
        String[] names = new String[5];
         for ( int i=0; i<arr4.length;i++ ){
             System.out.println(i);
         }
         int count = 0;
         for (int element:arr4){
             System.out.println(element + "" + count);
             count++;
         }
         // While loops

        Scanner input = new Scanner(System.in);
        System.out.println("type a number !");
         int IN = input.nextInt();
         do{
             System.out.println("type 10 ...");
             System.out.println("type a number !");
             IN = input.nextInt();
         } while(IN != 10 );

         //int coun =0;
         //while(IN != 10 ){
         //    System.out.println("type 10 ...");
         //    System.out.println("type a number !");
         //    IN = input.nextInt();
         //   coun++;
         // }
        // System.out.println("u tried" + coun + "times");

        // SETS AND Lists

        Set<Integer> t = new HashSet<Integer>();
        t.add(5);
        t.add(6);
        t.add(7);
        t.add(8);
        t.add(-8);
        t.remove(7);
        t.clear();
        t.isEmpty();
        System.out.println(t);
        boolean bool=t.contains(5);
        int size = t.size();
        System.out.println(bool);
        System.out.println(size);


        // order in tree dataa structure

        Set<Integer> tt = new TreeSet<>();
        tt.add(-5);
        tt.add(62);
        tt.add(73);
        tt.add(85);
        System.out.println(tt);
 //faster
        Set<Integer> ttt = new LinkedHashSet<>();
        ttt.add(-53);
        ttt.add(623);
        ttt.add(73);
        ttt.add(-85);
        System.out.println(ttt);
 //List
        ArrayList<Integer> Y = new ArrayList<Integer>();
        Y.add(1);
        Y.add(2);
        Y.get(0);
        Y.set(1,5);
        Y.size();
        System.out.println(Y);
        System.out.println(Y.subList(1,4));

        // Maps and HashMaps

        Map map = new HashMap<>();
      //  Map map = new TreeMap<>(); the keys have to be the same !
        //map.put("donia",5); // sort
        //Map map = new LinedHashMap<>(); //kepp the order
        map.put("donia",5);
        map.put("marwa",56);
        map.put("jihen",-2);
        map.put("islem",-12);
        map.put("hanin",-232);
        System.out.println(map);
        // {marwa=56,donia=5, islem=-12,jihen=-2,hanin=-232} without order
        System.out.println(map.get("donia"));
        //5
        map.containsValue(5);
        map.containsKey(5);
        map.get(5);//null // the number 5 exists but the key 5 dosen't exist
        System.out.println(map.values());
        // [56,5,-2,-12,232]

        // Maps exemples

        Map MM = new HashMap();
        String STR = "hello my name is Donia and im cool";

        for(char n:STR.toCharArray()){
            if (MM.containsKey(n)){
                int old = (int) MM.get(n);
                MM.put(n, old+1);
            }
            else {
                MM.put(n,1);
            }
        }
        // SORT
        int[] so = {-34, 45,87,9,-1,4352};
        Arrays.sort(so);
        for (int I:so)
        {
            System.out.println(I+ ",");
        }
        // -34, -1 , 9, 45 ,87 ,4352




}
}