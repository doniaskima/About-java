public class Personne implements Homme {
    private String nom;
    private String prenom;

    public Personne(String N, String P) {
        nom = N;
        prenom = P;
    }

    public void identifier() {
        System.out.println("nom" + nom);
        System.out.println("prenom" + prenom);
    }
}