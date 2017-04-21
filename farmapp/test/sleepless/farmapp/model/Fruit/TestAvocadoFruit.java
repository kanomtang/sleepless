package sleepless.farmapp.model.Fruit;




public class TestAvocadoFruit implements TestFruit {

	private String FruitName="Avocado Fruit";
	private int FruitAmount =1;
	public String getFruitName() {
		return FruitName;
	}
	public int getFruitAmount() {
		return FruitAmount;
	}
	public void setFruitAmount(int fruitAmount) {
		FruitAmount = fruitAmount;
	}
	
	
}