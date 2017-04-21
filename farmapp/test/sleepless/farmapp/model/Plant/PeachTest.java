package sleepless.farmapp.model.Plant;
import static org.junit.Assert.*;

import org.junit.Test;


import sleepless.farmapp.model.PlantList.Peach;
public class PeachTest {

	@Test
	public void testgetPeachName(){
		Peach p = new Peach();
		assertEquals("Peach",p.getPlantName());
	}
	
	@Test
	public void testviewPeach(){
		Peach p = new Peach();
		p.viewPlant();
	}
	
	@Test
	public void testPeachSleep(){
		Peach p = new Peach();
		p.plantSleep();
		assertEquals(4, p.getContPlantWater());
		assertEquals(3, p.getContHealth());
		// expect actual
	}
	
	@Test
	public void testPeachSleepwithoutwater2Days(){
		Peach p = new Peach();
		for(int i = 0;i<2;i++){
			p.plantSleep();
		}
		 assertEquals(3, p.getContPlantWater());
		assertEquals(3, p.getContHealth());
		
	}
	
	@Test
	public void testPeachSleepwithoutWater7Days(){
		Peach p = new Peach();
		for(int i = 0;i<7;i++){
			p.plantSleep();
		}
        assertEquals(0, p.getContPlantWater());
		
		assertEquals(0, p.getContHealth());
		
		assertEquals(null, p.getPlantName());
	}
	
	@Test
	public void testWaterPeach(){
		Peach p = new Peach();
		p.waterPlant();
	}
	
}
