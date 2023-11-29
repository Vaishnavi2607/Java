package code;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "This is Exercise1";
		String s2="This is Exercise2";
		System.out.println("string 1: "+s1);
		System.out.println("String 2: "+s2);
		
		int i1 = s1.compareTo(s2);
		
		if (i1 <0) {
			System.out.println("\""+ s1+"\"" + " is less than "+ "\""+s2+"\"");
			
		}
		else if (i1==0) {
			System.out.println("\""+ s1+"\"" + " is equal than "+ "\""+s2+"\"");
		}
		else {
			System.out.println("\""+ s1+"\"" + " is greater than "+ "\""+s2+"\"");
		}
		
		

	}

}
