package code;

public class Q2 {
	public static void main(String[] args) {
		String str="w3resource.com";
		System.out.println("Original String : "+str);
		
		int i1= str.codePointAt(1);
		int i2 = str.codePointAt(9);
		
		System.out.println("Character (unique code) : "+ i1);
		System.out.println("Character (unique code) : "+ i2);
		
//		int i3= str.charAt(1);
//		int i4 = str.charAt(9);
//		
//		System.out.println("Character (unique code) : "+ i3);
//		System.out.println("Character (unique code) : "+ i4);
		
	}

}
