public class Carre extends Rectangle {
    


    public Carre(double base1 , double base2 , cote1, double cote2, double hauteur){
        super(base1, base2, hauteur, cote1, cote2);
        cote1=cote2;
        cote2=base1;
        base1=base2;
        base2=hauteur;
    }

    public double perimetre() {
       return super.perimetre();
    }

    public double surface() {
       return super.surface();
        
    }

    public void afficher() {
     super.afficher();
    }
}
