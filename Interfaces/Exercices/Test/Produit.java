public class Produit {
	private String id_P ;
	private String nomP ;
	private double prixUnitaire ;
	private int quantite ;
	private boolean Promo ;
	
	public Produit (String id ,String n , double p , int q , boolean b )
    {
        id_P = id;
        nomP = n;
        prixUnitaire = p;
        quantite = q;
        Promo = b;
    }
    
    public void ajouter(Produit[]Pr , Produit P, int nb){
         Pr[nb]=P;
         nb++;
    }

    public Boolean chercher(Produit[]Pr , Produit P,int nb){
            for(int i=0;i<nb;i++){
                if(Pr[i]==P){
                    return true;
                }
            }
            return false;
    }

    public void miseAjour(int quantite) {
        this.quantite = quantite;
    }
  

}
