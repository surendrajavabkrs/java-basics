package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void test() {
		MyJunitClass junit  = new MyJunitClass();
		String result = junit.ConCat("Hello", "World");
		assertEquals("HelloWorld",result);
	}

}
