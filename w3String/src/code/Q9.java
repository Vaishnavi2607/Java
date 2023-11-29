package code;

public class Q9 {
	
	public static void main(String[] args) {
		
		String s1 = "example.com";
		String s2 = "Example.com";
		
		System.out.println("String 1: "+ s1);
		System.out.println("String 2: "+ s2);
		
		String cs = "example.com";
		
		System.out.println("Comparing " + s1 + "and" + cs +" : "+s1.contentEquals(cs));
		System.out.println("Comparing " + s2 + "and" + cs +" : "+s2.contentEquals(cs));
		
	}

}
