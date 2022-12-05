public class Peuple 
{
	private Homme pays[] = new Homme[100];
	int nbHomme = 0;
	
	
	public void naissance(Homme h)
	{
		pays[nbHomme] = h;
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