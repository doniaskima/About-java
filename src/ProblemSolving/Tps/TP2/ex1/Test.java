public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Compte c1,c2;
		c1=new Compte("J.DUPONT", 1000,300);
		c2=new Compte("C.DURANT", 10000,500);
		System.out.println("compte de"+c1.getnom()+"solde="+c1.getsold());
		System.out.println("compte de"+c2.getnom()+"solde="+c2.getsold());
		c1.virer(100, c2);
		System.out.println("compte de"+c1.getnom()+"solde="+c1.getsold());
		System.out.println("compte de"+c2.getnom()+"solde="+c2.getsold());
		
	}

}
