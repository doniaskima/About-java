import java.util.Scanner;

public class TestEtudiant {

    public static void afficher(Etudiants t[])
    {
        for (int i = 0; i < t.length; i++) {
            t[i].showEtudiant();
        }
    }
    public static void trie_insertion(Etudiants t[])
	{
		int i;
		int j;
		Etudiants v;
		
		for(i=1;i<t.length;i++)
		{
			j=i;
			v=t[i];
			
			while( j > 0 && v.Moyenne() < t[j-1].Moyenne())
			{
				t[j]=t[j-1];
				j--;
			}
			t[j]=v;
		}
	}
    public static void main(String[] args) {
        Etudiants s1 = new Etudiants();
        s1 = s1.CreerObjetEtudiant();
        s1.classeshowEtudiant();
        Etudiants s2 = new Etudiants();
        System.out.println("Etudiants 2 :\n");
        s2 = s2.CreerObjetEtudiant();
        s2.classeshowEtudiant();
        if (s1.compareName(s1, s2) == true) {
            System.out.println("les deux noms sont identiques");
        } else {
            System.out.println("les deux noms ne sont pas identiques");
            if (s1.Moyenne() > s2.Moyenne()) {
                System.out.println(s1.getPrenom() + " " + s1.getNom() + " " + "est meilleur");
            } else {
                System.out.println(s2.getPrenom() + " " + s2.getNom() + " " + " " + "est meilleur");
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("taper le nombre dets Etudiants");
        int n=sc.nextInt();
        Etudiants [] ListeEtudiants= new Etudiants[n];

        for (int i = 0; i < n; i++) {
            ListeEtudiants[i] = ListeEtudiants[i].CreerObjetEtudiant();
        }
        
        afficher(ListeEtudiants);
        trie_insertion(ListeEtudiants);
        afficher(ListeEtudiants);


    }
}
