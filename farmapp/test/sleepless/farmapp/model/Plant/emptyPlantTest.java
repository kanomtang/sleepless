package sleepless.farmapp.model.Plant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Peach;
import sleepless.farmapp.model.PlantList.emptyPlant;

public class emptyPlantTest {
	@Test
	public void testgetemptyPlantName(){
		emptyPlant p = new emptyPlant();
		p.setPlantName("emptyPlant");
		assertEquals("emptyPlant",p.getPlantName());
	}
	
	@Test
	public void testviewemptyPlant(){
		emptyPlant p = new emptyPlant();
		p.viewPlant();
	}
	
	@Test
	public void testemptyPlantSleep(){
		emptyPlant p = new emptyPlant();
		p.plantSleep();
		assertEquals(0, p.getContPlantWater());
		assertEquals(0, p.getContHealth());
		// expect actual
	}
	
	@Test
	public void testemptyPlantSleepwithoutwater2Days(){
		emptyPlant p = new emptyPlant();
		for(int i = 0;i<2;i++){
			p.plantSleep();
		}
		 assertEquals(0, p.getContPlantWater());
		assertEquals(0, p.getContHealth());
		
	}
	
	@Test
	public void testemptyPlantSleepwithoutWater7Days(){
		emptyPlant p = new emptyPlant();
		for(int i = 0;i<7;i++){
			p.plantSleep();
		}
        assertEquals(0, p.getContPlantWater());
		
		assertEquals(0, p.getContHealth());
		
		assertEquals(null, p.getPlantName());
	}
	
	
	@Test
	public void testsetstageemptyPlant(){
		emptyPlant a = new emptyPlant();
		a.setPlantStage("Seed");
		assertEquals("Seed", a.getPlantStage());
	}
	
	
	
	@Test
	public void testsetZenyemptyPlant(){
		emptyPlant p = new emptyPlant();
		p.setZeny(10);
		assertEquals(10, p.getZeny());
	}
	@Test
	public void testsetContAgeemptyPlant(){
		emptyPlant p = new emptyPlant();
		p.setContAge(3);
		assertEquals(3, p.getContAge());
	}
	
	@Test
	public void testsetFullAgeemptyPlant(){
		emptyPlant p = new emptyPlant();
		p.setFullAge(3);
		assertEquals(3, p.getFullAge());
	}
	
	@Test
	public void testsetContplantwateremptyPlant(){
		emptyPlant p = new emptyPlant();
		p.setContPlantWater(3);
		assertEquals(3, p.getContPlantWater());
	}
	
	@Test
	public void testsetsetFullPlantWateremptyPlant(){
		emptyPlant p = new emptyPlant();
		p.setFullPlantWater(3);
		assertEquals(3, p.getFullPlantWater());
	}
	
	@Test
	public void testsetContHealthemptyPlant(){
		emptyPlant p = new emptyPlant();
		p.setContHealth(3);
		assertEquals(3, p.getContHealth());
	}
	
	@Test
	public void testsetFullHealthemptyPlant(){
		emptyPlant p = new emptyPlant();
		p.setFullHealth(3);
		assertEquals(3, p.getFullHealth());
	}
	@Test
	public void testWateremptyPlantAfterplant2day(){
		emptyPlant p = new emptyPlant();
		p.waterPlant();
}
}
