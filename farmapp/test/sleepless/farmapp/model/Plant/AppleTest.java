package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Apple;

public class AppleTest {
	
	@Test
	public void testgetAppleName(){
		Apple a = new Apple();
		assertEquals("Apple",a.getPlantName());
	}
	
	@Test
	public void testviewApple(){
		Apple a = new Apple();
		a.viewPlant();
	}
	
	@Test
	public void testAppleSleep(){
		Apple a = new Apple();
		a.plantSleep();
		assertEquals(4, a.getContPlantWater());
		assertEquals(10, a.getContHealth());
		// expect actual
		
	}
	
	@Test
	public void testAppleSleepwithoutwater4Days(){
		Apple a = new Apple();
		for(int i = 0;i<4;i++){
			a.plantSleep();
		}
		assertEquals(1, a.getContPlantWater());
		assertEquals(10, a.getContHealth());
		
		
	}
	
	@Test
	public void testAppleSleepwithoutWater15Days(){
		Apple a = new Apple();
		for(int i = 0;i<15;i++){
			a.plantSleep();
		}
        assertEquals(0, a.getContPlantWater());
		
		assertEquals(0, a.getContHealth());
		
		assertEquals(null, a.getPlantName());
	}
	
	@Test
	public void testWaterApple(){
		Apple a = new Apple();
		a.waterPlant();
	}

}