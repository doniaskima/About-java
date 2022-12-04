
public class Test {
    public static void main(String[] args) {
        Personne Donia = new Personne("Donia", "Skima");
        Client Marwa = new Client(5,"Marwa", "Majdoub");
        Peuple isimm = new Peuple();
        isimm.naissance(Donia);
        isimm.naissance(Marwa);
        isimm.explorer();
    }
}
