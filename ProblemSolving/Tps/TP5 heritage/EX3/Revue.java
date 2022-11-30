

public class Revue extends Document {
    private int mois, annee;

    public Revue(int mois, int annee, int NumEnreg, String titre) {
        super(NumEnreg, titre);
        this.mois = mois;
        this.annee = annee;
    }

    public int getAnnee() {
        return annee;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return super.toString() + "Revue{" + "mois=" + mois + ", annee=" + annee + '}';
    }

}