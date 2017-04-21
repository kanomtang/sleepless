package sleepless.farmapp.model.Fruit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PapayaTest {
	//This class for test Class TestPapayaFruit
	@Test
    public void testGetPapayaName(){
    	PapayaFruit t = new PapayaFruit();
    	
		assertEquals("Papaya Fruit", t.getFruitName());
    }
	
	@Test
	public void testGetPapayaAmount(){
		PapayaFruit t = new PapayaFruit();
		 
		assertEquals(1, t.getFruitAmount());
	}
}
