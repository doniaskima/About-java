public class Etagere {
    Livre[] livres;
    private int nbr = 0;


    // Constructeur
    public Etagere(int nbmax) {
        livres = new Livre[nbmax];
    }
    //methodes
    public int nbMaxLivres() {
        return livres.length;
    }

    public int nbCourants() {
        return nbr;
    }

    public boolean ajouter(Livre L) {
        if (nbr < livres.length) {
            livres[nbr] = L;
            nbr++;
        } else {
            return false;
        }
        return true;
    }
    
    public Livre getLivre(int index) {
        return (livres(index - 1));
    

    public int chercher(String titre, String auteur) {
        for (int i = 0; i < livres.length(); i++) {
            if (livres[i].titre == titre && livres[i].auteur == auteur) {
                return i;
            }
        }
        else return 0;
    }
    




}
