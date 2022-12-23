
//– écrire une interface contenant la méthode permettant de crier

interface Criant {
    void crier();
}

// écrire les classes des chats, des chiens et des lapins (qui sont muets)
// to access the interface methods , the interface must be implemented (kinda like inherited) by anoother class with the implements keyword(instead of extends)

class Chat implements Criant {
    public void cree() {
        System.out.println("Maou");
    }
}

class Chien implements Criant {
    public void crieer() {
        System.out.println("Wouf");
    }
}
class Lapin {
    public void foncerDuNez() {
        ;
    }
}

public class Animals {
    public static void main(String[] args) {
        Criant[] tab = new Criant[4];
        tab[0] = new Chat();
        tab[1] = new Chien();
        tab[2] = new Chat();
        tab[3] = new Chien();
        for (int i = 0; i < 4; i++) {
            tab[i].crier();
        }
    }
}
