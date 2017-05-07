package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Apple;
import sleepless.farmapp.model.PlantList.Papaya;

public class AppleTest {
	
	@Test
	public void testgetAppleName(){
		Apple a = new Apple();
		a.setPlantName("Apple");
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
		
		assertEquals("null", a.getPlantName());
	}
	
	@Test
	public void testWaterPapayaAfterplant2day(){
		Apple a = new Apple();
		for(int i = 0;i<2;i++){
			a.plantSleep();
		}
		a.waterPlant();
		assertEquals(4, a.getContPlantWater());
	}
	
	@Test
	public void testsetstageApple(){
		Apple a = new Apple();
		a.setPlantStage("Seed");
		assertEquals("Seed", a.getPlantStage());
	}
	
	@Test
	public void testgetPlantfruitApple(){
		Apple a = new Apple();
		a.getPlantFruit();
	}
	
	
	@Test
	public void testsetZenyApple(){
		Apple a = new Apple();
		a.setZeny(20);
		assertEquals(20, a.getZeny());
	}
	@Test
	public void testsetContAgeApple(){
		Apple a = new Apple();
		a.setContAge(1);
		assertEquals(1, a.getContAge());
	}
	
	@Test
	public void testsetFullAgeApple(){
		Apple a = new Apple();
		a.setFullAge(12);
		assertEquals(12, a.getFullAge());
	}
	
	@Test
	public void testsetContplantwaterApple(){
		Apple a = new Apple();
		a.setContPlantWater(5);
		assertEquals(5, a.getContPlantWater());
	}
	
	@Test
	public void testsetsetFullPlantWaterApple(){
		Apple a = new Apple();
		a.setFullPlantWater(3);
		assertEquals(3, a.getFullPlantWater());
	}
	
	@Test
	public void testsetContHealthApple(){
		Apple a = new Apple();
		a.setContHealth(10);
		assertEquals(10, a.getContHealth());
	}
	
	@Test
	public void testsetFullHealthApple(){
		Apple a = new Apple();
		a.setFullHealth(10);
		assertEquals(10, a.getFullHealth());
	}
	@Test
	public void testWaterApple(){
		Apple a = new Apple();
		a.waterPlant();
	}

}