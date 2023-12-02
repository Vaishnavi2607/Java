package assignment1;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
