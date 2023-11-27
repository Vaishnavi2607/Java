package tester;
import code.p3;
public class testerp3 {
	public static void main(String[] args) {
		p3 c1 = new p3();
		c1.customerId=101;
		c1.customerName="abc";
		c1.contactNo=9898772323L;
		c1.address="Gokul nagar";
		c1.display();
		c1.priceCust();
		
		c1.bill(500.00,10.00);
		
	}
}
