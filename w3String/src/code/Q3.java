package code;

public class Q3 {
	public static void main(String[] args) {
		String str="w3resource.com";
		System.out.println("Original String : "+str);
		
		int i1= str.codePointBefore(1);
		int i2 = str.codePointBefore(9);
		
		System.out.println("Character (unique code) : "+ i1);
		System.out.println("Character (unique code) : "+ i2);
	}

}
