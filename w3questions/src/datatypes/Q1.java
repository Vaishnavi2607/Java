package datatypes;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the degree in fahrenheit");
		 int f =sc.nextInt();
		 int c;
		 c=(f-32)*5/9;
		 System.out.println(c);
		

	}

}
