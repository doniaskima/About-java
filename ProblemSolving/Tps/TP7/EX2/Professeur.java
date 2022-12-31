public class Professeur extends Employe {
    private String specialte;

    public Professeur(String x, String y, double z, String t) {
        super(x, y, z);
        this.specialte = t;
    }

    public String getSpecialte() {
        return specialte;
    }

    public void setSpecialte(String specialte) {
        this.specialte = specialte;
    }

    @Override
    public String toString() {
        return super.toString() + "specialte" + specialte;
    }

}
