package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;


import sleepless.farmapp.model.PlantList.Avocado;
import sleepless.farmapp.model.PlantList.Banana;
import sleepless.farmapp.model.PlantList.Papaya;
import sleepless.farmapp.model.PlantList.Orange;

public class OrangeTest {
	
	@Test
	public void testgetOrangeName(){
		Orange o = new Orange();
		assertEquals("Orange",o.getPlantName());
	}
	
	@Test
	public void testviewOrange(){
		Orange o = new Orange();
		o.viewPlant();
	}
	
	@Test
	public void testOrangeSleep(){
		Orange o = new Orange();
		o.plantSleep();
		assertEquals(9, o.getContPlantWater());
		assertEquals(8, o.getContHealth());
		// expect actual
		
	}
	
	@Test
	public void testOrangeSleepwithoutwater4Days(){
		Orange o = new Orange();
		for(int i = 0;i<4;i++){
			o.plantSleep();
		}
		assertEquals(5, o.getContPlantWater());
		assertEquals(8, o.getContHealth());
		
		
	}
	
	@Test
	public void testOrangeSleepwithoutWater15Days(){
		Orange o = new Orange();
		for(int i = 0;i<15;i++){
			o.plantSleep();
		}
        assertEquals(0, o.getContPlantWater());
		
		assertEquals(0, o.getContHealth());
		
		assertEquals(null, o.getPlantName());
	}
	
	@Test
	public void testWaterOrange(){
		Orange o = new Orange();
		o.waterPlant();
	}

}
