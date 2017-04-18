package sleepless.farmapp.model.Fruit;
import static org.junit.Assert.*;

import org.junit.Test;


public class BananaNOrangeTest {
//    @Test
//	public void test(){
//		
//	}
	
	

	@Test
    public void testGetOrangeName(){
    	TestOrangeFruit t = new TestOrangeFruit();
    	
		assertEquals("Orange Fruit", t.getFruitName());
    }
	
	@Test
	public void testGetOrangeAmount(){
		TestOrangeFruit t = new TestOrangeFruit();
		 
		assertEquals(1, t.getFruitAmount());
	}
	
	@Test
	public void testGetBanana(){
		TestBananaFruit t = new TestBananaFruit();
		assertEquals("Banana Fruit", t.getFruitName());
	}
	@Test
	public void testGetBananaAmount(){
		TestBananaFruit t = new TestBananaFruit();
		 
		assertEquals(1, t.getFruitAmount());
	}
	
}
