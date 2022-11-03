

public class Dog {
    public String name;
    public int age;
    public Dog(String name , int age){
        this.name =name;
        this.age= age;
        add2();

    }
    public void speak(){
        System.out.println("I am " + this.name + " and I am " +  this.age  +"years old");
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    private int add2(){
        return this.age +2;
    }


}
