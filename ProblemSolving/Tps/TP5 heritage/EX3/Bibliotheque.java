

public class Bibliotheque {
    public int capacity;
    public static int nbr=0;
    public Document[] doc;
    public Bibliotheque(int capacity) {
        doc = new Document[5];
        this.capacity = capacity;
        nbr=0;
    }
    public void afficherDoc(){
        for(Document D:doc)                                                    
            System.out.println(D);
    }
    public Document document(int i){
        return (doc[i]) ;
    }

    public boolean ajouter(Document Doc){
        if(nbr<doc.length)
           this.doc[nbr++]=Doc;
        return true;
    }
    public boolean supprimer(Document Doc){
        for(int i=0;i<doc.length;i++){
            if(doc[i].getNE()==(Doc.getNE()))
              
                    doc[i]=doc[i+1];
        }
        nbr--;
            return true;     }
    public void afficherAuteur(){
        for(int i=0;i<doc.length;i++){
            if(doc[i] instanceof Livre)
                System.out.println((Livre) doc[i]) ;
    }
    }
}
