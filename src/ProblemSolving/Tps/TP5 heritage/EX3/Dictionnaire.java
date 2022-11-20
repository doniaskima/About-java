

public class Dictionnaire  extends Document{
    private String Langue;

    public Dictionnaire(String Langue, int NumEnreg, String titre) {
        super(NumEnreg, titre);
        this.Langue=Langue ;
    }
    
    public int getLangue() {
        return Langue;
    }
    
    public void  setLangue() {
        this.Langue = Langue;
    }


    @Override
    public String toString() {
        return super.toString() + "Langue =" + Langue;
    }
}
