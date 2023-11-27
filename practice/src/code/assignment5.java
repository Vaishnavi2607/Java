package code;

public class assignment5 {
	public float length,width;
	
	public assignment5(float length,float width) {
		this.length=length;
		this.width=width;
	}
	
	public double calculateArea() {
		double area;
		area =(double) (length*width);
		System.out.println("Area of Rectangle: "+area);
		return area;

	}
	
	public double calculatePerimeter() {
		double perimeter;
		perimeter = (double)(2*(length*width));
		
		System.out.println("Perimeter of Rectangle:" + perimeter);
		return perimeter;
	}
	

}
