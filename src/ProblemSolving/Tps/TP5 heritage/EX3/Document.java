public class Document {
    private int NE;
    private String titre;


    public Document(int Numero, String title){
        this.NE=Numero;
        this.titre = title;
    }


    public int getNE(){
        return NE;
    }

    public String getTitre() {
        return titre;
    }

    public void setNE(int NE) {
        this.NE = NE;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Numero d'enregistrement" + NE + " Nom de Titre = " + titre;
    }
}
