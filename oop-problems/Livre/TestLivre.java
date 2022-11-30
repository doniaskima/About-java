
import java.util.Scanner;
 
public class TestLivre {
 
	public static void main(String[] args) {
		Livre[] livres = new Livre[3];
		Scanner sc = null;
		for (int i = 0; i < livres.length; i++) {
			sc = new Scanner(System.in);
			System.out.print("Donner le titre du livre n°  " + (i + 1) + " :");
			String titre = sc.nextLine();
			System.out.print("Donner l'auteur du livre n°  " + (i + 1) + " :");
			String auteur = sc.nextLine();
			System.out.print("Donner le prix du livre n°  " + (i + 1) + " :");
			int prix = sc.nextInt();
			livres[i] = new Livre(titre, auteur, prix);
		}
		sc.close();
		for (Livre l : livres)
			System.out.println(l);
 
		System.out.println("Le nombre de livres est " + Livre.count);
	}
 
}
 