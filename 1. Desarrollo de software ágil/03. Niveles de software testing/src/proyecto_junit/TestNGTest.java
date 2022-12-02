package proyecto_junit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {
	@Test
	public void TestMethod() {
		System.out.println("testing method");
	}
	
	/*@Test
	public void verificarOpcionVeganaVerdadera() {
		nuevaOrden.setOpcionVeg("Y");
		boolean actualResult = nuevaOrden.getOpcionVeg();
		boolean expectedResult = true;
		Assert.assertEquals(actualResult,  expectedResult);
	}*/
}
