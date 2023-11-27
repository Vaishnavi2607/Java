package code;

public class p3 {
	public String customerName,address;
	public long contactNo;
	public int customerId;
	
	public void display() {
		System.out.println("*****************Customer Detais******************************");
		System.out.println("Customer name = "+customerName);
		System.out.println("Customer id ="+ customerId);
		System.out.println("address="+address);
		System.out.println("contact number =" + contactNo);
		System.out.println();
	}
	
	public void priceCust() {
		this.customerName="ABC";
		this.customerId=101;
		this.address="gokul nagar";
		this.contactNo=9090909088L;
		System.out.println(customerId + " " +customerName+" "+ address+" "+contactNo+" ");
				
	}
	public void priceCust(String customerName,String address,int customerId, long contactNo) {
		this.customerName=customerName;
		this.customerId=customerId;
		this.contactNo=contactNo;
		this.address=address;
		
	}
	
	public void bill(Double totalprice, Double percentage) {
		System.out.println("amount to be paid");
		double priceAfter=totalprice*(1-(percentage/100));
		System.out.println("hi"+customerName + "your bill is  " + (int)(priceAfter*100)/100.0);
	}
}
