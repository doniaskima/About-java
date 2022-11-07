import java.util.ArrayList;
import java.util.Arrays;

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
    


}
