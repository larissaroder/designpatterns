package strategy_enums;

import org.junit.Assert;
import org.junit.Test;

public class TestStrategy {

	@Test
	public void testStrategy() {
		Integer sum = Math.ADD.get(2,2);
		Assert.assertSame(sum, 4);

		Integer sub = Math.SUBTRACT.get(2,2);
		Assert.assertSame(sub, 0);

		Integer mult = Math.ADD.get(2,2);
		Assert.assertSame(mult, 4);
	}

}
