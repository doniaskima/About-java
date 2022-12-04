class Technician extends Employee {
    private final static double FACTEUR_UNITE = 5.0;
    private int unites;

    public Technician(String prenom, String nom, int age, String date, int unities) {
        super(prenom, nom, age, date);
        this.unites = unities;
    }

    public double calculSalaire() {
        return FACTEUR_UNITE * unities;
    }

    public String getTitre() {
        return "Le Technician";
    }

}