package sleepless.farmapp.model.Fruit;




public class TestAvocadoFruit implements TestFruit {

	/This class for test Class TestAvocadoFruit
	

	
	@Test
    public void testGetAvocadoName(){
    	TestAvocadoFruit t = new TestAvocadoFruit();
    	
		assertEquals("Avocado Fruit", t.getFruitName());
    }
	
	@Test
	public void testGetAvocadoAmount(){
		TestAvocadoFruit t = new TestAvocadoFruit();
		 
		assertEquals(1, t.getFruitAmount());
	}
	
	
}