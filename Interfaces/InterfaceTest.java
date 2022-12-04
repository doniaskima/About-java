// we use interface Keyword to create an interface in java 

interface Language {
    public void getType();

    public void getVersion();
}
// Here language is an interface 
//it includes abstract methods : getType() and getVersion()

//Implementing an Interface 

//Like abstract classes , we cannot create objects of interfaces .
//To use an interface , other classes must implement it . We use the implements keyword to implement an interface .


//Exemple1
//JAVA INTERFACE 

interface Polygon {
void getArea(int length, int breadth);
}

//implement the polygon interface 
class Rectangle implements Polygon {
     // implementation of abstract method
  public void getArea(int length, int breadth) {
    System.out.println("The area of the rectangle is " + (length * breadth));
  }
}

class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
    }
}

//output 
//The area of the rectangle is 30

//In the above example , we have created an interface named Polygon . The interface contains an abstract method getArea() .

//Here , The Rectangle class implements Polygon . And provides the implementation of the getArea() method ;


//Example 2: Java Interface

//CREATE INTERFACE 

interface Language {
    void getName(String name);
}

//class implements Interface

class ProcessingLanguage implements Language {
    //implementation of abstract method 
    public void getName(String name) {
        System.out.println("Programming Language: " + name);
    }
}

class Main {
    public void main(String[] args) {
    ProgrammingLanguage language = new ProgrammingLanguage();
    language.getName("Java");
    }
}
//output
//Programming Language: Java


//IMPLEMENTING MULTIPLE INTERFACES 
//in java a class can also implement multiple interfaces .For exemple

interface A {
    //members of A
}

interface B {
    //memebers of B
}

class C implements A, B {
    //abstract members of A
    //abstract members of B
}


//EXTENDING AN INTERFACE 

//similar to classes , interface can extend other interfaces .
//The extends keyword is used for extending interfaces . For exemple

interface Line {
    //memebers of Line interface 
}

//extending interface interface
interface Polygon extends Line {
    //members of polygon interface 
    //memebers of Line interface
}

//Here, the Polygon interface extends the Line interface. Now, if any class implements Polygon, it should provide implementations for all the abstract methods of both Line and Polygon.


//Now what we interfaces are, let's learn about why interfaces are used in Java .

//Similar to abstract classes , interfaces help usto acheive abstraction in java .
//Here, we know getArea() calculates the area of polygons but the way area is calculated is different for different polygons. Hence, the implementation of getArea() is independent of one another.

//interfaces provide specifications that a class (which implements it) must follow .




interface Line {
    
}

interface Polygon {
    
}

class Rectangle implements Line ,Polygon {}

//Here the class Rectangle implements two different interfaces . This is how acheive multiple inheritance in java .

//Note: All the methods inside an interface are implicitly public and all fields are implicitly public static final. For example,
interface Language {
     // by default public static final
  String type = "programming language";

  // by default public
  void getName();
}