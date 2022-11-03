public class Etagere {
    Livre[] livres;
    private int nbr = 0;


    // nombre de livres qui peut contenir l'etagere 
    public Etagere(int nbmax) {
        livres = new Livre[nbmax];
    }
    // le nombre de livre q'elle contient 
    public int nbMaxLivres() {
        return livres.length;
    }
    


}
