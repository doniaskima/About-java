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