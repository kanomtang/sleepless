package sleepless.farmapp.model.Plant;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class emptyPlantTest {
	
	@Test
	public void testgetEmptyplantName(){
		TestemptyPlant t = new TestemptyPlant();
		assertEquals("null",t.getPlantName());
	}
	@Test
	public void testviewEmptyplant(){
		TestemptyPlant t = new TestemptyPlant();
		t.viewPlant();
	}
	@Test
	public void testEmptyplantSleep(){
		TestemptyPlant t = new TestemptyPlant();
		t.plantSleep(t);
		// expect actual
		assertEquals(0, t.getContPlantWater());
		
		assertEquals(0, t.getContHealth());
	}
	
	@Test
	public void testWaterEmptyplant(){
		TestemptyPlant t = new TestemptyPlant();
		t.waterPlant();
	}
	

}
