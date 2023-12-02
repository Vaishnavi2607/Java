package code;


public class strinassign2 {
//	public static void main (String[] args) {
//		String  s1 = "yessey";
//		String reverse="";
//		for (int i=s1.length()-1;i>=0;i--) {
//			 reverse = reverse + s1.charAt(i);
//			
//		}
//		if(reverse.equals(s1))
//			System.out.println("The string is a palindrome!");
//		else
//			System.out.println("The string is not a palindrome!");
//	}
	
	public String s1,reverse;.

	
	public boolean checkPalidrome(String s1) {
		for (int i=s1.length()-1;i>=0;i--) {
			reverse = reverse +s1.charAt(i);
		
		}
		
		if (reverse.equals(this.s1)) {
			return true;
		}
		
		else {
			return false;
		}
	}


}
