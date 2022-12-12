public class Commande {
    private String id_Q ;
	private String id_C ;
	private int num ;
	private Date date ;
	
	public Commande (int n , Date d , String id1 , String id2)
    {
        id_Q = id1 ;
		id_C = id2;
		num = n ;
		date = d;
		
	}
	

}