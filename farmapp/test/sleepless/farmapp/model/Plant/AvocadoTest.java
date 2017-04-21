package sleepless.farmapp.model.Plant;
import static org.junit.Assert.*;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Avocado;



public class AvocadoTest {

	@Test
	public void testgetAvocadoName(){
		Avocado t = new Avocado();
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
	}
	
	@Test
	public void testAvocadoSleepwithoutwater8Days(){
		Avocado t = new Avocado();
		for(int i = 0;i<8;i++){
			t.plantSleep();
		}
        assertEquals(0, t.getContPlantWater());
		
		assertEquals(9, t.getContHealth());
		
	}
	@Test
	public void testAvocadoSleepwithoutWater13Days(){
		Avocado t = new Avocado();
		for(int i = 0;i<18;i++){
			t.plantSleep();
		}
        assertEquals(0, t.getContPlantWater());
		
		assertEquals(0, t.getContHealth());
		
		assertEquals(null, t.getPlantName());
	}
	@Test
	public void testWaterAvocado(){
		Avocado t = new Avocado();
		t.waterPlant();
	}
	

}