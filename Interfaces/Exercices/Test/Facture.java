
public class Facture extends Produit {
    private int num_f;
    private Date date_f;
    private double Totale;
    private String id_c;
    private String nom_client;
    private String prenom_client;
    private Produit Tp[];
    private Client Tc[];
    private Commercant Tcom[];
    private Commande Tcommandes[];

    public Facture(String id, String n, double p, int q, boolean b, int num, Date d, double t, String idc, String nomclient,
            String prenomclient) {
        super(id, n, p, q, b);
        num_f = num;
        date_f = d;
        Totale = t;
        id_c = idc;
        nom_client = nomclient;
        prenom_client = prenomclient;

    }

    public void facturation (Facture F)
	{
		System.out.println("nom : "+F.nom_client+" prenom : "+F.prenom_client+"nom produit :"+F.nomP+"\nquantite ="+f.quantite+"\nprix unitaire ="+f.prix_U);
		System.out.println("le total ="+F.prix_U*f.quantite);
	}

	public void Afficher()
	{ int nb =0;
		for(int i=0 ; i<Tp.length ; i++)
		{
			nb+=1;
		}
		System.out.println("Le nombre totale des produits:"+nb);
	}


}
	
	

