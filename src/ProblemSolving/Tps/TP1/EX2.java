import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Donner le jour :");
        int jour = input.nextInt();
        System.out.println("Donner le mois :");
        int mois = input.nextInt();
        System.out.println("Donner le anneé :");
        int annee = input.nextInt();
        if( (jour<1) || (jour>31) || (mois <1) || (mois>12) || ((mois==2) && ((jour>29) && (annee%4==0)) || ((jour>28) && (annee%4!=0)))){
            System.out.println("date incorrecte !");
        }else if ((mois=1)||(mois=3)||(mois=5)|| (mois=7)|| (mois=8)|| (mois=10) || (mois=12)){
           int nombre_de_jours_du_mois=31;
        }else if((mois=4)||(mos=6)||(mois=9)||(mois=11)){
           int nombre_de_jours_du_mois=30;
        }
        if ((annee%4==0)){
           int nombre_de_jours_du_mois=29;
        }else{
           int nombre_de_jours_du_mois=28;
        }

        if(jour<nombre_de_jours_du_mois){
            int jour_lendemain=jour+1;
           int  mois_lendemain=mois;
            int annee_lendemain=annee;
        }else{
            jour_lendemain=1;
            if(mois<12){
                int mois_lendemain=mois+1;
               int annee_lendemain=annee;
            }else{
                int mois_lendemain=1;
                int annee_lendemain=annee+1;
            }
        }
         System.out.println("le jour du lendemain "+ jour_lendemain);
         System.out.println("le mois du lendemain "+  mois_lendemain);
           System.out.println("l'anne du lendemain "+  annee_lendemain);
    }

}

