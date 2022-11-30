
public class Eleve extends Personne {

	private String Classe;
	
	public Eleve (String C , String N ,String P , String A)
	{
		super(N,P,A);
		Classe=C;
	}
	
	public String toString()
	{
		return super.toString()+"Classe"+Classe;
	}
	public String getClasse()
	{
		return Classe ;
	}
	public void setClasse(String C)
	{
		Classe=C;
	}

}
