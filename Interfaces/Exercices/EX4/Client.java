public class Client extends Personne implements Homme{
    private int number;

    public Client(int number, String nom, String prenom) {
        super(nom, prenom);
        this.number = number;
    }

    public void identiter()
	{
		super.identiter();
		System.out.println("number = " + number);
	}

}