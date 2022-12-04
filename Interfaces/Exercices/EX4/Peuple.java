
public class Peuple {
    Homme pays = new Homme[100];
    private int nbHomme=0;
   
    public void naissance(Homme H) {
        pays[nbHomme] = H;
        nbHomme++;

    }
    public void explorer()
	{
		for(int i=0;i<nbHomme;i++)
		{
			pays[i].identiter();
		}
	}
}
