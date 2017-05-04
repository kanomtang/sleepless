package sleepless.farmapp.model.Fruit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DurianTest {
	//This class for test Class TestPapayaFruit
	@Test
    public void testGetDurianName(){
    	DurianFruit d = new DurianFruit();
    	
		assertEquals("Durian Fruit", d.getFruitName());
    }
	
	@Test
	public void testGetDurianAmount(){
		DurianFruit d = new DurianFruit();
		 
		assertEquals(1, d.getFruitAmount());
	}
}
