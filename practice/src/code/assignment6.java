package code;

public class assignment6 {
	public int orderid; 
	public String orderedFoods,status;
	public assignment6() {
		orderid=101;
		orderedFoods="Spinach alfedo Pasta";
		status="ordered";
		
		
	}
	public assignment6(int orderid, String orderedFoods, String status) {
		
		this.orderid = orderid;
		this.orderedFoods = orderedFoods;
		this.status = status;
		
	}
	
	public void status_1() {
		System.out.println("Status of order1: "+ status);
	}
	
	public void status_2() {
		System.out.println("Status of order2: "+ this.status);
		System.out.println("Id of order2:"+this.orderid);
		System.out.println("Items ordered in order"+ this.orderedFoods);
	}
	
	

}
