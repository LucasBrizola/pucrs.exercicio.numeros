package pucrs.java.maven.somar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{


	/**
	 * $ somar 10 20 30 $ *
	 */
	@Test
	public void testSomar() {
		assertEquals(30, Soma.somar(10, 20));
	}
}
