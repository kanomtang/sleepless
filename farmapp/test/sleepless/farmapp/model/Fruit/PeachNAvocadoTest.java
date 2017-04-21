package sleepless.farmapp.model.Fruit;
import static org.junit.Assert.*;

import org.junit.Test;


public class PeachNAvocadoTest {

	
	//This class for test Class TestOrangeFruit and Class TestBananaFruit
	

	
	@Test
    public void testGetPeachName(){
    	PeachFruit t = new PeachFruit();
    	
		assertEquals("Peach Fruit", t.getFruitName());
    }
	
	@Test
	public void testGetPeachAmount(){
		PeachFruit t = new PeachFruit();
		 
		assertEquals(1, t.getFruitAmount());
	}
	
	@Test
	public void testGetAvocadoName(){
		AvocadoFruit t = new AvocadoFruit();
		assertEquals("Avocado Fruit", t.getFruitName());
	}
	@Test
	public void testGetAvocadoAmount(){
		AvocadoFruit t = new AvocadoFruit();
		 
		assertEquals(1, t.getFruitAmount());
	}
	
}
