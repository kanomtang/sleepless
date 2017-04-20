package sleepless.farmapp.model.PlantList;

import sleepless.farmapp.model.Fruit.*;

import java.awt.List;
import java.util.ArrayList;

import sleepless.farmapp.model.Fruit.*;

public class AvocadoTest implements emptyPlantTest {

	@Test
	public void TestAddAvocadoplant(){
		AvocadoTest t = new AvocadoTest();
		assertEquals("Avocado", t.Avocado();
	}

	@Test
	public void TestviewAvocadoplant(){
		AvocadoTest t = new AvocadoTest();
		t.viewPlant();
	}
	
	@Test
	public void TestgetAvocadoName(){
		AvocadoTest t = new AvocadoTest();
		assertEquals("Avocado", t.getPlantName();
	}

	@Test
	public void TestSleepAvocadoplant(){
		AvocadoTest t = new AvocadoTest();
		t.plantSleep(Avocado);
	}

	
}
