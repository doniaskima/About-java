public class main {
    public static void main(String[] args) {
        Restaurant.displayWelcomeMessage();
		
		Restaurant.customerGuide();
		
		Restaurant.displayMenu();
		
		Restaurant.displayOptions();
		
		Waiter.getOrder();
		
		Cook.getOrder();		
		
		Customer.acceptFood();
		
		Counter.payMessage();
		
		Counter.calculateTotalAmount();
		
		Restaurant.displayBye();

      
    }
}
