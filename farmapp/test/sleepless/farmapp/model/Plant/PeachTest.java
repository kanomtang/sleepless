package sleepless.farmapp.model.Plant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PeachTest {

	@Test
    public void testAddPeachName(){
    	TestPeach t = new TestPeach();
    }
	@Test
	public void testgetPeachName(){
		TestPeach t = new TestPeach();
		assertEquals("Peach",t.getPlantName());
	}
	@Test
	public void testviewPeach(){
		TestPeach t = new TestPeach();
		t.viewPlant();
	}
	@Test
	public void testPeachSleep(){
		TestPeach t = new TestPeach();
		t.plantSleep(t);
	}
	

}
