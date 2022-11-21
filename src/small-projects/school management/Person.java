import java.util.Date;

public class Person {
    protected String nom;
    protected String prenom;
    protected int numeroTelephone;
    protected Adresse adresse;
    protected   java.sql.Date dateNaissance;

    public Person( String nom, String prenom, int numeroTelephone, Adresse adresse,   java.sql.Date dateNaissance) {
        super();

        this.nom = nom;
        this.prenom = prenom;
  
        this.numeroTelephone = numeroTelephone;
        this.adresse = adresse;
        this.dateNaissance = dateNaissance;
    }
    public Person(){
        super();
    }



    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


    public int getNumeroTelephone() {
        return numeroTelephone;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public java.sql.Date getDateNaissance() {
        return dateNaissance;
    }

    

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

   

    public void setNumeroTelephone(int numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setDateNaissance( java.sql.Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    @Override
    public String toString() {
        
        return "Person{" +
                "nom='" + nom + '\'' +
                " prenom='" + prenom + '\'' +
                ", numeroTelephone=" + numeroTelephone +
                ", adresse=" + adresse +
                ", dateNaissance=" + dateNaissance +
                '}'+"\n";
    }

}