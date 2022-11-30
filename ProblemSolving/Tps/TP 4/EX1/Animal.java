public class Animal {


    public String race;
    public String nom;
    public String bruit;

    public Animal(String R, String N, String B) {
        this.race = R;
        this.nom = N;
        this.bruit = B;
    }


    // public String getRace() {
    //     return race;
    // }

    // public String getNom() {
    //     return nom;
    // }

    // public String getBruit() {
    //     return bruit;
    // }

    // public void setRace(String Race) {
    //     this.race = Race;
    // }

    // public void setBruit(String Bruit) {
    //     this.bruit = Bruit;
    // }

    // public void setNom(String Nom) {
    //     this.nom = Nom;
    // }

    public String toString() {
        return "Le Race de l'anima est " + race + " Son Nom est " + nom + " le bruit " + bruit;
    }
    
    
    
}
