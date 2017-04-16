package farmapp.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathUtilTest {
//i wanna test the add method
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	public void testAdd(){
		MathUtil mathUtil = new MathUtil();
		assertEquals(9,mathUtil.add(5, 4));
	}
}
