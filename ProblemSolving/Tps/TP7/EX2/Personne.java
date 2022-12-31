public class Personne {
    protected int id;
    protected String nom, prenom;
    protected static int count;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public static int getCount() {
        return count;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPrenom() {
        this.prenom = prenom;
    }

    @Override

    public String toString() {
            return nom.toUpperCase() + " " + prenom.substring(0,1).toUpperCase()+
				prenom.substring(1);
	}

}
