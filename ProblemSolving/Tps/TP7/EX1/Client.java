public class Client {
    private string nom;
    private string prenom;
    private double credit;

    public Client(String nom, double credit) {
        this.nom = nom;
        this.credit = credit;
    }

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void augCredit(double m) {
        this.credit += m;
    }

    @Override
    public String toString() {
        return "Le Nom du CLient est" + nom + "credit" + credit;
    }
 }