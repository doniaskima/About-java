
//interface 
interface Animal {
    public void animalSound(); //interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)

    // Pig implements the animal interface 

}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says : idk");
    }

    public void sleep() {
        System.out.println("Zzzz");
    }
}

class MyMainClass {
    public static void main(String){
        Pig myPig = new Pig(); //create a Pig
        myPig.animalSound();
        myPig.sleep();
    }
}
