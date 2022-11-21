public class Personne {
    private String Nom;
    private String prenom;
    private String Adresse;

    public Personne(String nom, String prenom, String adresse) {
        this.Nom = nom;
        this.prenom = prenom;
        this.Adresse = adresse;
    }


    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setNom(String nom) {
        this.Nom = nom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }


    public String toString() {
        return "Nom :" + Nom + ", prenom : " + prenom + ",Adresse : " + Adresse ;
    }
}
