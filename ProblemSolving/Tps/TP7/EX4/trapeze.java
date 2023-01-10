public class trapeze extends FormeEuclidienne{
    private  static double base1;
    private static double base2;
    private static  double cote1;
    private static double cote2;
    private static double hauteur;

    public trapeze(double base, double cote1, double cote2, double hauteur) {
        this.base1 = base1;
        this.cote2 = cote2;
        this.hauteur = hauteur;
        this.base2 = base2;
        this.cote1 = cote1;
    }
    
    public double perimetre() {
        super.perimetre();
        return base1 + base2 + cote1 + cote2;
    }

    public double surface() {
        super.surface();
        return (base1 + base2) * hauteur / 2;
    }

    public void afficher() {
        System.out.println("Perimetre du Trapeze" + perimetre() + "Surface :"+surface() );
    }

}
