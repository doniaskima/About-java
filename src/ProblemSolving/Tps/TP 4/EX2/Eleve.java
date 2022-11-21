

public class Eleve extends Personne{

    private String classe;


    public Eleve(String nom, String prenom, String adresse, String classe) {
        super(nom, prenom, adresse);
        this.classe = classe;
    }
    
    public String toString() {
        return super.toString() +  " et classe :" + classe;
    }
}
