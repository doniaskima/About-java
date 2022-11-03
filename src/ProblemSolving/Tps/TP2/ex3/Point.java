public class Point {
	
	public double x ;
	public double y ;
	 
	public Point  (double x , double y)
	{
		this.x = x;
		this.y = y;
	}	
	public static double distance (Point p1 , Point p2)
	{
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	}
	public double getx()
	{
		return x;
	}
	public double gety()
	{
		return y;
	}
	public void setx (double a)
	{
		x=a ;
	}
	public void sety (double b)
	{
		y=b ;
	}
	public void position ()
	{
		System.out.println("("+x+","+y+")");
	}
	

}