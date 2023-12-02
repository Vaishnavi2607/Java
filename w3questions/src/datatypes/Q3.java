package datatypes;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fd,sd,td,fod,rm,sum=0,n;
		System.out.println("enter the no between 0 and 1000");
		n=sc.nextInt();
		fd=n%10;
		rm=n/10;
		sd=rm%10;
		rm=rm/10;
		td=rm%10;
		rm=rm/10;
		fod=rm%10;
		sum=fd+sd+td+fod;
		System.out.println(sum);
		
		
		

	}

}
