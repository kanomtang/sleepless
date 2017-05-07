package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Coconut;

public class CoconutTest {
	
	@Test
	public void testgetCoconutName(){
		Coconut c = new Coconut();
		c.setPlantName("Coconut");
		assertEquals("Coconut",c.getPlantName());
	}
	
	@Test
	public void testviewCoconut(){
		Coconut c = new Coconut();
		c.viewPlant();
	}
	
	@Test
	public void testCoconutSleep(){
		Coconut c = new Coconut();
		c.plantSleep();
		assertEquals(4, c.getContPlantWater());
		assertEquals(10, c.getContHealth());
		// expect actual
		
	}
	
	@Test
	public void testOrangeSleepwithoutwater4Days(){
		Coconut c = new Coconut();
		for(int i = 0;i<4;i++){
			c.plantSleep();
		}
		assertEquals(1, c.getContPlantWater());
		assertEquals(10, c.getContHealth());
		
		
	}
	
	@Test
	public void testCoconutSleepwithoutWater15Days(){
		Coconut c = new Coconut();
		for(int i = 0;i<15;i++){
			c.plantSleep();
		}
        assertEquals(0, c.getContPlantWater());
		
		assertEquals(0, c.getContHealth());
		
		assertEquals("null", c.getPlantName());
	}
	
	@Test
	public void testWaterCoconutAfterplant2day(){
		Coconut a = new Coconut();
		for(int i = 0;i<2;i++){
			a.plantSleep();
		}
		a.waterPlant();
		assertEquals(4, a.getContPlantWater());
	}
	
	@Test
	public void testsetstageCoconut(){
		Coconut a = new Coconut();
		a.setPlantStage("Seed");
		assertEquals("Seed", a.getPlantStage());
	}
	
	@Test
	public void testgetPlantfruitCoconut(){
		Coconut p = new Coconut();
		p.getPlantFruit();
	}
	
	
	@Test
	public void testsetZenyCoconut(){
		Coconut p = new Coconut();
		p.setZeny(10);
		assertEquals(10, p.getZeny());
	}
	@Test
	public void testsetContAgeCoconut(){
		Coconut p = new Coconut();
		p.setContAge(3);
		assertEquals(3, p.getContAge());
	}
	
	@Test
	public void testsetFullAgeCoconut(){
		Coconut p = new Coconut();
		p.setFullAge(3);
		assertEquals(3, p.getFullAge());
	}
	
	@Test
	public void testsetContplantwaterCoconut(){
		Coconut p = new Coconut();
		p.setContPlantWater(3);
		assertEquals(3, p.getContPlantWater());
	}
	
	@Test
	public void testsetsetFullPlantWaterCoconut(){
		Coconut p = new Coconut();
		p.setFullPlantWater(3);
		assertEquals(3, p.getFullPlantWater());
	}
	
	@Test
	public void testsetContHealthCoconut(){
		Coconut p = new Coconut();
		p.setContHealth(3);
		assertEquals(3, p.getContHealth());
	}
	
	@Test
	public void testsetFullHealthCoconut(){
		Coconut p = new Coconut();
		p.setFullHealth(3);
		assertEquals(3, p.getFullHealth());
	}
}