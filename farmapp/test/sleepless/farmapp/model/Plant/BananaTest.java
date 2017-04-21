package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;


import sleepless.farmapp.model.PlantList.Banana;

public class BananaTest {
	
	@Test
	public void testgetBananaName(){
		Banana b = new Banana();
		assertEquals("Banana",b.getPlantName());
	}
	
	@Test
	public void testviewBanana(){
		Banana b = new Banana();
		b.viewPlant();
	}
	
	@Test
	public void testBananaSleep(){
		Banana b = new Banana();
		b.plantSleep();
		assertEquals(4, b.getContPlantWater());
		assertEquals(10, b.getContHealth());
		// expect actual
		
	}
	
	@Test
	public void testBananaSleepwithoutwater4Days(){
		Banana b = new Banana();
		for(int i = 0;i<4;i++){
			b.plantSleep();
		}
		assertEquals(1, b.getContPlantWater());
		assertEquals(10, b.getContHealth());
		
		
	}
	
	@Test
	public void testBananaSleepwithoutWater15Days(){
		Banana b = new Banana();
		for(int i = 0;i<15;i++){
			b.plantSleep();
		}
        assertEquals(0, b.getContPlantWater());
		
		assertEquals(0, b.getContHealth());
		
		assertEquals(null, b.getPlantName());
	}
	
	@Test
	public void testWaterBanana(){
		Banana b = new Banana();
		b.waterPlant();
	}

}
