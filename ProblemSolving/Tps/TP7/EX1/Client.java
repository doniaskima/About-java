public class Client {
private String nom;
private double credit;
public Client(String nom, double credit) {
	
	this.nom = nom;
	this.credit = credit;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public double getCredit() {
	return credit;
}
public void augCredit(double m) {
	this.credit += m;
}


@Override
public String toString() {
	return "Client [nom=" + nom + ", credit=" + credit + "]";
} 

}