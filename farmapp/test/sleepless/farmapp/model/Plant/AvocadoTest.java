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
	public void testAvocadoSleep1daywithwater(){
		TestAvocado t = new TestAvocado();
		t.plantSleep(t);
		// expect actual
		assertEquals(7, t.getContPlantWater());
		
		assertEquals(10, t.getContHealth());
	}
	
	@Test
	public void testAvocadoSleep5daywithoutWater(){
		TestAvocado t = new TestAvocado();
		t.plantSleep(t);
		t.plantSleep(t);
		t.plantSleep(t);
		t.plantSleep(t);
		t.plantSleep(t);
		
		assertEquals(3, t.getContPlantWater());
		
		assertEquals(10, t.getContHealth());
		
	}
	
	@Test
	public void sleepwithoutGivingWaterAndDie (){
		TestAvocado t = new TestAvocado();
		
		for(int i =0;i<13;i++){
			//t.testPk(t);
			t.plantSleep(t);
		}
		assertEquals(0, t.getContPlantWater());
		System.out.println(t.getContPlantWater());
		assertEquals(0, t.getContHealth());
		System.out.println(t.getContHealth());
		System.out.println(t.getPlantName());
		
		assertEquals(null,t.getPlantName());
	}
	@Test
	public void testWaterAvocado(){
		TestAvocado t = new TestAvocado();
		t.waterPlant();
	}
	

}
