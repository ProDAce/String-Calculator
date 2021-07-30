import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	Calculator cal = new Calculator();

	@Test
	void testEmptyString() {
		assertEquals(cal.Add(""), 0);
	}
	
	@Test
	void testOneNumber() {
		assertEquals(cal.Add("1"),1);
	}
	
	@Test
	void testTwoNumbers() {
		assertEquals(cal.Add("1,2"),3);
	}
}