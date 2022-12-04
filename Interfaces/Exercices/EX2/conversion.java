interface Convertible {
    int toInt();
 }

 class Compte implements Convertible {
     int solde;
     String titulaire;
     int numero;

     public Compte(String n, int num) {
         titulaire = n;
         numero = num;
         solde = 0;
     }

     public void afficher() {
         System.out.println("solde" + this.solde);
     }
     
     public void deposer(int montant) {
         this.solde = this.solde + montant;

     }

     public void retire(int montant) {
         this.solde = this.solde - montant;
     }
     
     public int toInt() {
         return solde;
    }
}


class Date implements Convertible {
    int jour;
    int mois;
    int annee;

    public Date(int j, int m, int a) {
        this.jour = j;
        this.annee = a;
        this.mois = m;
    }

    public void afficherDate() {
        System.out.println(this.jour + " " + this.annee + " " + this.mois);

    }

    public int toInt() {
        return annee*10000+mois*100+jour;
    }

}