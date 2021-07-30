import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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
	@Test
	void testDifferentDelimiters() {
		assertEquals(cal.Add("//;\n1;2"), 3);
	}
	
	@Test
	void testNegativeNumber() {
		Throwable exception = assertThrows(IllegalArgumentException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
                cal.Add("-1");
            }
		});
		assertEquals("negatives not allowed -1", exception.getMessage());
	}
	
	@Test
	void testTwoNegativeNumber() {
		Throwable exception = assertThrows(IllegalArgumentException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
                cal.Add("-1,-2");
            }
		});
		assertEquals("negatives not allowed -1 -2", exception.getMessage());
	}
}
