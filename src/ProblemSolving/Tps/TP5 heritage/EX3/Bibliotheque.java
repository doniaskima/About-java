

public class Bibliotheque {
    public int Capacité;
    public static int Nb=0;
    public Document[] doc;
    public Bibliotheque(int Capacité) {
        this.Capacité = Capacité;
        doc=new Document[5];
        Nb=0;
    }
    public void afficherDoc(){
        for(Document D:doc)                                                    
            System.out.println(D);
    }
    public Document document(int i){
        return (doc[i]) ;
    }

    public boolean ajouter(Document Doc){
        if(Nb<doc.length)
           this.doc[Nb++]=Doc;
        return true;
    }
    public boolean supprimer(Document Doc){
        for(int i=0;i<doc.length;i++){
            if(doc[i].getNE()==(Doc.getNE()))
              
                    doc[i]=doc[i+1];
        }
        Nb--;
            return true;     }
    public void afficherAuteur(){
        for(int i=0;i<doc.length;i++){
            if(doc[i] instanceof Livre)
                System.out.println((Livre) doc[i]) ;
    }
    }
}
