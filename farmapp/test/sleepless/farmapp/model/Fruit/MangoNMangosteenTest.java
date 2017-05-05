package sleepless.farmapp.model.Fruit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MangoNMangosteenTest {
	//This class for test Class TestOrangeFruit and Class TestBananaFruit
	

		//Mango fruit
		@Test
	    public void testGetMangoName(){
	    	MangoFruit m = new MangoFruit();
	    	
			assertEquals("Mango Fruit", m.getFruitName());
	    }
		
		@Test
		public void testsetMangoAmount(){
			MangoFruit m = new MangoFruit();
			m.setFruitAmount(2);
			assertEquals(2, m.getFruitAmount());
		}
		@Test
		public void testsetZenyMango(){
			MangoFruit m = new MangoFruit();
			m.setZeny(50);
			assertEquals(50,m.getZeny());
			
		}
		@Test
		public void testAddmangoAmount(){
			MangoFruit m = new MangoFruit();
			m.addFruitAmount(20);
			assertEquals(21, m.getFruitAmount());
		}
		@Test
		public void testgetRarelevelMango(){
			MangoFruit m = new MangoFruit();
			assertEquals("Common", m.getRareLevel());
			
		}
		
		//Mangosteen fruit
		@Test
		public void testGetMangosteenName(){
			MangosteenFruit m = new MangosteenFruit();
			assertEquals("Mangosteen Fruit", m.getFruitName());
		}
		@Test
		public void testsetMangosteenAmount(){
			MangosteenFruit m = new MangosteenFruit();
			 m.setFruitAmount(20);
			assertEquals(20, m.getFruitAmount());
		}
		@Test
		public void testsetZenyMangosteen(){
			MangosteenFruit m = new MangosteenFruit();
			m.setZeny(10);
			assertEquals(10,m.getZeny());
		}
		@Test
		public void testAddmangosteenAmount(){
			MangosteenFruit m = new MangosteenFruit();
			m.addFruitAmount(30);
			assertEquals(31, m.getFruitAmount());
		}
		@Test
		public void testgetRarelevelMangosteen(){
			MangosteenFruit m = new MangosteenFruit();
			assertEquals("Common", m.getRareLevel());
			
		}
		
}
