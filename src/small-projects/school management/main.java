import java.util.*;
import java.text.SimpleDateFormat;


public class main {
    public static void main(String[] args) {

        boolean isRunning = true;
        ArrayList<Eleve> listEleve = new ArrayList<Eleve>();
        List<Parent> listParent = new ArrayList<Parent>();
        List<Adresse> listeAdress = new ArrayList<Adresse>();
        ArrayList<Animateur> listeAnimateur = new ArrayList<Animateur>();
        List<Classe> listeClasse = new ArrayList<Classe>();
     	ArrayList<Eleve> classlisteeleve= new ArrayList<Eleve>();
        ArrayList<Activite> Activiteliste = new ArrayList<Activite>();
        
        

        
        /******************************add animateur************************************/

        simpleDateFormat sdf = new SimpleDateFormat("MM--dd-yyyy");
        Calendar animateur1date = Calendar.getInstance();
        animateur1date.set(Calendar.YEAR, 2001);
        animateur1date.set(Calendar.MONTH, 12 - 1);//months start at 0
        animateur1date.set(Calendar.DAY_OF_MONTH, 20);
        java.sql.Date dateAnimateur1 = new java.sql.Date(animateur1date.getTimeInMillis());
        //return the current time of this Calendar in Milliseconds.
        sdf.format(dateAnimateur1);
        Animateur animateur1 = new Animateur("Marwa", "Majdoub", 12345252, null, dateAnimateur1);
        Animateur animateur2 = new Animateur("Sirine", "Sarray", 12345252, null, dateAnimateur1);
        Animateur animateur3 = new Animateur("Jiji", "Skima", 12345252, null, dateAnimateur1);
        Animateur animateu4 = new Animateur("Islem", "Skima", 12345252, null, dateAnimateur1);
        Animateur animateur1 = new Animateur("Hanin", "Dhaou", 12345252, null, dateAnimateur1);
        listeAnimateur.add(animateur4);
        listeAnimateur.add(animateur3);
        listeAnimateur.add(animateur2);
        listeAnimateur.add(animateur1)


    }
}
