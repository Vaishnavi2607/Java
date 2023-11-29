package tester;
import code.encapsulation2;
public class testerencapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		encapsulation2 e2 = new encapsulation2(115,3);
		
		double amount=e2.calculateTotalAmount();
		
		if (amount==0){
			System.out.println("Sorry! Please enter valid movie Id and number of seats");
		}
		else {
			System.out.println("total amount to be paid is  $"+ amount);
		}
		
		
		
		

	}

}
