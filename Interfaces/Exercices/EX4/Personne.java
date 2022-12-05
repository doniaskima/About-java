public class Personne implements Homme
{
	private String nom;
	private String prenom;
	
	public Personne(String n , String p)
	{
		this.nom = n;
		this.prenom = p;
	}
	
	public void identiter()
	{
		System.out.println("\nnom = " + nom);
		System.out.println("prenom = " + prenom);
	}
}