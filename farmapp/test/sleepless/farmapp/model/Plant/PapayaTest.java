package sleepless.farmapp.model.Plant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PapayaTest {

	@Test
    public void testAddPapayaName(){
    	TestPapaya t = new TestPapaya();
    }
	@Test
	public void testgetPapayaName(){
		TestPapaya t = new TestPapaya();
		assertEquals("Papaya",t.getPlantName());
	}
	@Test
	public void testviewPapaya(){
		TestPapaya t = new TestPapaya();
		t.viewPlant();
	}
	@Test
	public void testPapayaSleep(){
		TestPapaya t = new TestPapaya();
		t.plantSleep(t);
	}
	

}