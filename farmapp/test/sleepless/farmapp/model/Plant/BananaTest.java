package sleepless.farmapp.model.Plant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BananaTest {

	@Test
    public void testAddBananaName(){
    	TestBanana t = new TestBanana();
    }
	@Test
	public void testgetBananaName(){
		TestBanana t = new TestBanana();
		assertEquals("Avocado",t.getPlantName());
	}
	@Test
	public void testviewBanana(){
		TestBanana t = new TestBanana();
		t.viewPlant();
	}
	@Test
	public void testBananaSleep(){
		TestBanana t = new TestBanana();
		t.plantSleep(t);
		assertEquals(4, t.getContPlantWater());
		
		assertEquals(10, t.getContHealth());
	}
	@Test
	public void testWaterAvocado(){
		TestBanana t = new TestBanana();
		t.waterPlant();
	}
	

}
