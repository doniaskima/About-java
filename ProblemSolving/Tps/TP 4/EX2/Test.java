public class Test {
	public static void main(String[] args) {
	Personne P1 = new Personne ("Sarraj","Yassmine","Monastir");
	System.out.println(P1);
	Eleve E1 = new Eleve ("Td5","Skima","Donia","Monastir");
	System.out.println(E1.toString());
	Enseignant En1 = new Enseignant ("Radhouan","je ne sais pas","Monastir",5,15.3);
	Enseignant En2 = new Enseignant ("Amel","BD","Jammel",8,10);
	System.out.println(En1.toString());
	System.out.println(En2.toString());
	double S1 , S2 ;
	S1 = En1.calculSalaire();
	S2 = En2.calculSalaire();
	System.out.println("Le salaire de l'en1 : "+S1);
	System.out.println("Le salaire de l'en2 : "+S2);
}
}