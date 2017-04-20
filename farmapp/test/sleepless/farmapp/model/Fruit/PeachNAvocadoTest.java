package sleepless.farmapp.model.Fruit;
import static org.junit.Assert.*;

import org.junit.Test;


public class PeachNAvocadoTest {

	
	//This class for test Class TestOrangeFruit and Class TestBananaFruit
	

	
	@Test
    public void testGetPeachName(){
    	TestPeachFruit t = new TestPeachFruit();
    	
		assertEquals("Peach Fruit", t.getFruitName());
    }
	
	@Test
	public void testGetPeachAmount(){
		TestPeachFruit t = new TestPeachFruit();
		 
		assertEquals(1, t.getFruitAmount());
	}
	
	@Test
	public void testGetAvocadoName(){
		TestAvocadoFruit t = new TestAvocadoFruit();
		assertEquals("Avocado Fruit", t.getFruitName());
	}
	@Test
	public void testGetAvocadoAmount(){
		TestAvocadoFruit t = new TestAvocadoFruit();
		 
		assertEquals(1, t.getFruitAmount());
	}
	
}
