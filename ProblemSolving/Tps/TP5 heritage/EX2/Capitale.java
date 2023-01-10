public class Capitale extends ville {
    private String pays;

    public Capitale(String s, int x, String p) {
        super(s, x);
        pays = p;
    }

    public String obtenirInformation() {
        return super.obtenirInformation() + "pays" + pays;
    }
}
