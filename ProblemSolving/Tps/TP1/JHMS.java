import java.util.Scanner;
public class JHMS {
    static int minutes = 60;
    static int heures = 60 * minutes;
    static int jours = 24 * heures;
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int ns;
    System.out.print("Nombre de secondes? ");
    ns = input.nextInt();
    int jr = ns / jours;
    ns %= jours;
    int hr = ns / heures;
    ns %= heures;
    int mn = ns / minutes;
    ns %= minutes;
    int ss = ns;
    System.out.println("Equivaut a:");
    System.out.println("jours =" + jr);
    System.out.println("heures =" + hr);
    System.out.println("minutes =" + mn);
    System.out.println("secs =" + ss);
    ns = jr * jours + hr * heures + mn * minutes + ss;
    System.out.println( ns + " secondes");
    

 
     
    }
}


 