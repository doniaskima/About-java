import java.util.*;
public class lesson2 {
    public static void main(String[] args) {
        // intro to Objects
        Scanner sc = new Scanner(System.in);
        //sc.next();
        int x= 5;
        String str = "hello";
        str.length();
        donia("donia !",4);
        System.out.println(add(6));
        System.out.println(str("hii!!"));
        Dog tim = new Dog("tim",4);
        tim.speak();
        Dog bill = new Dog("bill",7);
        bill.speak();
        Dog bob = new Dog("bob",11);
        bob.speak();
        int XX = tim.getAge();
        System.out.println(XX);
        int YY = tim.getAge();
        System.out.println(YY);
        tim.setAge(11);
        tim.speak();
       // tim.add2(); //this is not visible cuz it's private
        Cat boby = new Cat("bob",18,20);
        boby.speak();
        Cat leya = new Cat("leya",7);
        leya.speak();


    }

    public static void donia(String str, int x){
        for(int i=0 ; i<x ; i++) {
            System.out.println(str);
        }
    }
    public static int add(int x){
        return x +2 ;
    }
    public static String str(String x){
        return x + "!!";
    }





}
