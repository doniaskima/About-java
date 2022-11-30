package Exercice2;

public class Personne {
	
	protected String Nom ;
	protected String prenom ;
	protected String Adresse ;
	
	public String getNom()
	{
		return Nom ;
	}
	public String getPrenom()
	{
		return prenom ;
	}
	public String getAdresse()
	{
		return Adresse ;
	}
	public void setNom(String N)
	{
		Nom=N;
	}
	public void setPrenom(String P)
	{
		prenom=P;
	}
	public void setAdresse(String A)
	{
		Adresse=A;
	}
	public String toString()
	{
		return "Nom :"+Nom+"\nPrenom :"+prenom+"\nAdresse :"+Adresse;
	}
	public Personne(String N ,String P,String A)
	{
		Nom=N;
		prenom=P;
		Adresse=A;
	}

}
