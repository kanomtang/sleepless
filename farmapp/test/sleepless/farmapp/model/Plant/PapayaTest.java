package sleepless.farmapp.model.Plant;
import static org.junit.Assert.*;

import org.junit.Test;


import sleepless.farmapp.model.PlantList.Papaya;
public class PapayaTest {

	@Test
	public void testgetPapayaName(){
		Papaya p = new Papaya();
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
		
		assertEquals(null, p.getPlantName());
	}
	
	@Test
	public void testWaterPapaya(){
		Papaya p = new Papaya();
		p.waterPlant();
	}
	
}