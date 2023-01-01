public class Developpeur extends Personne{
    private String specialite;

    public Developpeur(String x, String y, double z, String t) {
        super(x, y, z);
        this.specialite = t;
    }
    
    public double calculerSalaire() {
        return (salaire * 1.2);
    }

    @Override

    public String toString() {
        return "La salaire du Developpeur" + this.fullName + " est : "
	    + this.calculerSalaire() + " sa specialite : " + this.specialite;
    }
}
