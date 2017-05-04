package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Coconut;

public class CoconutTest {
	
	@Test
	public void testgetCoconutName(){
		Coconut c = new Coconut();
		assertEquals("Coconut",c.getPlantName());
	}
	
	@Test
	public void testviewCoconut(){
		Coconut c = new Coconut();
		c.viewPlant();
	}
	
	@Test
	public void testCoconutSleep(){
		Coconut c = new Coconut();
		c.plantSleep();
		assertEquals(4, c.getContPlantWater());
		assertEquals(10, c.getContHealth());
		// expect actual
		
	}
	
	@Test
	public void testOrangeSleepwithoutwater4Days(){
		Coconut c = new Coconut();
		for(int i = 0;i<4;i++){
			c.plantSleep();
		}
		assertEquals(1, c.getContPlantWater());
		assertEquals(10, c.getContHealth());
		
		
	}
	
	@Test
	public void testCoconutSleepwithoutWater15Days(){
		Coconut c = new Coconut();
		for(int i = 0;i<15;i++){
			c.plantSleep();
		}
        assertEquals(0, c.getContPlantWater());
		
		assertEquals(0, c.getContHealth());
		
		assertEquals(null, c.getPlantName());
	}
	
	@Test
	public void testWaterCoconut(){
		Coconut c = new Coconut();
		c.waterPlant();
	}

}