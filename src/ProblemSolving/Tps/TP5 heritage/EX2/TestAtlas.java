import java.util.Scanner;

public class TestAtlas {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nombre de villes");
        int n = sc.nextInt();
        Atlas a = new Atlas(n);
        for (int i = 0; i < n; i++) {
            Scanner s1 = new Scanner(System.in);
            System.out.println("donner le nom de  la ville numero " + i + 1);
            String ch = s1.nextLine();
            System.out.println("donner le nbre des habitants");
            int nh = s.nextInt();
            System.out.println("ville ou capitale 1 / 2 ?");
            Scanner s2 = new Scanner(System.in);
            int rep = s2.nextInt();
            if (rep == 1) {
                Ville v = new Ville(ch, nh);
                a.inserer(v);
            } else {
                System.out.println("donner le pays de capitale " + i + 1);
                Scanner s3 = new Scanner(System.in);
                String p = s3.nextLine();
                a.inserer(new Capitale(ch, nh, p));
            }
        }
        
        for (int i = 0; i < n; i++) {
            a.t[i].obtenirinforamation();
        }
        
        Ville v1 = a.rechercher("Suisse");

        if(v1!=null)
        {
            System.out.println("\n la ville  existe ");
            v1.obtenirinforamation();
        }
        
        else {
            System.out.println("la ville n existe pas");
        }
    

    }
}
