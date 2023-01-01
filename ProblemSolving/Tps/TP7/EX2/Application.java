public class Application {
	public static void main(String[] args) {
		Personne[] pers = new Personne[6];
		pers[0]= new Employe("Marwa", "majdoub", 1200);
		pers[1]= new Etudiant("Sirine", "Sarray", 02051452);
		pers[2]= new Professeur("jiji", "Skima", 3700, "JAVA/JEE");
		pers[3]= new Employe("islem", "Skima", 1200);
        pers[4] = new Etudiant("Hanin", "dhaou", 02051452);
		pers[5]= new Professeur("Rima", "rim", 4700, "Mathématique");
		System.out.println("Affichage de tous les personnes\n");
		for (Personne p : pers)
		System.out.println("\t" + p);
		System.out.println("Affichage seul des étudiants\n");
		for(int j = 0;j < pers.length; j++){
		if(pers[j] instanceof Etudiant){
		System.out.println("\t"+pers[j]);
		}
	    }
	}
}