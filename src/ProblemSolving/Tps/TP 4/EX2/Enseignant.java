public class Enseignant extends Personne{

    private String Echelon;
    private String nbHeure;
    private double taux[];



    public Enseignant(String Nom, String prenom, String adresse, String Echelon, String nbHeure, double taux) {
        this.Echelon = Echelon;
        this.nbHeure = nbHeure;
        this.taux = taux;
        super(Nom, prenom, adresse, Echelon);
    }

    public String toString() {
        return super.toString(); " Echelon:  "
                + Echelon + "  nombre d'heures:  " + nbHeure ;
    }

}
