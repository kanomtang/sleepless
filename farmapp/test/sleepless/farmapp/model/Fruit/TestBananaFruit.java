package sleepless.farmapp.model.Fruit;




public class TestBananaFruit implements TestFruit {
	private String FruitName="Banana Fruit";
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
