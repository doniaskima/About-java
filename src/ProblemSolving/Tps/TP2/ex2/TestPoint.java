public class TestPoint {
   public static void main(String[] args) {
      Point p1 = new Point(3.2, 4.3);
      Point p2 = new Point(2.2, 9.3);

      double d = Point.distance(p1, p2); 
      System.out.println("p1 = " + p1); 
		System.out.println("p2 = " + p2);  
		System.out.println("Distance = " + d);
  }   
}
