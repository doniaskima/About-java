public class Ville {

    private int nbHabitants;
    private String nom;

    public Ville(int x, String name) {
         this.nom=name.toUpperCase();
         nbHabitants=Math.abs(x);
    }

    public String getNom(String name) {
        return nom = name;
    }

    public void setNbH(int y) {
        if (y > 0) {
            nbHabitants = y;
        }
    }

    public String obtenirInformation() {
        return "nom" + nom + " nbre dhabitant = " + nbHabitants;
    }
}
