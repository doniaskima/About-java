public class Activite {
	protected int code;
    protected Animateur animateur;
    protected String designation;
    protected float fraisInscription;
	public Activite() {
		super();
	}
	public Activite(int code, Animateur animateur, String designation, float fraisInscription) {
		super();
		this.code = code;
		this.animateur = animateur;
		this.designation = designation;
		this.fraisInscription = fraisInscription;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Animateur getAnimateur() {
		return animateur;
	}
	public void setAnimateur(Animateur animateur) {
		this.animateur = animateur;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getFraisInscription() {
		return fraisInscription;
	}
	public void setFraisInscription(float fraisInscription) {
		this.fraisInscription = fraisInscription;
	}
	@Override
	public String toString() {
		return "Activite [code=" + code + ", animateur=" + animateur + ", designation=" + designation
				+ ", fraisInscription=" + fraisInscription + "]";
	}
    


}