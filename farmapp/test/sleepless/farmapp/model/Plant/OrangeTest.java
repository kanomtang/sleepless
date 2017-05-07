package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Orange;
import sleepless.farmapp.model.PlantList.Papaya;

public class OrangeTest {
	
	@Test
	public void testgetOrangeName(){
		Orange o = new Orange();
		o.setPlantName("Orange");
		assertEquals("Orange",o.getPlantName());
	}
	
	@Test
	public void testviewOrange(){
		Orange o = new Orange();
		o.viewPlant();
	}
	
	@Test
	public void testOrangeSleep(){
		Orange o = new Orange();
		o.plantSleep();
		assertEquals(9, o.getContPlantWater());
		assertEquals(8, o.getContHealth());
		// expect actual
		
	}
	
	@Test
	public void testOrangeSleepwithoutwater4Days(){
		Orange o = new Orange();
		for(int i = 0;i<4;i++){
			o.plantSleep();
		}
		assertEquals(6, o.getContPlantWater());
		assertEquals(8, o.getContHealth());
		
		
	}
	
	@Test
	public void testOrangeSleepwithoutWater15Days(){
		Orange o = new Orange();
		for(int i = 0;i<17;i++){
			o.plantSleep();
		}
        assertEquals(0, o.getContPlantWater());
		
		assertEquals(0, o.getContHealth());
		
		assertEquals("null", o.getPlantName());
	}
	@Test
	public void testWaterOrangeAfterplant20day(){
		Orange o = new Orange();
		for(int i = 0;i<20;i++){
			o.plantSleep();
		}
		o.waterPlant();
		assertEquals(0, o.getContPlantWater());
	}
	
	@Test
	public void testsetstageOrange(){
		Orange o = new Orange();
		o.setPlantStage("Seed");
		assertEquals("Seed", o.getPlantStage());
	}
	
	@Test
	public void testgetPlantfruitOrange(){
		Orange o = new Orange();
		o.getPlantFruit();
	}
	
	
	@Test
	public void testsetZenyOrange(){
		Orange o = new Orange();
		o.setZeny(10);
		assertEquals(10, o.getZeny());
	}
	@Test
	public void testsetContAgeOrange(){
		Papaya p = new Papaya();
		p.setContAge(2);
		assertEquals(2, p.getContAge());
	}
	
	@Test
	public void testsetFullAgeOrange(){
		Orange o = new Orange();
		o.setFullAge(20);
		assertEquals(20, o.getFullAge());
	}
	
	@Test
	public void testsetContplantwaterOrange(){
		Orange o = new Orange();
		o.setContPlantWater(10);
		assertEquals(10, o.getContPlantWater());
	}
	
	@Test
	public void testsetsetFullPlantWaterOrange(){
		Orange o = new Orange();
		o.setFullPlantWater(10);
		assertEquals(10, o.getFullPlantWater());
	}
	
	@Test
	public void testsetContHealthOrange(){
		Orange o = new Orange();
		o.setContHealth(8);
		assertEquals(8, o.getContHealth());
	}
	
	@Test
	public void testsetFullHealthOrange(){
		Orange o = new Orange();
		o.setFullHealth(8);
		assertEquals(8, o.getFullHealth());
	}
	@Test
	public void testWaterOrange(){
		Orange o = new Orange();
		o.waterPlant();
	}

	

}