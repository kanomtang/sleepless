package sleepless.farmapp.model.Plant;
import static org.junit.Assert.*;

import org.junit.Test;


import sleepless.farmapp.model.PlantList.Papaya;
public class PapayaTest {

	@Test
	public void testsetPapayaName(){
		Papaya p = new Papaya();
		p.setPlantName("Papaya");
		assertEquals("Papaya",p.getPlantName());
	}
	
	@Test
	public void testviewPapaya(){
		Papaya p = new Papaya();
		p.viewPlant();
	}
	
	@Test
	public void testPapayaSleep(){
		Papaya p = new Papaya();
		p.plantSleep();
		assertEquals(2, p.getContPlantWater());
		assertEquals(4, p.getContHealth());
		// expect actual
	}
	
	@Test
	public void testPapayaSleepwithoutwater2Days(){
		Papaya p = new Papaya();
		for(int i = 0;i<2;i++){
			p.plantSleep();
		}
		 assertEquals(1, p.getContPlantWater());
		assertEquals(4, p.getContHealth());
		
	}
	
	@Test
	public void testPapayaSleepwithoutWater7Days(){
		Papaya p = new Papaya();
		for(int i = 0;i<6;i++){
			p.plantSleep();
		}
        assertEquals(0, p.getContPlantWater());
		
		assertEquals(0, p.getContHealth());
		
		assertEquals("null", p.getPlantName());
	}
	
	@Test
	public void testWaterPapayaAfterplant2day(){
		Papaya p = new Papaya();
		for(int i = 0;i<2;i++){
			p.plantSleep();
		}
		p.waterPlant();
		assertEquals(2, p.getContPlantWater());
	}
	
	@Test
	public void testsetstagePapaya(){
		Papaya p = new Papaya();
		p.setPlantStage("Seed");
		assertEquals("Seed", p.getPlantStage());
	}
	
	@Test
	public void testgetPlantfruitPapaya(){
		Papaya p = new Papaya();
		p.getPlantFruit();
	}
	
	
	@Test
	public void testsetZenyPapaya(){
		Papaya p = new Papaya();
		p.setZeny(10);
		assertEquals(10, p.getZeny());
	}
	@Test
	public void testsetContAgePapaya(){
		Papaya p = new Papaya();
		p.setContAge(3);
		assertEquals(3, p.getContAge());
	}
	
	@Test
	public void testsetFullAgePapaya(){
		Papaya p = new Papaya();
		p.setFullAge(3);
		assertEquals(3, p.getFullAge());
	}
	
	@Test
	public void testsetContplantwaterPapaya(){
		Papaya p = new Papaya();
		p.setContPlantWater(3);
		assertEquals(3, p.getContPlantWater());
	}
	
	@Test
	public void testsetsetFullPlantWaterPapaya(){
		Papaya p = new Papaya();
		p.setFullPlantWater(3);
		assertEquals(3, p.getFullPlantWater());
	}
	
	@Test
	public void testsetContHealthPapaya(){
		Papaya p = new Papaya();
		p.setContHealth(3);
		assertEquals(3, p.getContHealth());
	}
	
	@Test
	public void testsetFullHealthPapaya(){
		Papaya p = new Papaya();
		p.setFullHealth(3);
		assertEquals(3, p.getFullHealth());
	}
}