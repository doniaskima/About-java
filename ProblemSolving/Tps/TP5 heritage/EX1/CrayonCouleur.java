public class CrayonCouleur extends Crayon {

private String couleur;
public CrayonCouleur( double a, double b,String s) 
{
    super(a, b);
    couleur = s;
}

public void changeCouleur(String newCouleur)
{
    couleur = newCouleur;
}
public void changeCaracteristique(double x,double y,String s)
{
    super.changeLongueur(x);
    super.changeepaisseureur(y);
    changeCouleur(s);
}
public void description()
{
    super.description();
    System.out.println(" couleur = " + couleur);
}

}
