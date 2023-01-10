import java.util.*;

public class Ellipse extends FormeEuclidienne{
    private double horz;
    private double vertic;


    public Ellipse(double horz, double vertic) {
        if (horz != vertic) {
            this.horz = horz;
            this.vertic = vertic;
        }
    }

    public double perimetre() {
        super.perimetre();
        return (horz + vertc) * Math.PI;
    }

    public double surface() {
        super.surface();
        return (horz * vertic) * Math.PI;
    }
    
}
