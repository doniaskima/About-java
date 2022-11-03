import java.util.Scanner;

public class Etudiants {
   
    private String prenom;
    private String nom;
    private double note1;
    private double note2;

    public String getPrenom() {
        return this.prenom;
    }

    public String getNom() {
        return this.nom;
    }

public static Etudiants CreerObjetEtudiant(){
     Etudiants S = new Etudiants();
     Scanner sc= new Scanner(System.in);
     System.out.println("donner le prenom de l'etudiant");
      S.prenom =sc.nextLine();
     System.out.println("donner le nom de l'etudiant");
      S.nom =sc.nextLine();
     System.out.println("donner le note1");
      S.note1 =sc.nextDouble();
     System.out.println("donner le note2");
      S.note2 =sc.nextDouble();
    return S;
}

public double Moyenne() {
    return ((this.note1 + this.note2) / 2);
}
public void classeshowEtudiant(){
    //affichage 
    System.out.println("les informations de l'eléve\t: " + this.prenom);
    System.out.println("le npm\t:" + this.nom);
    System.out.println("note1\t:" + this.note1 +"\t"+ "note2:\t" + this.note2);
    System.out.println("Moyenne\t:" + Moyenne());

}
// Partie2
public boolean compareName(Etudiants s1, Etudiants s2) {
    return (s1.nom == s2.nom && s1.prenom == s2.prenom);
}

public void showEtudiant()
{
    System.out.println("nom =" + this.nom);
    System.out.println("prenom =" + this.prenom);
    System.out.println("moyen =" + this.Moyenne());		
}   
}
