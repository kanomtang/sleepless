package sleepless.farmapp.model.Plant;
import static org.junit.Assert.*;

import org.junit.Test;



public class AvocadoTest {
	@Test
    public void testAddAvocadoName(){
    	TestAvocado t = new TestAvocado();
    }
	@Test
	public void testgetAvocadoName(){
		TestAvocado t = new TestAvocado();
		assertEquals("Avocado",t.getPlantName());
	}
	@Test
	public void testviewAvocado(){
		TestAvocado t = new TestAvocado();
		t.viewPlant();
	}
	@Test
	public void testAvocadoSleep(){
		TestAvocado t = new TestAvocado();
		t.plantSleep(t);
		// expect actual
		assertEquals(7, t.getContPlantWater());
		
		assertEquals(9, t.getContHealth());
	}
	
	@Test
	public void testWaterAvocado(){
		TestAvocado t = new TestAvocado();
		t.waterPlant();
	}
	

	

}
