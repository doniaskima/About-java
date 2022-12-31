import java.util.Scanner;

public class Pharmacie {
    private static Scanner sc = new Scanner();
    static int choix;

    static int menu() {
        choix = 0;
        System.out.println("1-Achat");
        System.out.println("2 - Approvisionnement en médicaments");
        System.out.println("3 - Etat des stocks et des crédits");
        System.out.println("4 - Quitter");

        while (choix != 1 && choix != 2 && choix != 3 && choix != 4) {
            System.out.print("Choix (1..4): ");
            choix = sc.nextInt();
        }
        return choix;
    }
    
    static void affichage(Client[] c, Medicament[] m) {
        System.out.println("Affichage des credits");
        for (int i = 0; i < c.length; i++) {
            System.out.println("Credit client " + c[i].getNom() + ": " + c[i].getCredit());
        }
        System.out.println("Affichage des stocks");
        for (int i = 0; i < m.length; i++) {
            System.out.println("Stock médicament " + m[i].getNom() + ": " + m[i].getStock());
        }
    }
    
    static Client lireClient(Client[] c) {
        System.out.println("Nom du client :");
        String nom = sc.next();
        int i = 0;
        while (i < c.length) {
            if (c[i].getNom().equals(nom)) {
                return c[i];
            } else {
                i++;
            }
        }
        return null;
    }

    //retourner un medicament existant 
      static Medicament lireMedicament(Medicament[] m)
      {
          System.out.print("Nom du médicament : ");
          String nom = sc.next();

          int i = 0;

          while (i < m.length) {
              if (m[i].getNom().equals(nom))
                  return m[i];
              else
                  i++;
          }
          return null;
      }
    
      //lire un double 
      static double lireDouble(String s) {
          System.out.println(s);
          double x = sc.nextDouble();
          return x;
      }

      // lire un entier

      static int lireInt(String s) {
          System.out.println(s);
          double x = sc.nextInt();
          return x;
      }
      
      static void achat(Client[] c, Medicament []m) {
          Client client = lireClient(c);
          Medicament medicament = lireMedicament(m);
          double paiement = lireDouble("Paiement : ");
          int quantite = lireInt("Quantite souhaité : ");
          if (quantite < medicament.getStock()) {
              medicament.diminuerStock(quantite);
              client.augCredit((medicament.getPrix() * quantite) - paiement);
          }else 
          System.out.println("solde medicament  insuffisant ")
          
      }
}