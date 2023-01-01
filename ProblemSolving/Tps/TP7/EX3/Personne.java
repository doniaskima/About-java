public abstract class Personne {
    protected int id;
    protected String fullName, email;
    protected double salaire;
    private static int count;

    public Personne(String x, String y, double z) {
        this.id = ++count;
        this.fullName = x;
        this.email = y;
        this.salaire = z;
    }

    public abstract double calculerSalaire();
 }