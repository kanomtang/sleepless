package sleepless.farmapp.model.Fruit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MangoNMangosteenTest {
	//This class for test Class TestOrangeFruit and Class TestBananaFruit
	

	
		@Test
	    public void testGetMangoName(){
	    	MangoFruit m = new MangoFruit();
	    	
			assertEquals("Mango Fruit", m.getFruitName());
	    }
		
		@Test
		public void testGetMangoAmount(){
			MangoFruit m = new MangoFruit();
			 
			assertEquals(1, m.getFruitAmount());
		}
		
		@Test
		public void testGetMangosteenName(){
			MangosteenFruit m = new MangosteenFruit();
			assertEquals("Mangosteen Fruit", m.getFruitName());
		}
		@Test
		public void testGetMangosteenAmount(){
			MangosteenFruit m = new MangosteenFruit();
			 
			assertEquals(1, m.getFruitAmount());
		}
}
