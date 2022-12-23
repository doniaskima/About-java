public class Note {
    private String Unite;
    private int valeur;
    private int coeff;


    public Note(String u, int v, int c) throws NumberOutOfRangeException {
        this.Unite = u;
        if (v > 20 && v < 0) {
            throw new NumberOutOfRangeException("number out of range");
        } else {
            this.valeur = v;
        }
        if (c < 1 && c > 4) {
            throw new NumberOutOfRangeException("number out of range");
        } else {
            this.coeff = c;
        }
    }
    
    
	public int get_val()
	{
		return (this.valeur);
	}
	
	
	
	
	public int get_coef()
	{
		return (this.coeff);
	}
	
}
