import java.util.*;

public class Calculator {

	public int Add(String numbers) {
		
		String delimiters = ",|\n";
		
		//If the string is empty returns zero
		if(numbers.isEmpty()) {
			return 0;
		}
		//If some numbers are present
		else {
			if(numbers.charAt(0) == '/') {
				delimiters += "|"+numbers.charAt(2);
				numbers = numbers.substring(4);
			}
				
			String numberList[] = numbers.split(delimiters);
			
			return sumOfNumbers(numberList);
		}
	}
	
	//Method to calculate sum of the numbers
	private int sumOfNumbers(String[] numberList) {
		
		int sum = 0;
		boolean throwException = false;
		List<Integer> exceptionList = new ArrayList<Integer>();
		
		for(int i = 0; i < numberList.length; i++) {
			int currentNumber = Integer.parseInt(numberList[i]);
			
			if(currentNumber < 0 ) {
				throwException = true;
				exceptionList.add(currentNumber);
			}
			if(currentNumber <= 1000)
				sum += currentNumber;
		}
		
		if(throwException) {
			exceptionHandler(exceptionList);
		}
			
		
		return sum;
	}
	
	public void exceptionHandler(List<Integer> exceptionList) {
		String exceptionMessage = "negatives not allowed";
		for(int e: exceptionList)
			exceptionMessage += " " + e;
		
		throw new IllegalArgumentException(exceptionMessage);
		
	}

}
