package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Durian;

public class DurianTest {
	
	@Test
	public void testgetDurianName(){
		Durian d = new Durian();
		assertEquals("Durian",d.getPlantName());
	}
	
	@Test
	public void testviewDurian(){
		Durian d = new Durian();
		d.viewPlant();
	}
	
	@Test
	public void testDurianSleep(){
		Durian d = new Durian();
		d.plantSleep();
		assertEquals(5, d.getContPlantWater());
		assertEquals(10, d.getContHealth());
		// expect actual
		
	}
	
	@Test
	public void testDurianSleepwithoutwater4Days(){
		Durian d = new Durian();
		for(int i = 0;i<4;i++){
			d.plantSleep();
		}
		assertEquals(2, d.getContPlantWater());
		assertEquals(10, d.getContHealth());
		
		
	}
	
	@Test
	public void testDurianSleepwithoutWater16Days(){
		Durian d = new Durian();
		for(int i = 0;i<16;i++){
			d.plantSleep();
		}
        assertEquals(0, d.getContPlantWater());
		
		assertEquals(0, d.getContHealth());
		
		assertEquals(null, d.getPlantName());
	}
	
	@Test
	public void testWaterDurian(){
		Durian d = new Durian();
		d.waterPlant();
	}

}