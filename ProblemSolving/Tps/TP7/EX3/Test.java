public class Test {
    public static void main(String[] args) {
        Personne[] personnes = new Personne[4];
        personnes[0] = new Manager("Sirine", "SirineSarray@gmail.com", 2000, "Juridique");
        System.out.println("\n");
        personnes[1] = new Developpeur("Someone", "Someone@gmail.com", 3000, "Informatique");
        System.out.println("\n");
        personnes[2] = new Manager("Mohamed", "mohames.gmail@com", 4000, "Ressources Humaines");
        System.out.println("\n");
        personnes[3] = new Developpeur("Rahim", "Rahim.gmail@com", 3000, "Informatique");
        for (Personne p : personnes) {
            System.out.print(p);
        }
    }
}