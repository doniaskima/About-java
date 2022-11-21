import java.util.Scanner;

public class TestDocuments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner numéro d’enregistrement :");
        int NE = sc.nextInt();
        String title = sc.nextLine();
        System.out.println("Donner le Titre du Document");
        // String title = sc.nextLine();
        Document doc = new Document(NE, title);
        System.out.println(doc.toString());

        //Livre 
        System.out.println("Donner le Nom du l'Auteur");
        String name = sc.nextLine();
        System.out.println("Donner le nombre du pages");
        int nPages = sc.nextInt();
        Livre livre = new Livre(name, nPages, NE, title);
        System.out.println(livre.toString());
        
        //Roman 
        System.out.println("Donner le prix :");
        double p = sc.nextDouble();
        Roman roman = new Roman(p, NE, title, name, nPages);
        System.out.println(roman.toString());

        //Revue 
        System.out.println("Donner le mois");
        int mois = sc.nextInt();
        System.out.println("Donner annee");
        int annee = sc.nextInt();
        Revue revue = new Revue(mois, annee, NE, title);
        System.out.println(revue.toString());
        
        //Manuel 
        System.out.println("Donner Niveau");
        int niveau = sc.nextInt();
        Manuel manuel = new Manuel(name, nPages, niveau, NE, name);
        System.out.println(manuel.toString());







    
    }
}
