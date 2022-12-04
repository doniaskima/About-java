interface ARisque {
    int PRIME = 200;
}
//Une autre sous-classe d'employé à risque

class TechnARisque extends Technicien implements ARisque {
    public TechnARisque(String prenom, String nom, int age, String date, int unites) {
        super(prenom, nom, age, date, unites);
    }
    
    public double calculSalaire() {
        return super.calculSalaire() + PRIME;
    }
}