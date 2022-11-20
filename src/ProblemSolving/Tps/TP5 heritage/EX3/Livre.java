public class Livre extends Document {
    
    private String Acteur;
    private int NPages;


    public Livre(String acteur, int nbPage, int NE, String titre) {
        super(NE, titre);
        this.Acteur = acteur;
        this.NPages = nbPage;
    }
    
    public String getActeur() {
        return Acteur;
    }

    public int getPages() {
        return NPages;
    }

    public void setActeur(String acteur) {
        this.Acteur = acteur;
    }

    public void setNPages(int NPages) {
        this.NPages = NPages;
    }

    public String toString() {
        return super.toString()+"Livre{" + "Auteur=" + Acteur + ", NbrPages=" + NPages + '}';
    }

}