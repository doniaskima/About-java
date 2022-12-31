public class Employe extends Personne{
    protected double salaire;

    public Employe(String x, String y, double z) {
        super(x, y);
        salaire = z;
    }

    @Override
    public String toString() {
        return super.toString() + ", touche " + salaire + "dt";
    }
}
