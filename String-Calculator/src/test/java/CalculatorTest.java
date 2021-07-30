import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CalculatorTest {
	
	Calculator cal = new Calculator();

	@Test
	void testEmptyString() {
		assertEquals(0, cal.Add(""));
	}
	
	@Test
	void testOneNumber() {
		assertEquals(1, cal.Add("1"));
	}
	
	@Test
	void testTwoNumbers() {
		assertEquals(3, cal.Add("1,2"));
	}
	
	@Test
	void testThreeNumbers() {
		assertEquals(6, cal.Add("1,2,3"));
	}
	
	@Test
	void testFourNumbers() {
		assertEquals(10, cal.Add("1,2,3,4"));
	}
	
	@Test
	void testNewlineDelimiter() {
		assertEquals(6, cal.Add("1\n2,3"));
	}
	@Test
	void testDifferentDelimiters() {
		assertEquals(3, cal.Add("//;\n1;2"));
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
	
	@Test
	void testNumberGreaterThan1000() {
		assertEquals(2, cal.Add("2,1001"));
	}
	
	@Test
	void testDelimiterOfAnyLength() {
		assertEquals(6, cal.Add("//[***]\n1***2***3"));
	}
	
	@Test
	void testAnyNumberOfDelimiters() {
		assertEquals(6, cal.Add("//[*][%]\n1*2%3"));
	}
	
	@Test
	void testAnyNumberOfDelimitersAndOfAnyLength() {
		assertEquals(10, cal.Add("//[*][%][--]\n1*2%3--4"));
	}
}
