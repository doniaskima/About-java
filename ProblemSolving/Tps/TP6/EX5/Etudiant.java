

public class Etudiant 
{
	private String nom;
	private String prenom;
	private Note notes[] = new Note[50];
	private int identifiant;
	private int nb=0;
	
	public Etudiant( String n , String p , int id )
	{
		this.nom = n;
		this.prenom = p;
		this.identifiant = id;
	}
	
	
	public void ajouter_note(Note n)
	{
		notes[nb] = n;
		nb++;
	}
	
	public float moyenne()
	{
		float s = 0;
		
		for(int i=0;i<nb;i++)
		{
			s+= notes[i].get_val() * notes[i].get_coef();
		}
		
		if (nb == 0)
		{
			return 0;
		}
		
		return ( s / nb );
	}
	
	
	
}
