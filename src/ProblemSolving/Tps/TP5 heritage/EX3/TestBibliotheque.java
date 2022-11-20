public class TestBibliotheque {
    public static void main(String[] args) {
        Bibliotheque bibliotheque=new Bibliotheque(10);
        Document d1=new Document(1,"Python");
        bibliotheque.ajouter(d1);
        Document d2=new Document(3,"java");
        bibliotheque.ajouter(d2);
         bibliotheque.ajouter(new Document(2,"Go"));
         bibliotheque.ajouter(new Document(4,"javascript"));
         bibliotheque.ajouter(new Document(5,"c++"));
         bibliotheque.ajouter(new Document(8,"c#"));
         bibliotheque.afficherDoc();
         System.out.println();
         System.out.println(bibliotheque.document(3));
         System.out.println(bibliotheque.supprimer(d2));
         System.out.println();
         bibliotheque.afficherDoc();
    }
}
