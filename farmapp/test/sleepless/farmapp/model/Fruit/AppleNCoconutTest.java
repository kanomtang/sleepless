package sleepless.farmapp.model.Fruit;
import static org.junit.Assert.*;

import org.junit.Test;


public class AppleNCoconutTest {

	
	//This class for test Class TestOrangeFruit and Class TestBananaFruit
	

	
	@Test
    public void testGetAppleName(){
    	AppleFruit a = new AppleFruit();
    	
		assertEquals("Apple Fruit", a.getFruitName());
    }
	
	@Test
	public void testGetAppleAmount(){
		AppleFruit a = new AppleFruit();
		 
		assertEquals(1, a.getFruitAmount());
	}
	
	@Test
	public void testGetCoconutName(){
		CoconutFruit c = new CoconutFruit();
		assertEquals("Coconut Fruit", c.getFruitName());
	}
	@Test
	public void testGetCoconutAmount(){
		CoconutFruit c = new CoconutFruit();
		 
		assertEquals(1, c.getFruitAmount());
	}
	
}
