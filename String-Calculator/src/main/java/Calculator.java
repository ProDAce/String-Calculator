public class Calculator {

	public int Add(String numbers) {
		String numberList[] = numbers.split(",");
		if(numbers.isEmpty())
			return 0;
		else if(numberList.length == 1) {
			return Integer.parseInt(numberList[0]);
		}
		else {
			
			int sum = 0;
			sum = Integer.parseInt(numberList[0]) + Integer.parseInt(numberList[1]);
			return sum;
		}
	}

}
