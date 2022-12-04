class Vendeur extends Commercial {
    private final static double POURCENT_VENDEUR = 0.2;
    private final static int BONUS_VENDEUR = 400;
    //static final :can't be changed and is the same for every instance of the class .
    //The final keyword means once the variable is assigned a value it can never be changed .
    // The combination of static final in java is how to create a constant value .
    public vendeur(String prenom,String nom,int age, String date, double chiffreAffaire){
        super(prenom,nom,age,date,chiffreAffaire);
    }

    public double calculSalaire() {
        return (POURCENT_VENDEUR * getChiffreAffaire()) + BONUS_VENDEUR;
    }

    public String getTitre() {
        return "Le Vendeur";
    }

}