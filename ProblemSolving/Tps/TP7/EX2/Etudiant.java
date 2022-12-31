public class Etudiant extends Personne{
    private long nce;

    public Etudiant(String x, String y, long z) {
        super(x, y);
        nce = z;
    }

    @Override

    public String toString() {
        return super.toString() + ", Numéro étudiant ";
    }
}
