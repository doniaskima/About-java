
import java.util.Scanner;

public class Pharmacie {
	private static Scanner sc = new Scanner(System.in);
	static int choix;
    static int menu()
    {   choix =0;
    	System.out.println("1 - Achat");
    	System.out.println("2 - Approvisionnement en médicaments");
    	System.out.println("3 - Etat des stocks et des crédits");
    	System.out.println("4 - Quitter");
    	while(choix!=1 && choix!=2 && choix!=3 && choix!=4)
    	{
    		System.out.print("Choix (1..4): ");
    		choix = sc.nextInt();
    	}
    	return choix;
    }
    static void affichage(Client[] c, Medicament []m)
    {
    	System.out.println("Affichage des crédits");
    	for(int i=0;i<c.length;i++)
    	{
        	System.out.println("Crédit client "+c[i].getNom() + ": "+c[i].getCredit());
    	}
    	System.out.println("Affichage des stocks");
    	for(int i=0;i<m.length;i++)
    	{
        	System.out.println("Stock médicament "+m[i].getNom() + ": "+m[i].getStock());

    	}
    }
    /*retourner un client exixtant */
    static Client lireClient(Client[] c)
    {
    	System.out.print("Nom du client : ");
    	String nom = sc.next();
    	int i=0;

    	while(i<c.length)
    	{
    		if(c[i].getNom().equals(nom))
    			return c[i];	
    		else
    			i++;   		
    	}
    	return null;
    }
    /*retourner un médicament exixtant */
    static Medicament lireMedicament(Medicament[] m)
    {
    	System.out.print("Nom du médicament : ");
    	String nom = sc.next();
    	
    	int i=0;

    	while(i<m.length)
    	{
    		if(m[i].getNom().equals(nom))
    			return m[i];	
    		else
    			i++;   		
    	}
    	return null;
    }
    /* lire un double*/
    static double lireDouble(String s)
    {
    	System.out.print(s);
    	double x = sc.nextDouble();
    	return x;
    }
    /* lire un entier*/
    static int lireInt(String s)
    {
    	System.out.print(s);
    	int x = sc.nextInt();
    	return x;
    }
    /*achat d'un medicamet*/
    static void achat(Client[] c, Medicament []m) {
    	Client client = lireClient(c);
    	Medicament médicament = lireMedicament(m);
    	double paiement = lireDouble("Paiement : ");
    	int quantite = lireInt("Quantite souhaité : ");
    	if(quantite<médicament.getStock())
    	{
    		médicament.diminuerStock(quantite);
    		client.augCredit((médicament.getPrix() * quantite) - paiement);
    	}
    	else
    		System.out.println("solde médicament insuffisant");
    }
	public static void main(String[] args) {
		
		Client []c = new Client[2];
		Medicament []m = new Medicament[2];
		
		c[0] = new Client("jiji",0);
		c[1] = new Client("Marwa",0);
		m[0] = new Medicament("Aspiron",20.400,5);
		m[1] = new Medicament("Rhinoflex",20.400,5);
		
		do {
			choix = menu();
			switch(choix)
			{
			case 1 : achat(c,m); break;
			case 2 : System.out.println("f2"); break;
			case 3 : affichage(c,m); break;
			case 4 : System.out.println("Programme terminé"); break;
			}
			
		}while(choix<4);

	}

}