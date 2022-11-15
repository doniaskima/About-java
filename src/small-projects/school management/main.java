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

        SimpleDateFormat sdf = new SimpleDateFormat(
            "MM-dd-yyyy");
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
        Animateur animateur4 = new Animateur("Islem", "Skima", 12345252, null, dateAnimateur1);
        Animateur animateur5 = new Animateur("Hanin", "Dhaou", 12345252, null, dateAnimateur1);
        listeAnimateur.add(animateur5);
        listeAnimateur.add(animateur4);
        listeAnimateur.add(animateur3);
        listeAnimateur.add(animateur2);
        listeAnimateur.add(animateur1);


        while (isRunning) {
            System.out.println("/***********************************************Menu**********************************************/");
            System.out.println("                      1: ajouter un eleve \n                      2:liste des eleve \n                       3:liste des parent \n                      4:delete eleve \n                       5:mettre ajour l'eleve \n                       6:liste damateur                      7:create class                      8:liste de class                        9:frais d inscription(client)             10:modification le nom de la class etfrais d inscription     11:list dactivite            12:ajouter activite              13:exit       ");
            System.out.println(
                    "/***********************************************menu**********************************************/");
               
            Scanner sc = new Scanner(System.in);
            int choise = sc.nextIn();

            switch (choise) {
                
                case1:
                    Parent p =new Parent();
                    Parent m=new Parent();
                    Eleve e=new Eleve();
                    java.sql.Date date = new java.sql.Date(0,0,0);
                    Adresse ad= new Adresse();
                    System.out.println("ajouter le nom deleve");
                    e.setNom(sc.next()); 
                    System.out.println("ajouter le prenom de eleve");
                    e.setPrenom(sc.next());
                    Boolean b1=true; 
                    while(b1){
                        try{
                            System.out.println("ajouter le Numero du Telephone de l'eleve");
                            e.setNumeroTelephone(Integer.parseInt(sc.nextLine()));
                            break;
                        }catch(Exeption e){
                            if(b1){
                                System.out.println("Numero Telephone doit etre entier");     
                            }
                        }
                    }
                    Boolean b2=true;
                    while(b2){
                        try{
                            System.out.println("l id de le eleve");
                            e.setId(Integer.parseInt(sc.nextLine()));
                            break;
                        }catch(Exeption err){
                            if(b2){
                                System.out.println("id doit etre entier");
  
                            }
                        }
                    }
                    System.out.println("id doit etre entier");
                    Boolean b3=true;

                    while(b3){
                        try{
                            System.out.println("ajouter le numeroRue de eleve int ");                       
                            ad.setNumeroRue(Integer.parseInt(sc.nextLine()));
                           break;
                        }catch(Exception err){
                            if (b3) {
                                System.out.println("numeroRue doit etre entier");

                            }
                        }
                    }


                     /*******************************************************************************/


                     System.out.print("ajouter le rue de eleve string");
                     ad.setRue(sc.next());
                     System.out.println("ajouter la ville de eleve string");
                     ad.setVille(sc.next());

                     Boolean b4=true;
                     while(b4){
                        try{
                            System.out.println("ajouet le codePostal de eleve int");
                            ad.setCodePostal(Integer.parseInt(sc.nextLine()));
                            break; 
                        }catch(Exeption err){
                             if(b4){
                                System.out.println("codePostal doit etre entier");
                             }
                        }
                     }

                    System.out.println("ajouter le gouvrnrzt de eleve string");
                    ad.setGouvernorat(sc.next());
                    e.setAdresse(ad);

                    System.out.println("l annee de naissance de "+e.nom +"int");
                    int y=sc.nextInt(); 
                    System.out.println("le mois de naissance  de"+e.nom+" int");
                    int moth= sc.nextInt();
                    System.out.println("le jour de naissance  de"+e.nom+" int");
                    int days = sc.nextInt();
                    Calender calcr = Calendar.getInstance();
                    calcr.set(Calendar.YEAR, y);
                    calcr.set(Calendar.MONTH,month-1); // months start at 0
                    calcr.set(Calendar.DAY_OF_MONTH,days); 
                   	java.sql.Date datecre = new java.sql.Date(calcr.getTimeInMillis());
            		sdf.format(datecre);



                    e.setDateNaissance(datecre);
                    System.out.println("niveauScolaire de "+e.nom+" string");
                    e.setNiveauScolaire(sc.next());
                    /**********pere********/
                    Systeme.out.println("ajouter le nom de pere de "+e.nom+" string");
                    p.setNom(sc.next());
                    System.out.println("ajouter le prenom de pere de "+e.nom+" string");
                    p.setPrenom(sc.next());
                    

                             /************************ NumeroTelephone try catch****************************/

                             Boolean b5=true;
                             while (b5) {
                                 try {
                                     System.out.println("ajouter NumeroTelephone de  pere de "+e.nom);
                                     p.setNumeroTelephone(Integer.parseInt(sc.nextLine()));
                                     break;
                                  
         
                                 } catch (Exception err) {
                                     if (b5) {
                                         System.out.println("NumeroTelephonel doit etre entier");
         
                                     }
                                 }
                             }

                             p.setAdresse(ad);

                    /************************ cin try catch***************************/


                    
                             



                     

            }
        }
    }
}
