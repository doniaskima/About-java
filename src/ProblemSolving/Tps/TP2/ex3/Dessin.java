 public class Dessin {
    Rectangle t[];
    int Nb, NbMax;

    public Dessin(int Nb) {
        t = new Rectangle[Nb];
        Nb = 0;
        NbMax = Nb;
    }

    public void ajouter(Rectangle R) {
        if (Nb < NbMax) {
            t[Nb] = R;
            Nb++;
}
    }

    public void surface(Rectangle R) {
        int somme=0;
            for (int j = 0; j < t.length(); i++) {
                somme = somme + t[j].surface(R);
            }
            System.out.println("la somme du surfaces est egale "+somme);
    }

    public void translate(double dx, double dy) {
  
        for (int i = 0; j < t.length(); j++) {
            t[j].translate(dx, dy);
        } 
    }
}

