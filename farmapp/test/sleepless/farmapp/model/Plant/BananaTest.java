package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;


import sleepless.farmapp.model.PlantList.Banana;
import sleepless.farmapp.model.PlantList.Mango;

public class BananaTest {
	
	@Test
	public void testgetBananaName(){
		Banana b = new Banana();
		b.setPlantName("Banana");
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
		for(int i = 0;i<14;i++){
			b.plantSleep();
		}
        assertEquals(0, b.getContPlantWater());
		
		assertEquals(0, b.getContHealth());
		
		assertEquals(null, b.getPlantName());
	}
	@Test
	public void testWaterBananaAfterplant2day(){
		Banana b = new Banana();
		for(int i = 0;i<2;i++){
			b.plantSleep();
		}
		b.waterPlant();
		assertEquals(2, b.getContPlantWater());
	}
	
	@Test
	public void testsetstageBanana(){
		Banana b = new Banana();
		b.setPlantStage("Seed");
		assertEquals("Seed", b.getPlantStage());
	}
	
	@Test
	public void testgetPlantfruitBanana(){
		Banana b = new Banana();
		b.getPlantFruit();
	}
	
	
	@Test
	public void testsetZenyBanana(){
		Banana b = new Banana();
		b.setZeny(10);
		assertEquals(10, b.getZeny());
	}
	@Test
	public void testsetContAgeBanana(){
		Banana b = new Banana();
		b.setContAge(1);
		assertEquals(1, b.getContAge());
	}
	
	@Test
	public void testsetFullAgeBanana(){
		Banana b = new Banana();
		b.setFullAge(12);
		assertEquals(12, b.getFullAge());
	}
	
	@Test
	public void testsetContplantwaterBanana(){
		Banana b = new Banana();
		b.setContPlantWater(5);
		assertEquals(5, b.getContPlantWater());
	}
	
	@Test
	public void testsetsetFullPlantWaterBanana(){
		Banana b = new Banana();
		b.setFullPlantWater(5);
		assertEquals(5, b.getFullPlantWater());
	}
	
	@Test
	public void testsetContHealthBanana(){
		Banana b = new Banana();
		b.setContHealth(10);
		assertEquals(10, b.getContHealth());
	}
	
	@Test
	public void testsetFullHealthMango(){
		Banana b = new Banana();
		b.setFullHealth(10);
		assertEquals(10, b.getFullHealth());
	}
	@Test
	public void testWaterBanana(){
		Banana b = new Banana();
		b.waterPlant();
	}

}