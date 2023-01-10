public class Atlas {

    Ville t[];
    int nbv;

    public Atlas(int n) {
        t = new Ville[n];
        nbv = 0;
    }

    public void inserer(Ville v) {
        t[nbv] = v;
        nbv++;
    }

    public Ville rechercher(String cle) {
        int i;
        i = 0;
        while (i<nbrv && !t[i].getnom().equals(cle)){
			
			i++;
			
		}
		
		if (i>=nbrv)
			return null;
		else
			return t[i];
	}

}


