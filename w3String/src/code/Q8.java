package code;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =  "This is exercise 1";
		String s2 = "This is Exercise 1";
		
		System.out.println("String 1: " + s1);
	    System.out.println("String 2: " + s2); 
		int result =  s1.compareToIgnoreCase(s2);
		
		if (result < 0)
        {
            System.out.println("\"" + s1 + "\"" +
                " is less than " +
                "\"" + s2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + s1 + "\"" +
                " is equal to " +
                "\"" + s2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + s1 + "\"" +
                " is greater than " +
                "\"" + s2 + "\"");
        }
		
		

	}

}
