package sleepless.farmapp.model.Plant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrangeTest {

	@Test
    public void testAddOrangeName(){
    	TestOrange t = new TestOrange();
    }
	@Test
	public void testgetOrangeName(){
		TestOrange t = new TestOrange();
		assertEquals("Orange",t.getPlantName());
	}
	@Test
	public void testviewOrange(){
		TestOrange t = new TestOrange();
		t.viewPlant();
	}
	@Test
	public void testOrangeSleep(){
		TestOrange t = new TestOrange();
		t.plantSleep(t);
		// expect actual
				assertEquals(9, t.getContPlantWater());
				
				assertEquals(8, t.getContHealth());
	}
	@Test
	public void testWaterOrange(){
		TestOrange t = new TestOrange();
		t.waterPlant();
	}
	

}