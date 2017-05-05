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
		 d.setFruitAmount(1);
		assertEquals(1, d.getFruitAmount());
	}
	@Test 
	public void testGetDurianLevel(){
		DurianFruit d = new DurianFruit();
		assertEquals("Rare", d.getRareLevel());
	
		
	}
	@Test 
	public void testAddDurianAmount(){
		DurianFruit d = new DurianFruit();
		d.addFruitAmount(1);
	}
	
	@Test
	public void testGetDurianZeny(){
		DurianFruit d = new DurianFruit();
		d.setZeny(300);
		assertEquals(300,d.getZeny());
	}
}
