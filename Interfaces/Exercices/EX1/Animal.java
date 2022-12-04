interface Criant {
    public void crier();
}


class Chat implements Criant {
    public void crier() {
        System.out.println("maou");
    }
}

class Chien implements Criant {
    public void crier() {
        System.out.println("Wouf");
    }
}

class Lapin implements Criant {
    public void crier() {
        ;
    }
}

public class Animal {
    public static void main(String[] args) {
        Criant[] tab = new Criant[4];
        tab[0] = new Chat();
        tab[0] = new Chien();
        tab[2] = new Chat();
        tab[3] = new Chien();

        for (int i = 0; i < 4; i++) {
            tab[i].crier();
        }
    }
}