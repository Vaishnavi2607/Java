package code;

public class arrayexe1 {
	
	public int[] listOfNumbers;
	
	public void calculateSumOfEvenNumbers(int[] listOfNumbers) {
		int sum=0;
		for (int i=0;i<listOfNumbers.length;i++) {
			if (listOfNumbers[i]%2==0) {
				sum=sum+listOfNumbers[i];
			}
			


//			System.out.println(listOfNumbers[i]);
			
		}
		System.out.println(sum);
	}
}
