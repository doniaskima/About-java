import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classe {
    protected int id;
    protected float fraisInscription;
    protected String name;
    protected ArrayList<Animateur> animateurs;
    protected ArrayList<Eleve> eleve;

    public Classe() {
        super();
    }

    public Classe(int id, float fraisInscription, String nom, ArrayList<Animateur> animateurs, ArrayList<Eleve> eleve) {
        super();
        this.id = id;
        this.fraisInscription = fraisInscription;
        this.nom = nom;
        this.animateurs = animateurs;
        this.eleve = eleve;
    }
    @Override

    public String toString() {
        return "Classe " + nom + "\n [id=" + id + ",fraisInscription" + fraisInscription + "dinars"
                + ",\n animateurs:\n" + animateurs + ", eleve=" + eleve + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getFraisInscription(float fraisInscription) {
        this.frequisInscription = frequisInscription;
    }

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Animateur> getAnimateurs() {
        return animateurs;
    }

    public void setAnimateurs(ArrayList<Animateur> listeAnimateur) {
        this.animateurs = listeAnimateur;
    }

    public ArrayList<Eleve> getEleve() {
        return eleve;
    }

    public void setEleve(ArrayList<Eleve> eleve) {
        this.eleve = eleve;
    }

    public String frais() {
        return "class" + nom + "prix" + fraisInscription;
    }

    public void update(List<Classe> list, Classe e) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == e.id)
                list.set(i, e);
        }
    }

    public ArrayList<Eleve> findlisteEleve(List<Classe> listeClasse,int id) {
        ArrayList<Eleve> nvListElev = new ArrayList<Eleve>();
        for (int i = 0; i <= listeClasse.size(); i++) {
            if (listeClasse.get(i).getId() == id) {
                nvListElev=(listeClasse.get(i).getEleve())
            }
            return nvListElev;
        }
        return null;
    }
    //ArrayList create a dynamic array , The List creates a static array
    //So the List can not be expanded once it is created but using the ArrayList, we can expand the array when needed.
    
}
