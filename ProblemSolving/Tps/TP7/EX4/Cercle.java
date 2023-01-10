public class Cercle extends Ellipse{
    private static double rayon;

    private double horz;
    private double vertic;


    public Cercle(double horz, double vertic, double rayon) {
        if (horz == vertic) {
            super(horz, vertic);
        }
        this.rayon = rayon;
    }
    
    public double perimetre() {
        super.perimetre();
    }

    public double surface() {
        super.surface();
    }
}
