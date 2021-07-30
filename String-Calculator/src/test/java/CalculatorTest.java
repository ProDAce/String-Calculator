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
	
	@Test
	void testThreeNumbers() {
		assertEquals(cal.Add("1,2,3"),6);
	}
	
	@Test
	void testFourNumbers() {
		assertEquals(cal.Add("1,2,3,4"),10);
	}
	
	@Test
	void testNewlineDelimiter() {
		assertEquals(cal.Add("1\n2,3"),6);
	}
}
