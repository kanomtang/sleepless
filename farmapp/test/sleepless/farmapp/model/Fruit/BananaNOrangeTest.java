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
		 t.setFruitAmount(1);
		assertEquals(1, t.getFruitAmount());
	}
	@Test 
	public void testGetOrangeLevel(){
		OrangeFruit t = new OrangeFruit();
		assertEquals("Common", t.getRareLevel());
	
		
	}
	@Test 
	public void testAddOrangeAmount(){
		OrangeFruit t = new OrangeFruit();	
		t.addFruitAmount(1);
	}
	
	@Test
	public void testGetOrangeZeny(){
		OrangeFruit t = new OrangeFruit();
		t.setZeny(10);
		assertEquals(10,t.getZeny());
	}
	
	@Test
	public void testGetBanana(){
		BananaFruit t = new BananaFruit();
		assertEquals("Banana Fruit", t.getFruitName());
	}
	@Test
	public void testGetBananaAmount(){
		BananaFruit t = new BananaFruit();
		 t.setFruitAmount(1);
		assertEquals(1, t.getFruitAmount());
	}
	@Test 
	public void testGetBananaLevel(){
		BananaFruit t = new BananaFruit();
		assertEquals("Common", t.getRareLevel());
	
		
	}
	@Test 
	public void testAddBananaAmount(){
		BananaFruit t = new BananaFruit();	
		t.addFruitAmount(1);
	}
	
	@Test
	public void testGetBananaZeny(){
		BananaFruit t = new BananaFruit();
		t.setZeny(10);
		assertEquals(10,t.getZeny());
	}
	
	
}
