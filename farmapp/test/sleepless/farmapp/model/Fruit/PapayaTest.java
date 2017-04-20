package sleepless.farmapp.model.Fruit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PapayaTest {
	//This class for test Class TestPapayaFruit
	@Test
    public void testGetPapayaName(){
    	TestPapayaFruit t = new TestPapayaFruit();
    	
		assertEquals("Papaya Fruit", t.getFruitName());
    }
	
	@Test
	public void testGetPapayaAmount(){
		TestPapayaFruit t = new TestPapayaFruit();
		 
		assertEquals(1, t.getFruitAmount());
	}
}
