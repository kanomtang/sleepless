package sleepless.farmapp.model.Fruit;
import static org.junit.Assert.*;

import org.junit.Test;


public class BananaNOrangeTest {

	
	//This class for test Class TestOrangeFruit and Class TestBananaFruit
	

	
	@Test
    public void testGetOrangeName(){
    	OrangeFruit t = new OrangeFruit();
    	
		assertEquals("Orange Fruit", t.getFruitName());
    }
	
	@Test
	public void testGetOrangeAmount(){
		OrangeFruit t = new OrangeFruit();
		 
		assertEquals(1, t.getFruitAmount());
	}
	
	@Test
	public void testGetBanana(){
		BananaFruit t = new BananaFruit();
		assertEquals("Banana Fruit", t.getFruitName());
	}
	@Test
	public void testGetBananaAmount(){
		BananaFruit t = new BananaFruit();
		 
		assertEquals(1, t.getFruitAmount());
	}
	
}
