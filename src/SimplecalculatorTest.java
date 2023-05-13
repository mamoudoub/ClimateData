import static org.junit.Assert.*;

import org.junit.Test;

public class SimplecalculatorTest {

	@Test
	public void OnePlusTwoShouldEqualThree() {
		//fail("Not yet implemented");
		Simplecalculator cal = new Simplecalculator();
		assertEquals(3, cal.add(1, 2));
	}
}
