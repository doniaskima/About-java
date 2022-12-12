public class Commercant extends Client {
    private String tva;
    private float remise;

    public Commercant(String tva,float remise, String id, String nom, int prix, String adresse, String telephone, String email) {
        super(id, nom, prix, adresse, telephone, email);
        this.tva = tva;
         
    }
    
}
