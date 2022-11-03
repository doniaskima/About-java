// public class TestRectangle {

//     public static void main(String[] args) {
//         Point p1 = new Point(3.2, 4.3);
//         Point p2 = new Point(2.2, 9.3);
//         Rectangle R = new Rectangle(p1, 3.4, 4.2);
//         double p = Rectangle.perimetre();
//         // double s = Rectangle.surface();
//         System.out.println("Perimetre =" + p);
//         // System.out.println("surface =" + s);        
//     }

// }package Exercice4;

public class TestRectangle {
	public static void main(String[] args) {
	Point p=new Point(2,3);
		Rectangle R1 = new Rectangle (p,3,3);
		double Pr = Rectangle.Perimetre(R1);
		System.out.println("Perimetre = "+Pr);
		double s = Rectangle.Surface(R1);
		System.out.println("Surface = "+s);
		boolean b1 = R1.Contient1(new Point(4,3));
		System.out.println("LA reponse : "+b1);
		Rectangle R2 = new Rectangle (new Point(3,3),5,3);
		boolean b2 = R2.Contient2(R1);
		System.out.println("LA reponse : "+b2);
		boolean b3 = Rectangle.egal(R2,R1); 
		System.out.println("LA reponse : "+b3);

		
	}

}
