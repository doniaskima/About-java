
public class Groupe extends Concrete implements Interface4{
	public Groupe (String s){
		super(s);
	}
	public void f1(){
		System.out.println("f1.interface1");
	}
	public void g1(){
		System.out.println("g1.interface1");
	}
	public void f2(){
		System.out.println("f2.interface2");
	}
	public void g2(){
		System.out.println("g2.interface2");
	}
	
	public void f3(){
		System.out.println("f3.interface3");
	}
	public void g3(){
		System.out.println("g3.interface3");
	}
	public void w4(){
		System.out.println("w4.interface4");
	}
	
}