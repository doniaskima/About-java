public class Test {
    public static void main(String[] args) {
        Personne Donia = new Personne("Donia", "Skima");
        Client Marwa = new Client(3,"Marwa", "Majdoub");
        Peuple isimm = new Peuple();
        isimm.naissance(Marwa);
        isimm.naissance(Donia);
        isimm.explorer();

        
    }
}