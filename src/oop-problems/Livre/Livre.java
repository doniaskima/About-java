public class Livre {
    private String Titre;
    private int id;
    private String Auteur;
    private int Prix;
    public static int count;

    public  Livre(String T, String Auteur, int P) {
        this.Titre = T;
        this.Auteur = Auteur;
        this.Prix = P;
        this.id = ++count;
    }

    public int getPrix() {
        return Prix;
    }

    public void setPrix(int Prix) {
        this.Prix = Prix;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String Auteur) {
        this.Auteur = Auteur;
    }
    public String getTitre() {
        return Titre;
    }

    public void setTitre(String Titre) {
        this.Titre = Titre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
    @Override
    public String toString() {
        return "le prix du livre" + this.Titre + " de l'auteur" + this.Auteur + "est :" + this.Prix;
    }

}
