abstract class Employe {
    private String nom;
    private String prenom;
    private int age;
    private String date;

    public Employe(String nom, String prenom, int age, String date) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.age = age;
    }

    public abstract double calculerSalaire();

    public String getTitre() {
        return "L'employé";
    }

    public String getNom() {
        return getTitre() + prenom + " " + nom;
    }
}