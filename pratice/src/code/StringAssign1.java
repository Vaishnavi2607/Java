package code;

public class StringAssign1 {
	
	public String str, alpha, special;
	
	public void moveSpecialCharacter(String str,String alpha,String special) {
		
		for (int i=0  ; i<str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLetterOrDigit(c)|| c ==' ') {
				alpha = alpha +c;
			}
			else {
				special=special+c;
			}
		}
		
		String final_str = alpha.concat(special);
		System.out.println(final_str);
		
		
		
		
	}
	
	
	

}
