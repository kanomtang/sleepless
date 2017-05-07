package sleepless.farmapp.model.Plant;
import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Avocado;



public class AvocadoTest {

	@Test
	public void testgetAvocadoName(){
		Avocado t = new Avocado();
		t.setPlantName("Avocado");
		assertEquals("Avocado",t.getPlantName());
	}
	@Test
	public void testviewAvocado(){
		Avocado t = new  Avocado();
		t.viewPlant();
	}
	@Test
	public void testAvocadoSleep(){
		Avocado t = new Avocado();
		t.plantSleep();
		// expect actual
		assertEquals(7, t.getContPlantWater());
		
		assertEquals(10, t.getContHealth());
		
		//this is for testing the growup method
		assertEquals("Seedling", t.getPlantStage());
		System.out.println(t.getPlantStage());
	}
	
	@Test
	public void testAvocadoSleepwithoutwater8Days(){
		Avocado t = new Avocado();
		for(int i = 0;i<8;i++){
			t.plantSleep();
		}
        assertEquals(0, t.getContPlantWater());
		
		assertEquals(9, t.getContHealth());
		
		//this is for testing the growup method
				assertEquals("Mature", t.getPlantStage());
				System.out.println(t.getPlantStage());
		
		
	}
	@Test
	public void testAvocadoSleepwithoutWater13Days(){
		Avocado t = new Avocado();
		for(int i = 0;i<17;i++){
			t.plantSleep();
		}
        assertEquals(0, t.getContPlantWater());
		
		assertEquals(0, t.getContHealth());
		
		assertEquals("null", t.getPlantName());
		//this is for testing the growup method
				assertEquals("dead", t.getPlantStage());
				System.out.println(t.getPlantStage());
		
	}
	@Test
	public void testWaterAvocadoAfterplant2day(){
		Avocado a = new Avocado();
		for(int i = 0;i<2;i++){
			a.plantSleep();
		}
		a.waterPlant();
		assertEquals(7, a.getContPlantWater());
	}
	
	@Test
	public void testsetstageAvocado(){
		Avocado a = new Avocado();
		a.setPlantStage("Seed");
		assertEquals("Seed", a.getPlantStage());
	}
	
	@Test
	public void testgetPlantfruitAvocado(){
		Avocado p = new Avocado();
		p.getPlantFruit();
	}
	
	
	@Test
	public void testsetZenyAvocado(){
		Avocado p = new Avocado();
		p.setZeny(10);
		assertEquals(10, p.getZeny());
	}
	@Test
	public void testsetContAgeAvocado(){
		Avocado p = new Avocado();
		p.setContAge(3);
		assertEquals(3, p.getContAge());
	}
	
	@Test
	public void testsetFullAgeAvocado(){
		Avocado p = new Avocado();
		p.setFullAge(3);
		assertEquals(3, p.getFullAge());
	}
	
	@Test
	public void testsetContplantwaterAvocado(){
		Avocado p = new Avocado();
		p.setContPlantWater(3);
		assertEquals(3, p.getContPlantWater());
	}
	
	@Test
	public void testsetsetFullPlantWaterAvocado(){
		Avocado p = new Avocado();
		p.setFullPlantWater(3);
		assertEquals(3, p.getFullPlantWater());
	}
	
	@Test
	public void testsetContHealthAvocado(){
		Avocado p = new Avocado();
		p.setContHealth(3);
		assertEquals(3, p.getContHealth());
	}
	
	@Test
	public void testsetFullHealthAvocado(){
		Avocado p = new Avocado();
		p.setFullHealth(3);
		assertEquals(3, p.getFullHealth());
	}
}