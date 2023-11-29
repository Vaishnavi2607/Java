package code;

public class encapsulation2 {
	
	private int movieId,noOfSeats;
	private double costPerTicket;
	
	public int getMovieId() {
		return movieId;

	}
	
	public int getnoOfSeats() {
		return noOfSeats;
	}
	
	public double getCostPerTicket() {
		return costPerTicket;
	}
	
	public void setMovieId(int movieId) {
		this.movieId=movieId;
		
	}
	
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats=noOfSeats;
	}
	
	public void setCostPerTicket(int costPerTicket) {
		this.costPerTicket=costPerTicket;
	}
	
	public encapsulation2(int movieId, int noOfSeats) {
		this.movieId=movieId;
		this.noOfSeats=noOfSeats;
		if (movieId==111) {
			this.costPerTicket=7;
		}
		else if (movieId==112) {
			this.costPerTicket=8;
		}
		else if(movieId==113) {
			this.costPerTicket=8.5;
		}
		
	}
	
	
	public double calculateTotalAmount() {
		double totalAmount=(double)((costPerTicket*noOfSeats)*(1+0.02));
		return Math.round(totalAmount);
		
		
		
	}

}
