public class main {
	public static void main(String[] args)
	{

		try {
			Etudiant Someone = new Etudiant("Someone", "Someone", 20);
			Note N1 = new Note("Tla", 6, 1);
			Note N2 = new Note("BDD", 7, 1);
			Someone.ajouter_note(N2);
			Someone.ajouter_note(N1);
			System.out.println("moyenne = " + Someone.moyenne());

		} catch (NumberOutOfRangeException e) {
			e.printStackTrace();
		}
	}
}