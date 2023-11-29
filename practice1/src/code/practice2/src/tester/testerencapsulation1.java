package tester;
import code.encapsulaton1;
public class testerencapsulation1 {
	public static void main(String[] args) {
	encapsulaton1 e1 = new encapsulaton1();
	e1.setOrderedFood("Alfredo Pasta");
	e1.setOrderId(2008);
	e1.setstatus("ordered");
	
	System.out.println("order id : "+ e1.getOrderId());
	System.out.println("food name: "+ e1.getorderedfood());
	System.out.println("Status : "+e1.getStatus());
	
	
	}
}
