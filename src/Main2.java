public class Main2 {
    public static void main(String[] args) {
        tuto3 tim = new tuto3("tim",9);
        tuto3 bill = new tuto3("bill",19);
        tuto3.count=7;
        System.out.println(tuto3.count);
        Student jiji = new Student("jiji");
        Student hanin =new Student("hanin");
        Student marwa = new Student("marwa");
        System.out.println(jiji.compareTo(marwa) >0);// -3 differnce between first letters
        OuterClass out = new OuterClass();
        out.inner();
    }

}
