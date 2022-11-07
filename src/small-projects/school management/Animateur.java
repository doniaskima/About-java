import java.util.Date;

public class Animateur extends Person{
    public Animateur() {
        super();
    }

    public Animateur(String nom, String prenom, int numeroTelephone, Adresse adresse, java.sql.Date dateNaissance) {
    super(nom,prenom,numeroTelephone,dateNaissance, adresse);
   }
}
