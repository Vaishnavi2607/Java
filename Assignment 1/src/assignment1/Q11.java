package assignment1;
import java.util.Scanner;
public class Q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int num =sc.nextInt();
		for (int i=2;i<num;i++) {
			if (num%i==0) {
				System.out.println("not prime");
				break;
			}
		}
		else {
			System.out.println("prime");}
			
		

	}
}
