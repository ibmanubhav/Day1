import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestMath {

	@Test
	void test() {
		Math math = new Math();
		int result = math.add(1,2,3);
		
		Assert.assertEquals(6, result);
		fail("Not yet implemented");
	}

}
