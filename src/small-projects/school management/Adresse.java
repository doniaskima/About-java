import java.util.List;

public class Adresse {
    protected int numberOne;
    protected String rue;
    protected String ville;
    protected int codePostal;
    protected String gouvernorat;
    protected int id;

    public Adresse(int numeroRue, String rue, String ville, int codePostal, String gouvernorat, int id) {
        super();
        this.numeroRue = numeroRue;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.gouvernorat = gouvernorat;
        this.id = id;
    }
    
    public Adresse() {
        super();
    }

    public int getNumeroRue() {
		return numeroRue;
	}

    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }
    
    public String getRue() {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
		this.ville = ville;
	}

    public int getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getGouvernorat() {
		return gouvernorat;
	}

	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
    public void create(List<Adresse> listeAdress, Adresse ad) {
        listeAdress.add(ad);
    }

    @Override
	public String toString() {
		return "Adresse [numeroRue=" + numeroRue + ", rue=" + rue + ", ville=" + ville + ", codePostal=" + codePostal
				+ ", gouvernorat=" + gouvernorat + ", id=" + id + "]\n";
	}
    
    


}
