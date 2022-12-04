public class Cook {
	private static int order;


	static void setOption(int o){
		order=o;
	}
	
	public static void getOrder() {
	if(order==1){
		System.out.println("Please wait while your Pizza is being prepared.");
	}
	else if(order==2){
		System.out.println("Please wait while your Sandwich is being prepared.");
	}
	else{
		System.out.println("Please wait while your Burger is being prepared.");
	}
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Enter A to accept your food.");
	}
	
	}