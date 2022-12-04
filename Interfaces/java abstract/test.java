public abstract class A { // déclarée dans le fichier A.java  
    public abstract void ouSuisJe();// pas de corps de méthode  
}


// Extension d'une classe abstraite .

public class B extends A {// déclarée dans le fichier B.java  
    public void ouSuisJe() {
        System.out.println("J'y suis j'y reste !") ;  
    }
}


//Extension d'une classe abstraite

public abstract class A {
    public abstract void ouSuisJe();
}


public abstract class B extends A {
    public void ouSuisJe() {
        System.out.println("Il est passé par ici") ;  
    }
}

public abstract class C extends B {
    public  abstract  void ouVasTu() ;  
}

public class D extends C {
    public void ouVasTu() {
        System.out.println("J'y retourne") ;  
    }
}

// ********************************************

//The abstract class in java cannot be instantiated( we cannot create objects of abstract classes) .
//We use the abstract Keyword to declare an abstract class . For exemple

//create an abstract class 
abstract class Language {
    //fields and methods 
}

//try to create an object Language
//throws an error

Language obj= new Language();

//An abstract class can have both the regular methods and abstract methods .
//For exemple :

abstract class Language{
    //abstract method 
    abstract void method1();

    //regular method
    void method2(){
        System.out.println("This is regular method");
    }
}

//Java Abstract Method 
//A method that dosen't have its body is known as an abstract method . We use the same abstract keyword to create abstract methods .For exemple,
abstract void display();

//Here , display() is an abstract method .The body of display() is replaced by ;

//if a class contains an abstract method , then the class shoul be decalred abstract , Otherwise , it will generate an error, For exemple : " + myObj."

//Error
//class should be abstract 
class Language{
    //abstract method 
    abstract void method1();
}



//Example: Java Abstract Class and Method


//Though abstract classes cannot be instantiated , we can create subclass from it,
//We can then access members of the class using the object of the subclass . For exemple ,

abstract class Language{
    //method of abstract class 
    public void display(){
        System.out.println("This is java Programming");
    }
}

class Main extends Language{
    public static void main(String[] args){
        //create an object of Main 
        Main obj=new Main();
        //access method of Main 
        //using object of Main class 
        obj.display();
    }
}
//In the above exemple , we have created an abstract class named Language
//The class contains a regular method display()

//we have created the Main class that inherits the abstract class .Notice the statement .

obj.display();
//here the object of the child class Main .We are calling the method o the abstract class using the object obj .

/*IMPLEMENTING ABSTRACT METHODS */

//if the abstract class includes any abstract method , then all the child classes the implementation of the abstract method .
//For example


abstract class Animal{
    abstract void makeSound();//abstract meyhod
    public void eat(){ // non abstract method
        System.out.println("I can eat ..");
    }
}


class Dog extends Animal{
    //provide implementation of abstract method 
    public void makeSound(){
        System.out.println("Bark bark");
    }
}

class Main{
    public static void main(String[] args){
        //create an object of Dog class
        Dog d1= new Dog();
        d1.makeSound();
        d1.eat();
    }
}

//output 
// Bark bark
// I can eat.

//In the above exemple , we have created an abstract class Animal,
//The class contains an abstract method makesound() and non-abstract method eat() .

//We have inherited a subclass Dog from superclass Animal .
//Here the subclass Dog provides the implementation for the abstract method makeSound();