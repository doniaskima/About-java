public class Crayon {
    private double epaisseur, longueur;


public Crayon(double a, double b) {
    epaisseur = a;
    longueur = b;
}


public void changeLongueur(double newlong)
{
    if (newlong > 0)
        longueur = newlong;
    else
        System.out.println("valeure <0");
}


public void changeepaisseureur(double newEpaisseur)
{
    if (newEpaisseur > 0)
        epaisseur = newEpaisseur;
    else
        System.out.println("valeure <0");
}


public void description()
{
    System.out.println("Longueur= " + longueur + " epaisseur = " + epaisseur);
}

}
