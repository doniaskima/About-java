public class Livre {
    private String titre;
    private String auteur;
    private int page;
    private double prix;
    
    public void Livre(String t, String aut, int p, double price) {
        this.titre = t;
        this.auteur = aut;
        this.page = p;
        this.prix = price;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String titre) {
        this.auteur = auteur;
    }
    
    public int getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
    public double getPrix() {
        return prix;
    }

    public void setPrix(double page) {
        this.prix = prix;
    }

    public String toString() {
        Systeme.out.println("livre de titre "+ this.titre + "ecrit par " + this.auteur +" ayant " + this.page + "pages et de prix " + this.prix + "Dinars .")
    }
}
