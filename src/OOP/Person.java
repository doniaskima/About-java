
//Java objects’ state and behavior

public class Person {
    // state of an object 
    int age;
    String name;

    // behaviour of an object 
    public void set_value() {
        age = 20;
        name = "Robin";
    }

    public void get_value() {
        System.out.println("Age is " + age);
        System.out.println("Name is" + name);
    }

    // main Method 
    public static void main(String[] args){
        // create a new Person 
        Person p = new Person();

        // changes state through behaviour
        p.set_value();
    }
}


// Java instance

public class Person {
  int age;
  String name;
  
  // Constructor method
  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }
  
  public static void main(String[] args) {
    Person Bob = new Person(31, "Bob");
    Person Alice = new Person(27, "Alice");
  }
}


// Java dot notation 
public class Person {
    int age;
    public static void main(String[] args) {

        Person p = new Person();

        // here we use dot notation to set age 
        p.age = 20;
        // here we use dot notaion to access age and print 
        System.out.println("Age is " + p.age);
        // Output : Age is 20 
    }
}

//Constructor Method in Java

public class Maths {
    public Maths() {
        System.out.println("I am constructor");
    }
    public static void main(String[] args) {
        System.out.println("I am main");
        Maths obj1 = new Maths();
    }
}

// Creating a new Class instance in Java

public class Person {
    int age;
    // Constructor:
    public Person(int a) {
        age = a;
    }

    public static void main(String[] args) {
        // Here , we create a new insance of the Person class :
        Person p = new Person(20);
        System.out.println("Age is"+ p.age)
        //Prints: Age is 20
     }
}
//new keyword followed by a call to the class constructor in order to create a new instance of a class.


//Reference Data Types

public class Cat {
    public Cat() {
        // instructions for creating a Cat instance
    }

    public static void maon(String[] args) {
        Cat getfield = new Cat();
        System.out.println(garfield); // Prints: Cat@76ed5528
    }
}


// Constructor Signatures

// The signature is `Cat(String furLength, boolean hasClaws)`.
public class Cat {
    String furType;
    boolean  containsClaws;

    public Cat(String furLength, boolean hasClaws) {
        furType = furLength;
        containsClaws = hasClaws;
    }

    public static void main(String[] args) {
        Cat garfield = new Cat("Long-hair", true)
    }
}

// null values 
public class Bear {
    String species;

    public Bear(String speciesOfBear) {
    species = speciesOfBear;
  }

    public static void main(String[] args) {
        Bear baloo = new Bear("Sloth bear");
        System.out.println(baloo); // Prints: Bear@4517d9a3
        // set object to null
        baloo = null;
        System.out.println(baloo); // Prints: null

  }
}

// The Body of a java method 
public class Maths {
  public static void sum(int a, int b) { // Start of sum
    int result = a + b;
    System.out.println("Sum is " + result);
  } // End of sum
  
  
  public static void main(String [] args) {
    // Here, we call the sum method
    sum(10, 20);
    // Output: Sum is 30
  }
}

//Method parameters in Java
public class Maths {
    public int sum(int a, int b) {
        int k = a + b;
        return k;
    }

    public static void main(String[] args) {
        Maths m = new Maths();
        int result = m.sum(10, 20);
        System.out.println("sum is " + result);
        // prints - sum is 30
    }


}

// Java variables inside a Method 

//For example, `i` and `j` variables are available in the `main` method only:

public class Maths {
    public static void main(String[] args) {
        int i, j;
        System.out.println("These two variables are available in main method only");
    }
}


//Returning info from a Java method

public class Maths {
    // return type is int 
    public int sum(int a, int b) {
        int k;
        k = a + b;
        return k;
    }

    public static void main(String[] args) {
        Maths m = new Maths();
        int result;
        result = m.sum(10, 20);
        System.out.println("Sum is " + result);
        // Output: Sum is 30
    }
}

//Declaring a Method


// Here is a public method named sum whose return type is int and has two int parameters a and b
public int sum(int a, int b) {
  return(a + b);
}


