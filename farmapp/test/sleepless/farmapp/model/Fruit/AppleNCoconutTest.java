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
		 a.setFruitAmount(1);
		assertEquals(1, a.getFruitAmount());
	}
	@Test 
	public void testGetAppleLevel(){
		AppleFruit a = new AppleFruit();
		assertEquals("Common", a.getRareLevel());
	
		
	}
	@Test 
	public void testAddAppleAmount(){
		AppleFruit a = new AppleFruit();	
		a.addFruitAmount(1);
	}
	
	@Test
	public void testGetAppleZeny(){
		AppleFruit a = new AppleFruit();
		a.setZeny(20);
		assertEquals(20,a.getZeny());
	}
	@Test
	public void testGetCoconutName(){
		CoconutFruit c = new CoconutFruit();
		assertEquals("Coconut Fruit", c.getFruitName());
	}
	@Test
	public void testGetCoconutAmount(){
		CoconutFruit c = new CoconutFruit();
		c.setFruitAmount(1);
		assertEquals(1, c.getFruitAmount());
	}
	@Test 
	public void testGetCoconutLevel(){
		CoconutFruit c = new CoconutFruit();
		assertEquals("Common", c.getRareLevel());
	
		
	}
	@Test
	public void testGetCoconutZeny(){
		CoconutFruit c = new CoconutFruit();
		c.setZeny(40);
		assertEquals(40,c.getZeny());
	}
	
	
}
