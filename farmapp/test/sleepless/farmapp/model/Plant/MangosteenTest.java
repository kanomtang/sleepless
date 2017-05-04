package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Mangosteen;

public class MangosteenTest {
	
	@Test
	public void testgetMangosteenName(){
		Mangosteen m = new Mangosteen();
		assertEquals("Mangosteen",m.getPlantName());
	}
	
	@Test
	public void testviewMangosteen(){
		Mangosteen m = new Mangosteen();
		m.viewPlant();
	}
	
	@Test
	public void testMangosteenSleep(){
		Mangosteen m = new Mangosteen();
		m.plantSleep();
		assertEquals(3, m.getContPlantWater());
		assertEquals(10, m.getContHealth());
		// expect actual
		
	}
	
	@Test
	public void testMangosteenSleepwithoutwater4Days(){
		Mangosteen m = new Mangosteen();
		for(int i = 0;i<4;i++){
			m.plantSleep();
		}
		assertEquals(0, m.getContPlantWater());
		assertEquals(10, m.getContHealth());
		
		
	}
	
	@Test
	public void testMangosteenSleepwithoutWater14Days(){
		Mangosteen m = new Mangosteen();
		for(int i = 0;i<14;i++){
			m.plantSleep();
		}
        assertEquals(0, m.getContPlantWater());
		
		assertEquals(0, m.getContHealth());
		
		assertEquals(null, m.getPlantName());
	}
	
	@Test
	public void testWaterMangosteen(){
		Mangosteen m = new Mangosteen();
		m.waterPlant();
	}

}