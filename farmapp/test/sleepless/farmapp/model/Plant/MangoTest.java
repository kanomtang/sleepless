package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Mango;

public class MangoTest {
	
	@Test
	public void testgetMangoName(){
		Mango m = new Mango();
		assertEquals("Mango",m.getPlantName());
	}
	
	@Test
	public void testviewMango(){
		Mango m = new Mango();
		m.viewPlant();
	}
	
	@Test
	public void testMangoSleep(){
		Mango m = new Mango();
		m.plantSleep();
		assertEquals(5, m.getContPlantWater());
		assertEquals(10, m.getContHealth());
		// expect actual
		
	}
	
	@Test
	public void testMangoSleepwithoutwater4Days(){
		Mango m = new Mango();
		for(int i = 0;i<4;i++){
			m.plantSleep();
		}
		assertEquals(2, m.getContPlantWater());
		assertEquals(10, m.getContHealth());
		
		
	}
	
	@Test
	public void testMangoSleepwithoutWater16Days(){
		Mango m = new Mango();
		for(int i = 0;i<16;i++){
			m.plantSleep();
		}
        assertEquals(0, m.getContPlantWater());
		
		assertEquals(0, m.getContHealth());
		
		assertEquals(null, m.getPlantName());
	}
	
	@Test
	public void testWaterMango(){
		Mango m = new Mango();
		m.waterPlant();
	}

}