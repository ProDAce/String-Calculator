public class Calculator {

	public int Add(String numbers) {
		
		if(numbers.isEmpty()) {
			return 0;
		}
		else {
			String numberList[] = numbers.split(",");
			
			int sum = 0;
			
			for(int i = 0; i < numberList.length; i++) {
				sum += Integer.parseInt(numberList[i]);
			}
			return sum;
		}
	}

}
