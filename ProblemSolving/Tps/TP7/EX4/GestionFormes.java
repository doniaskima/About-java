public class GestionFormes {
 

    int i;
    
    public void addForm(FormeEuclidienne F) {
        FormeEuclidienne[] tab = new FormeEuclid[5];
        for (int i = 0; i < 5; i++) {
            tab[i] = F;
        }
    }

    public void afficherSurface(FormeEuclidienne[] tab) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Surface d'element du tableau " + tab[i].surface());
        }

    }

    public void afficheTout(Affichable[] tab) {
        for (int i = 0; i < 5; i++) {
            tab[i].afficher();
        }
    }
}
