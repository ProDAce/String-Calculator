public class Calculator {

	public int Add(String numbers) {
		
		String delimiters = ",|\n";
		
		//If the string is empty returns zero
		if(numbers.isEmpty()) {
			return 0;
		}
		//If some numbers are present
		else {
			String numberList[] = numbers.split(delimiters);
			
			return sumOfNumbers(numberList);
		}
	}
	
	//Method to calculate sum of the numbers
	private int sumOfNumbers(String[] numberList) {
		int sum = 0;
		
		for(int i = 0; i < numberList.length; i++) {
			sum += Integer.parseInt(numberList[i]);
		}
		
		return sum;
	}

}
