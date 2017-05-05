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
	public void testsetPapayaAmount(){
		PapayaFruit t = new PapayaFruit();
		 t.setFruitAmount(15);
		assertEquals(15, t.getFruitAmount());
	}
	@Test
	public void testsetZenyPapaya(){
		PapayaFruit m = new PapayaFruit();
		m.setZeny(50);
		assertEquals(50,m.getZeny());
		
	}
	@Test
	public void testAddPapayaAmount(){
		PapayaFruit m = new PapayaFruit();
		m.addFruitAmount(20);
		assertEquals(21, m.getFruitAmount());
	}
	@Test
	public void testgetRarelevelPapaya(){
		PapayaFruit m = new PapayaFruit();
		assertEquals("Common", m.getRareLevel());
		
	}
}
