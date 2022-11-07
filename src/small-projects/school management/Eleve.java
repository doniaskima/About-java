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

    @Override

    public String toString() {

        return super.toString() + "\nEleve [niveauScolaire=" + niveauScolaire + ", id=" + id + "\n mer=" + mer
                + "\n per=" + per + "]";
    }
    
    public Eleve() {
        super();
    }

    public String getNiveauScolaire() {
        return niveauScolaire;
    }

    public void setNiveauScolaire(String niveauScolaire) {
		this.niveauScolaire = niveauScolaire;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Parent getMer() {
		return mer;
	}
	public void setMer(Parent mer) {
		this.mer = mer;
	}
	public Parent getPer() {
		return per;
	}

    public void setPer(Parent per) {
        this.per = per;
    }
    public void create(List<Eleve> list , Eleve d) {
		list.add(d);
	}

}
