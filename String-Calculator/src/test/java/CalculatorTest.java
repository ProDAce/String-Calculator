import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	Calculator cal = new Calculator();

	@Test
	void testEmptyString() {
		assertEquals(cal.Add(""), 0);
	}
}
