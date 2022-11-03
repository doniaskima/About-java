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

    public boolean ajouter(Livre L){
        if (nbr < livres.length) {
            livres[nbr] = L;
            nbr++;
        } else {
            return false;
        }
        return true;
    }




}
