package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Apple;
import sleepless.farmapp.model.PlantList.Mango;

public class MangoTest {
	
	@Test
	public void testgetMangoName(){
		Mango m = new Mango();
		m.setPlantName("Mango");
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
	public void testWaterMangoAfterplant2day(){
		Mango m = new Mango();
		for(int i = 0;i<2;i++){
			m.plantSleep();
		}
		m.waterPlant();
		assertEquals(5, m.getContPlantWater());
	}
	
	@Test
	public void testsetstageMango(){
		Mango m = new Mango();
		m.setPlantStage("Seed");
		assertEquals("Seed", m.getPlantStage());
	}
	
	@Test
	public void testgetPlantfruitMango(){
		Mango m = new Mango();
		m.getPlantFruit();
	}
	
	
	@Test
	public void testsetZenyMango(){
		Mango m = new Mango();
		m.setZeny(20);
		assertEquals(20, m.getZeny());
	}
	@Test
	public void testsetContAgeMango(){
		Mango m = new Mango();
		m.setContAge(1);
		assertEquals(1, m.getContAge());
	}
	
	@Test
	public void testsetFullAgeMango(){
		Mango m = new Mango();
		m.setFullAge(8);
		assertEquals(8, m.getFullAge());
	}
	
	@Test
	public void testsetContplantwaterMango(){
		Mango m = new Mango();
		m.setContPlantWater(6);
		assertEquals(6, m.getContPlantWater());
	}
	
	@Test
	public void testsetsetFullPlantWaterMango(){
		Mango m = new Mango();
		m.setFullPlantWater(7);
		assertEquals(7, m.getFullPlantWater());
	}
	
	@Test
	public void testsetContHealthMango(){
		Mango m = new Mango();
		m.setContHealth(10);
		assertEquals(10, m.getContHealth());
	}
	
	@Test
	public void testsetFullHealthMango(){
		Mango m = new Mango();
		m.setFullHealth(10);
		assertEquals(10, m.getFullHealth());
	}
	@Test
	public void testWaterMango(){
		Mango m = new Mango();
		m.waterPlant();
	}
	

}