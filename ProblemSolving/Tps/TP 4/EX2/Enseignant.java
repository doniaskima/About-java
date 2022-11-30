
public class Enseignant extends Personne {

	private int Echelon ;
	private double nbHeure ;
	public static double taux_salaire[]= new double[]{40,42,43,44,46,50,52};
	
	public Enseignant ( String N ,String P , String A , int E , double NB )
	{
		super(N,P,A);
		Echelon = E ;
		nbHeure = NB;
	}
	public int getEchelon()
	{
		return Echelon ;
	}
	public void setEchelon(int E)
	{
		Echelon=E;
	}
	public double getNbHeure()
	{
		return nbHeure ;
	}
	public void setClasse(double NB)
	{
		nbHeure=NB;
	}
	
	public String toString()
	{
		return super.toString()+"\nEchelon :"+Echelon+"\nnbHeure :"+nbHeure;
	}
	public boolean EchelonValide()
	{
		return (Echelon >= 1 && Echelon <= 7);
	}
	
	public double Getprixheure(int i)
	{
		if(EchelonValide())
		    return taux_salaire[i] ;
		else
			return 0 ;
	}
	
	public double calculSalaire()
	{
		if (EchelonValide())
		return (nbHeure * taux_salaire[Echelon]);
		else return 0 ;
	}
	
}
