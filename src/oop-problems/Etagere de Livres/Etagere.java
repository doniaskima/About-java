public class Etagere {
    Livre[] livres;
    private int nbr = 0;

    public Etagere(int nbmax) {
        livres = new Livre[nbmax];
    }

    public int nbMaxLivres() {
        return livres.length;
    }
    

}
