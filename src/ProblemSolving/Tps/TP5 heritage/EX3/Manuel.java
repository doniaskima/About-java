public class Manuel extends Livre {
    
    private int Niveau;

    public Manuel(String Acteur, int nbPage, int Niveau,int Num, String T) {
        super(Acteur, nbPage,Num,T);
        this.Niveau = Niveau;
    }

    public int getNiveau() {
        return Niveau;
    }

    public void setNiveau(int niveau) {
        this.Niveau = niveau;
    }

    public String toString() {
        return super.toString()+"Manuel{" + "neveau=" + Niveau + '}';
       }


}