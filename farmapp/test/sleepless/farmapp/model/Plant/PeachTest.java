package sleepless.farmapp.model.Plant;
import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Peach;
public class PeachTest {

	@Test
	public void testgetPeachName(){
		Peach p = new Peach();
		p.setPlantName("Peach");
		assertEquals("Peach",p.getPlantName());
	}
	
	@Test
	public void testviewPeach(){
		Peach p = new Peach();
		p.viewPlant();
	}
	
	@Test
	public void testPeachSleep(){
		Peach p = new Peach();
		p.plantSleep();
		assertEquals(4, p.getContPlantWater());
		assertEquals(3, p.getContHealth());
		// expect actual
	}
	
	@Test
	public void testPeachSleepwithoutwater2Days(){
		Peach p = new Peach();
		for(int i = 0;i<2;i++){
			p.plantSleep();
		}
		 assertEquals(3, p.getContPlantWater());
		assertEquals(3, p.getContHealth());
		
	}
	
	@Test
	public void testPeachSleepwithoutWater7Days(){
		Peach p = new Peach();
		for(int i = 0;i<7;i++){
			p.plantSleep();
		}
        assertEquals(0, p.getContPlantWater());
		
		assertEquals(0, p.getContHealth());
		
		assertEquals("null", p.getPlantName());
	}
	
	@Test
	public void testWaterPeachAfterplant2day(){
		Peach a = new Peach();
		for(int i = 0;i<2;i++){
			a.plantSleep();
		}
		a.waterPlant();
		assertEquals(4, a.getContPlantWater());
	}
	
	@Test
	public void testsetstagePeach(){
		Peach a = new Peach();
		a.setPlantStage("Seed");
		assertEquals("Seed", a.getPlantStage());
	}
	
	@Test
	public void testgetPlantfruitPeach(){
		Peach p = new Peach();
		p.getPlantFruit();
	}
	
	
	@Test
	public void testsetZenyPeach(){
		Peach p = new Peach();
		p.setZeny(10);
		assertEquals(10, p.getZeny());
	}
	@Test
	public void testsetContAgePeach(){
		Peach p = new Peach();
		p.setContAge(3);
		assertEquals(3, p.getContAge());
	}
	
	@Test
	public void testsetFullAgePeach(){
		Peach p = new Peach();
		p.setFullAge(3);
		assertEquals(3, p.getFullAge());
	}
	
	@Test
	public void testsetContplantwaterPeach(){
		Peach p = new Peach();
		p.setContPlantWater(3);
		assertEquals(3, p.getContPlantWater());
	}
	
	@Test
	public void testsetsetFullPlantWaterPeach(){
		Peach p = new Peach();
		p.setFullPlantWater(3);
		assertEquals(3, p.getFullPlantWater());
	}
	
	@Test
	public void testsetContHealthPeach(){
		Peach p = new Peach();
		p.setContHealth(3);
		assertEquals(3, p.getContHealth());
	}
	
	@Test
	public void testsetFullHealthPeach(){
		Peach p = new Peach();
		p.setFullHealth(3);
		assertEquals(3, p.getFullHealth());
	}
}