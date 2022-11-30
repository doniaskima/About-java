interface FisrtInterface {
    public void myMethod(); //Interface method 
}

interface SecondInterface {
    public void myOtherMethod(); //interface method 
}


//DemoClass "implements" FirstInterface and SecondInterface 
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some Text..");
    }

    public void myOtherMethod() {
        System.out.print("Some Other Text");
    }
}


class MyMainClass {
    public static void main(String[] args) {
        DemoClass myClass = new DemoClass();
        myClass.myMethod();
        myClass.myOtherMethod();
    }
}