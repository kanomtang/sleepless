package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Banana;
import sleepless.farmapp.model.PlantList.Durian;

public class DurianTest {
	
	@Test
	public void testgetDurianName(){
		Durian d = new Durian();
		d.setPlantName("Durian");
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
		
		assertEquals("null", d.getPlantName());
	}
	@Test
	public void testWaterDurianAfterplant2day(){
		Durian d = new Durian();
		for(int i = 0;i<2;i++){
			d.plantSleep();
		}
		d.waterPlant();
		assertEquals(5, d.getContPlantWater());
	}
	
	@Test
	public void testsetstageDurian(){
		Durian d = new Durian();
		d.setPlantStage("Seed");
		assertEquals("Seed", d.getPlantStage());
	}
	
	@Test
	public void testgetPlantfruitDurian(){
		Durian d = new Durian();
		d.getPlantFruit();
	}
	
	
	@Test
	public void testsetZenyDurian(){
		Durian d = new Durian();
		d.setZeny(300);
		assertEquals(300, d.getZeny());
	}
	@Test
	public void testsetContAgeDurian(){
		Durian d = new Durian();
		d.setContAge(1);
		assertEquals(1, d.getContAge());
	}
	
	@Test
	public void testsetFullAgeDurian(){
		Durian d = new Durian();
		d.setFullAge(10);
		assertEquals(10, d.getFullAge());
	}
	
	@Test
	public void testsetContplantwaterDurian(){
		Durian d = new Durian();
		d.setContPlantWater(6);
		assertEquals(6, d.getContPlantWater());
	}
	
	@Test
	public void testsetsetFullPlantWaterDurian(){
		Durian d = new Durian();
		d.setFullPlantWater(10);
		assertEquals(10, d.getFullPlantWater());
	}
	
	@Test
	public void testsetContHealthDurian(){
		Durian d = new Durian();;
		d.setContHealth(10);
		assertEquals(10, d.getContHealth());
	}
	
	@Test
	public void testsetFullHealthDurian(){
		Durian d = new Durian();
		d.setFullHealth(10);
		assertEquals(10, d.getFullHealth());
	}
	
	@Test
	public void testWaterDurian(){
		Durian d = new Durian();
		d.waterPlant();
	}

}