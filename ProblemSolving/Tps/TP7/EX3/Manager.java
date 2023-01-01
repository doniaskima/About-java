public class Manager extends Personne{
	private String service;
	public Manager(String x, String y, double z, String t)
	{
		super(x,y,z);
		this.service=t;
	}
	public double calculerSalaire(){
		return (salaire*1.35);
	}
	@Override
	public String toString(){
		return "Le salaire du Manager " + " est : "
	    + this.calculerSalaire() + " son service : " + this.service;
	}
}