package sleepless.farmapp.model.Plant;

import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Mangosteen;

public class MangosteenTest {
	
	@Test
	public void testgetMangosteenName(){
		Mangosteen m = new Mangosteen();
		m.setPlantName("Mangosteen");
		assertEquals("Mangosteen",m.getPlantName());
	}
	
	@Test
	public void testviewMangosteen(){
		Mangosteen m = new Mangosteen();
		m.viewPlant();
	}
	
	@Test
	public void testMangosteenSleep(){
		Mangosteen m = new Mangosteen();
		m.plantSleep();
		assertEquals(7, m.getContPlantWater());
		assertEquals(10, m.getContHealth());
		// expect actual
		
	}
	
	@Test
	public void testMangosteenSleepwithoutwater4Days(){
		Mangosteen m = new Mangosteen();
		for(int i = 0;i<4;i++){
			m.plantSleep();
		}
		assertEquals(4, m.getContPlantWater());
		assertEquals(10, m.getContHealth());
		
		
	}
	
	@Test
	public void testMangosteenSleepwithoutWater14Days(){
		Mangosteen m = new Mangosteen();
		for(int i = 0;i<14;i++){
			m.plantSleep();
		}
        assertEquals(0, m.getContPlantWater());
		
		assertEquals(0, m.getContHealth());
		
		assertEquals("null", m.getPlantName());
	}
	
	@Test
	public void testWaterMangosteenAfterplant2day(){
		Mangosteen a = new Mangosteen();
		for(int i = 0;i<2;i++){
			a.plantSleep();
		}
		a.waterPlant();
		assertEquals(7, a.getContPlantWater());
	}
	
	@Test
	public void testsetstageMangosteen(){
		Mangosteen a = new Mangosteen();
		a.setPlantStage("Seed");
		assertEquals("Seed", a.getPlantStage());
	}
	
	@Test
	public void testgetPlantfruitMangosteen(){
		Mangosteen p = new Mangosteen();
		p.getPlantFruit();
	}
	
	
	@Test
	public void testsetZenyMangosteen(){
		Mangosteen p = new Mangosteen();
		p.setZeny(10);
		assertEquals(10, p.getZeny());
	}
	@Test
	public void testsetContAgeMangosteen(){
		Mangosteen p = new Mangosteen();
		p.setContAge(3);
		assertEquals(3, p.getContAge());
	}
	
	@Test
	public void testsetFullAgeMangosteen(){
		Mangosteen p = new Mangosteen();
		p.setFullAge(3);
		assertEquals(3, p.getFullAge());
	}
	
	@Test
	public void testsetContplantwaterMangosteen(){
		Mangosteen p = new Mangosteen();
		p.setContPlantWater(3);
		assertEquals(3, p.getContPlantWater());
	}
	
	@Test
	public void testsetsetFullPlantWaterMangosteen(){
		Mangosteen p = new Mangosteen();
		p.setFullPlantWater(3);
		assertEquals(3, p.getFullPlantWater());
	}
	
	@Test
	public void testsetContHealthMangosteen(){
		Mangosteen p = new Mangosteen();
		p.setContHealth(3);
		assertEquals(3, p.getContHealth());
	}
	
	@Test
	public void testsetFullHealthMangosteen(){
		Mangosteen p = new Mangosteen();
		p.setFullHealth(3);
		assertEquals(3, p.getFullHealth());
	}
}