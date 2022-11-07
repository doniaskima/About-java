import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Parent extends Person{
    public int cin;
    List<Parent> parent = new ArrayList<Parent>();

    public Parent(String nom, String name, int numeroTelephone, Adresse adresse) {
        super(nom, prenom, name, numeroTelephone, adresse, dateNaissance);
        this.cin = cin;
    }

    public int Parent() {
        super();
    }

	public int getCin() {
		return cin;
	}

    public void setCin(int cin) {
        this.cin = cin;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Parent [cin=" + cin + ", parent=" + parent + "]";
    }
    
    public void create(List<Parent> list, Parent d) {
        list.add(d);
    }

    public int delete(List<Eleve> list , int cin){
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == cin) {
                list.remove(i);
                a = 1;
            } else {
                System.out.println("pas de eleve de cest id = " + cin);
                a = 0;
            }
        }
        return a;
    }


}
