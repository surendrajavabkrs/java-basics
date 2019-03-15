package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.add(10, 20);
		assertEquals(30, result);
	}

}
