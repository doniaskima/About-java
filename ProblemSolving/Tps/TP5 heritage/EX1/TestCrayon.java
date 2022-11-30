public class TestCrayon {
    public static void main(String[] args) {
        Crayon c1=new Crayon(5,6);
		Crayon c2= new CrayonCouleur(2,8,"jaune");
		CrayonCouleur c3=new CrayonCouleur(4,7,"Rouge");
        c1.description();
        c2.description();
        c3.description();
        c2.changeepaisseureur(-10);
        c3.changeCaracteristique(8,9,"eeeeeeee");
        c3.description();
    }
}
