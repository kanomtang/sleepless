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
		Banana t = new Banana();
		assertEquals(5, t.getContPlantWater());
		assertEquals(10, t.getContHealth());
		t.plantSleep();
		// expect actual
		
	}
	
	@Test
	public void testBananaSleepwithoutwater8Days(){
		Banana t = new Banana();
		 assertEquals(5, t.getContPlantWater());
		assertEquals(10, t.getContHealth());
		for(int i = 0;i<8;i++){
			t.plantSleep();
		}
		
	}
	
	@Test
	public void testBananaSleepwithoutWater13Days(){
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
