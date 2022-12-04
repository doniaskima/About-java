class Manutentionnaire extends Employe {
    private final static double SALAIRE_HORAIRE = 65.0;
    private int heures;


    public Manutment(String prenom, String nom ,int age,String date,int heures){
        super(prenom, nom, age, date);
        this.heures=heures;
    }

    public double calculSalaire() {
        return SALAIRE_HORAIRE * heures;
    }

    public String getTitre() {
        return "Le manut. " ;
    }
}