import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.UnaryOperator;


public class main {

    public static void main(String[] args) {
    	
        boolean isRunning = true;
        ArrayList<Eleve> listEleve = new ArrayList<Eleve>();
        List<Parent> listParent = new ArrayList<Parent>();
        List<Adresse> listeAdress = new ArrayList<Adresse>();
        ArrayList<Animateur> listeAnimateur = new ArrayList<Animateur>();
        List<Classe> listeClasse = new ArrayList<Classe>();
     	ArrayList<Eleve> classlisteeleve= new ArrayList<Eleve>();
     	ArrayList<Activite> Activiteliste= new ArrayList<Activite>();


/******************************add animateur************************************/
        SimpleDateFormat sdf = new SimpleDateFormat(
    		    "MM-dd-yyyy");
        Calendar animateur1date = Calendar.getInstance();
        animateur1date.set(Calendar.YEAR, 1996);
        animateur1date.set(Calendar.MONTH, 12 - 1); // <-- months start
                                            // at 0.
        animateur1date.set(Calendar.DAY_OF_MONTH, 23);

        java.sql.Date dateAnimateur1 = new java.sql.Date(animateur1date.getTimeInMillis());
        sdf.format(dateAnimateur1);
        
        
        Animateur animateur1=new Animateur("imed", "ben ahemd", 584646446, null,   dateAnimateur1);
        Animateur animateur2=new Animateur("skander", "ben moulehem", 58566446, null,   dateAnimateur1);
        Animateur animateur3=new Animateur("ibtissem", "ben yzahia",465646446, null,   dateAnimateur1);
        Animateur animateur4=new Animateur("wafa", "ben kamoun", 64464446, null,   dateAnimateur1);
       listeAnimateur.add(animateur4);
       listeAnimateur.add(animateur3);
       listeAnimateur.add(animateur2);
       listeAnimateur.add(animateur1);
       

        


        while(isRunning) {
            System.out.println("/***********************************************Menu**********************************************/");
            System.out.println("                      1: ajouter un eleve \n                      2:liste des eleve \n                       3:liste des parent \n                      4:delete eleve \n                       5:mettre ajour l'eleve \n                       6:liste damateur                      7:create class                      8:liste de class                        9:frais d inscription(client)             10:modification le nom de la class etfrais d inscription     11:list dactivite            12:ajouter activite              13:exit       ");
            System.out.println("/***********************************************menu**********************************************/");

            
	
          /* SimpleDateFormat sdf = new SimpleDateFormat(
        		    "MM-dd-yyyy");*/
        		/*int year = 2014;
        		int month = 10;
        		int day = 31;
        		Calendar cal = Calendar.getInstance();
        		cal.set(Calendar.YEAR, year);
        		cal.set(Calendar.MONTH, month - 1); // <-- months start
        		                                    // at 0.
        		cal.set(Calendar.DAY_OF_MONTH, day);
        		java.sql.Date datetr = new java.sql.Date(cal.getTimeInMillis());
        		sdf.format(datetr);
        		
                Adresse atr1=new 	Adresse(1, "tawfik", "souuse", 5000, "sousse",1);
                Parent ptr1= new Parent("hmed", "ben ahmed", 666642, atr1,datetr, 25466);
                Parent mtr1= new Parent("salwa", "ben ahmed", 58838585, atr1,datetr , 858585);
                Eleve el=new Eleve("ahmed","ben ahmed",54654354, atr1, datetr,
            			"4eme info",1, ptr1, mtr1);
                listEleve.add(el);
                System.out.println("/******************find parent id*************************");
               System.out.println( el.findParent(listEleve, el));
               Parent cl= new Parent("salma ", "ben ahmed", 58838585, atr1,datetr , 858585);
               Parent cc= el.findParent(listEleve,el);
               
               el.setPer(cl);
               System.out.println("/******************set parent************************");
               
             System.out.println(el.findParent(listEleve, el).getNom());*/
            
            Scanner sc = new Scanner(System.in);
            int choise = sc.nextInt();
            switch (choise) {
            
                case 1:
                    Parent p=new Parent();
                    Parent m=new Parent();
                    Eleve e=new Eleve();
                   java.sql.Date date =new java.sql.Date(0, 0, 0);
                    
                    Adresse ad=new 	Adresse();

                    System.out.println("ajouter le nom de eleve");
                    e.setNom(sc.next());
                    System.out.println("ajouter le prenom de eleve");
                    e.setPrenom(sc.next());
                    Boolean b1=true;
                    while (b1) {
                        try {
                            System.out.println("ajouter le Numero Telephone de eleve");
                            e.setNumeroTelephone(Integer.parseInt(sc.nextLine()));
                            break;
                         

                        } catch (Exception err) {
                        	if (b1) {
                                System.out.println("Numero Telephone doit etre entier");

							}
                        }
                    }
                    
                    
                    Boolean b2=true;
                    while (b2) {
                        try {
                            System.out.println("l id de le eleve");
                            e.setId(Integer.parseInt(sc.nextLine()));
                            break;
                         

                        } catch (Exception err) {
                        	if (b2) {
                                System.out.println("id doit etre entier");

							}
                        }
                    }
                    
                    Boolean b3=true;
                    while (b3) {
                        try {
                        	System.out.println("ajouter le numeroRue de eleve int ");                       
                        	 ad.setNumeroRue(Integer.parseInt(sc.nextLine()));
                            break;
                         

                        } catch (Exception err) {
                            if (b3) {
                                System.out.println("numeroRue doit etre entier");

                            }
                        }
                    }
                    
                    /*******************************************************************************/
                  
                    System.out.println("ajouter le le rue de eleve string");
                    ad.setRue(sc.next());
                    System.out.println("ajouter la ville de eleve string");
                    ad.setVille(sc.next());
                    
                    
                    Boolean b4=true;
                    while (b4) {
                        try {
                        	System.out.println("ajouter la codePostal de eleve int ");
                        	 ad.setCodePostal(Integer.parseInt(sc.nextLine()));
                            break;
                         

                        } catch (Exception err) {
                            if (b4) {
                                System.out.println("codePostal doit etre entier");

                            }
                        }
                    }
                    
                  
                    
                    
                    System.out.println("ajouter la gouvernorat de eleve string");
                    ad.setGouvernorat(sc.next());
                    e.setAdresse(ad);
                    
                    System.out.println("lanne de naissance  de"+e.nom+" int");
                    int y= sc.nextInt();
                    System.out.println("le mois de naissance  de"+e.nom+" int");
            		int moth= sc.nextInt();
                    System.out.println("le jour de naissance  de"+e.nom+" int");

            		int days=sc.nextInt();;
            		Calendar calcr = Calendar.getInstance();
            		calcr.set(Calendar.YEAR, y);
            		calcr.set(Calendar.MONTH, moth - 1); // <-- months start
            		                                    // at 0.
            		calcr.set(Calendar.DAY_OF_MONTH, days);

            		java.sql.Date datecre = new java.sql.Date(calcr.getTimeInMillis());
            		sdf.format(datecre);

                    
                    e.setDateNaissance(datecre);
                    System.out.println("niveauScolaire  de "+e.nom+" string");
                    e.setNiveauScolaire(sc.next());
                    /*******pere*********/
                    System.out.println("ajouter le nom de pere de "+e.nom);
                    p.setNom(sc.next());
                    System.out.println("ajouter le prenom de pere de "+e.nom);
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

                    
                    
                    Boolean b6=true;
                    while (b6) {
                        try {
                            System.out.println("ajouter cin  pere de "+e.nom);
                            p.setCin(Integer.parseInt(sc.nextLine()));
                            break;
                         

                        } catch (Exception err) {
                            if (b6) {
                                System.out.println("cin  pere doit etre entier");

                            }
                        }
                    }
                    
                    
                    
                    /********************date ********************************/
                    
                   
                    
                    
                    
                    
                    Calendar perdate = Calendar.getInstance();

                    
                    
                    Boolean b7=true;
                    while (b7) {
                        try {
                            System.out.println("le jour de naissance  de pere"+p.nom+" int");
                            int jj=Integer.parseInt(sc.nextLine());
                            perdate.set(Calendar.DAY_OF_MONTH, jj);

                            System.out.println("le moi de naissance  de"+p.nom+" int");
                            int mm=Integer.parseInt(sc.nextLine());
                            perdate.set(Calendar.MONTH, mm - 1);
                            
                            System.out.println("l' annee de naissance  de "+p.nom+" int");
                            int anneep=Integer.parseInt(sc.nextLine());
                            perdate.set(Calendar.YEAR, anneep);

                            
                          
                            break;
                         

                        } catch (Exception err) {
                            if (b7) {
                                System.out.println("NumeroTelephonel doit etre entier");

                            }
                        }
                    }
                   
                    // <-- months start
				

                    java.sql.Date dateeper = new java.sql.Date(perdate.getTimeInMillis());
                    sdf.format(dateeper);
                    System.out.println(dateeper);
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                   /* System.out.println("le jour de naissance  de"+p.nom+" int");
                    date.setDate(sc.nextInt());
                    System.out.println("le moi de naissance  de"+p.nom+" int");
                    date.setMonth(sc.nextInt());
                    System.out.println("l' annee de naissance  de "+p.nom+" int");
                    date.setYear(sc.nextInt());*/
                    p.setDateNaissance(dateeper);
                    e.setPer(p);
                    System.out.println(e);
                    /**********************mere****************
                    System.out.println("ajouter le nom de mere de "+e.nom);
                    m.setNom(sc.next());
                    System.out.println("ajouter le prenom de mere de "+e.nom);
                    m.setPrenom(sc.next());
                    System.out.println("ajouter NumeroTelephone de  mere de "+e.nom);
                    m.setNumeroTelephone(sc.nextInt());
                    m.setAdresse(ad);
                    System.out.println("ajouter cin  mere de "+e.nom);
                    m.setCin(sc.nextInt());
                    System.out.println("le jour de naissance  de"+m.nom+" int");
                    date.setDate(sc.nextInt());
                    System.out.println("le moi de naissance  de"+m.nom+" int");
                    date.setMonth(sc.nextInt());
                    System.out.println("l' annee de naissance  de "+m.nom+" int");
                    date.setYear(sc.nextInt());
                    m.setDateNaissance(date);*/
                    e.setPer(p);
                    e.setMer(m);
                    e.create(listEleve, e);
                    p.create(listParent, p);
                    m.create(listParent, m);


                    break;
                case 2:
                    System.out.println("liste des eleve: \n "+ listEleve);
                    break;
                case 3:
                    System.out.println("liste des parents: \n"+listParent );

                    break;
                case 4:
                	System.out.println("Saisie le id de eleve pour supprimer l'eleve: ");
                    
                	Eleve ed =new Eleve();
                	ed.setId(sc.nextInt());
                	if (ed.delete(listEleve,ed.id) ==1) {
                		System.out.println("suppression avec succès");	
					}else {
                		System.out.println("verifier l'id de l'eleve que tu veux la supprimer");	

					}
                

                    break;
                case 5:
                	
                         Date dateup =new Date();
                         Adresse aad=new Adresse();
                		 Eleve  eup =new Eleve();
                		 
                          System.out.println("l id de le eleve que tu veux le changer");
                          int c =sc.nextInt();
                          eup.setId(c);
                          eup.findParente(listEleve,c);
                          String  pnonup = eup.findParente(listEleve, c).getNom();
                          String pprenomup   =eup.findParente(listEleve,c).getPrenom();
                          int ppcin=  eup.findParente(listEleve,c).getCin();
                          int ppnumte = eup.findParente(listEleve, c).getNumeroTelephone();
                          java.sql.Date ppdate=  eup.findParente(listEleve,c).getDateNaissance();
                          Adresse ppadress=eup.findParente(listEleve, c).getAdresse();
                          Parent pup=new Parent(pnonup,pprenomup,ppnumte,ppadress,ppdate,ppcin);

                          eup.setPer(pup);
                         /***************************************************************/
              
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         /***********************************************************/

                         
                       
                		 System.out.println("ajouter le nom de eleve");
                         eup.setNom(sc.next());
                         System.out.println("ajouter le prenom de eleve");
                         eup.setPrenom(sc.next());
                         System.out.println("ajouter le numero de eleve");
                         eup.setNumeroTelephone(sc.nextInt());
                          System.out.println("ajouter le numeroRue de eleve int ");
                          aad.setNumeroRue(sc.nextInt());
                         System.out.println("ajouter le le rue de eleve string");
                         aad.setRue(sc.next());
                         System.out.println("ajouter la ville de eleve string");
                         aad.setVille(sc.next());
                         System.out.println("ajouter la codePostal de eleve int ");
                         aad.setCodePostal(sc.nextInt());
                         System.out.println("ajouter la gouvernorat de eleve string");
                         aad.setGouvernorat(sc.next());
                         eup.setAdresse(aad);
                         System.out.println("le jour de naissance  de"+eup.nom+" int");
                         dateup.setDate(sc.nextInt());
                         System.out.println("le moi de naissance  de"+eup.nom+" int");
                         dateup.setMonth(sc.nextInt());
                         System.out.println("l' annee de naissance  de "+eup.nom+" int");
                         dateup.setYear(sc.nextInt());
                         aad.create(listeAdress,aad);
                          
                         //eup.setDateNaissance(dateup);
                         System.out.println("niveauScolaire  de "+eup.nom+" string");
                         eup.setNiveauScolaire(sc.next());
                    	 eup.update(listEleve, eup);
                    	 System.out.println(listEleve);

                      break;
                case 6:
               	 System.out.println(listeAnimateur);

                    break;
                case 7:
                  	 System.out.println(listeAnimateur);
                  	 Classe c1=new Classe();
                  	 System.out.println("donner  l' id de classe");
                     c1.setId(sc.nextInt());
                     System.out.println("donner  le nom de classe");
                     c1.setNom(sc.next());
                     System.out.println("donner  le frais Inscription de classe");
                     c1.setFraisInscription(sc.nextFloat());
                   
                     c1.setAnimateurs(listeAnimateur);

                     for (int i = 0; i<listEleve.size();i++ ) {
                    	 if(listEleve.get(i).getNiveauScolaire() !=c1.getNom()) {
                    		 classlisteeleve.add(listEleve.get(i)) ;
                                c1.setEleve(classlisteeleve);
                                System.out.println("added");
                    		 
                    	 }
                    	  
					}
                    listeClasse.add(c1);
                 
                       break;
                case 8:
                 	 
                	 System.out.println(listeClasse);
                      break;
                      
                      
              
                      
                case 9:
                	for (int i = 0; i<listeClasse.size();i++ ) {
                	
                		System.out.println(	listeClasse.get(i).frais());
                   	  
					}
                    break;
                case 10:
        	        ArrayList<Eleve> nvListElev = new ArrayList<Eleve>();

    				System.out.println("donner l'id de la class que tu veux lq modifie");
                    
                      Classe classup=new Classe();
                      int cup=sc.nextInt();
                      classup.setId(cup);
      				  System.out.println("donner le  nouveau nom la class que tu veux lq modifie");
      				  classup.setNom(sc.next());
      				  System.out.println("donner le  Frais Inscription la class que tu veux lmodifie");
      				  classup.setFraisInscription(sc.nextFloat());
      				  nvListElev=  classup.findlisteEleve(listeClasse,cup);
      				  classup.setEleve(nvListElev);
      				  classup.setAnimateurs(listeAnimateur);
      				  classup.update(listeClasse, classup);
      				
                      
    				break;
                case 11:
    				System.out.println(Activiteliste);
    				
    				break;
                case 12:
    				Activite act=new Activite();
    				
    			     Boolean b8=true;
                     while (b8) {
                         try {
             				System.out.println(" donne le code de la Activite");
                             int codeA=Integer.parseInt(sc.nextLine());
                             act.setCode(codeA);
                             break;

                         } catch (Exception err) {
                             if (b8) {
                                 System.out.println("le code de la Activite doit etre entier");

                             }
                         }
                     }
                    
                     System.out.println("donner le animateur de 0 a 3");

    			     Boolean b9=true;
                     while (b9 ) {
                         try {
                             System.out.println("donner le animateur");
                             int anumteunum=Integer.parseInt(sc.nextLine());
                             if(anumteunum == 0) {
                            	 act.setAnimateur(animateur1);
                            	 
                            	 break;
                            	 
                             }else if(anumteunum ==1) {
                            	 act.setAnimateur(animateur2);
                            	 break;

                             }else if(anumteunum ==2) {
                            	 act.setAnimateur(animateur3);
                            	 break;

                          	    	 
                             }else if (anumteunum==3) {
                            	 act.setAnimateur(animateur4);
                            	 break;


								
							}
                             

                         } catch (Exception err) {
                             if (b9) {
                                 System.out.println("le code de la Activite doit etre entier");

                             }
                         }
                     }
                  
                     System.out.println("donner le adesignation");
                     act.setDesignation(sc.next());
                    
                     System.out.println("donner le  Frais Inscription de l'activite");
     				  act.setFraisInscription(sc.nextFloat());
   
     				 Activiteliste.add(act);
     			
    				break;
                
                
                case 13:
    				System.out.println("Exited...");
    				isRunning= false;
    				break;
                
                	 
                default:
                    System.out.println("bye bye!!");
                    break;
            }
        }
        System.out.println("----------------------------------------");


    }




}