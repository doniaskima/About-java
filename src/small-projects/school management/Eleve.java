import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Eleve {
    protected String niveauScolaire;
    protected int id;
    protected Parent mer;
    protected Parent per;
    List<Eleve> listEleve = new ArrayList<Eleve>();

    public Eleve(String nom, String prenom, int numeroTelephone, Adresse adresse, java.sql.Date dateNaissance,
    String niveauScolaire, int id, Parent mer, Parent per) {
        super(nom, prenom, numeroTelephone, adresse, dateNaissance);
		this.niveauScolaire = niveauScolaire;
		this.id = id;
		this.mer = mer;
		this.per = per;
    }

}
