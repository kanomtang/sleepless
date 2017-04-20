package sleepless.farmapp.model.Fruit;




public class TestPeachFruit implements TestFruit {

	//This class for test Class TestPeachFruit
	

	
	@Test
    public void testGetPeachName(){
    	TestPeachFruit t = new TestPeachFruit();
    	
		assertEquals("Peach Fruit", t.getFruitName());
    }
	
	@Test
	public void testGetPeachAmount(){
		TestPeachFruit t = new TestPeachFruit();
		 
		assertEquals(1, t.getFruitAmount());
	}
	
	
}
