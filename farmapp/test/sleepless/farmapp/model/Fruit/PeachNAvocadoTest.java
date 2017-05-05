package sleepless.farmapp.model.Fruit;
import static org.junit.Assert.*;

import org.junit.Test;


public class PeachNAvocadoTest {

	
	//This class for test Class TestOrangeFruit and Class TestBananaFruit
	
	//Peach fruit
	@Test
    public void testGetPeachName(){
    	PeachFruit t = new PeachFruit();
    	
		assertEquals("Peach Fruit", t.getFruitName());
    }
	
	@Test
	public void testGetPeachAmount(){
		PeachFruit t = new PeachFruit();
		 t.setFruitAmount(50);
		assertEquals(50, t.getFruitAmount());
	}
	@Test
	public void testsetZenyPeach(){
		PeachFruit p = new PeachFruit();
		p.setZeny(20);
		assertEquals(20,p.getZeny());
		
	}
	@Test
	public void testAddPeachAmount(){
		PeachFruit p = new PeachFruit();
		p.addFruitAmount(30);
		assertEquals(31, p.getFruitAmount());
	}
	@Test
	public void testgetRarelevelPeach(){
		PeachFruit m = new PeachFruit();
		assertEquals("Common", m.getRareLevel());
		
	}
	
	
	//Avocado fruit
	@Test
	public void testGetAvocadoName(){
		AvocadoFruit t = new AvocadoFruit();
		assertEquals("Avocado Fruit", t.getFruitName());
	}
	@Test
	public void testGetAvocadoAmount(){
		AvocadoFruit t = new AvocadoFruit();
		 t.setFruitAmount(60);
		assertEquals(60, t.getFruitAmount());
	}
	@Test
	public void testsetZenyAvocado(){
		AvocadoFruit p = new AvocadoFruit();
		p.setZeny(20);
		assertEquals(20,p.getZeny());
		
	}
	@Test
	public void testAddAvocadoAmount(){
		AvocadoFruit p = new AvocadoFruit();
		p.addFruitAmount(30);
		assertEquals(31, p.getFruitAmount());
	}
	@Test
	public void testgetRarelevelAvocado(){
		AvocadoFruit m = new AvocadoFruit();
		assertEquals("Common", m.getRareLevel());
		
	}
	
}
