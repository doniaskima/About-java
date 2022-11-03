public class Rectangle {
	private  Point  P ;
	private  double DH ;
	private  double DV ;
	public static int nb = 0 ;
	
	public Rectangle ( Point a , double l1 , double l2 )
	{
		this.P = a ;
		this.DH = l1 ;
		this.DV = l2 ;
		nb++;
	}
	public Rectangle (Point a , Point b)
	{
		this.P = a;
	    this.DH=Math.abs(a.getx()-b.getx());
	    this.DV=Math.abs(a.gety()-b.gety());
	    nb++;
	}
	
	public static double Perimetre (Rectangle R)
	{
		return ((R.DH)+(R.DV))*2 ;
	}
	public static double Surface (Rectangle R)
	{
		return (R.DH * R.DV) ;
	}
	public void Translate ( double dx , double dy )
	{
		P.setx(P.getx()+dx);
	    P.sety(P.getx()+dy) ;
	}
	public boolean Contient1 (Point a)
	{
		if ((a.getx() >= P.getx()&& a.getx()<= P.getx()+DH) &&(a.gety() >= P.gety()&& a.gety()<= P.gety()+DV))
			return true ;
		else 
			return false ;		
	}
	public boolean Contient2 (Rectangle R)
	{
		return (this.Contient1(R.P));
	}
	public static boolean egal (Rectangle R1 , Rectangle R2)
	{
		if ((R1.DH == R2.DH)&&(R1.DV == R2.DV))
			return true ;
		else
			return false ;
	}
}