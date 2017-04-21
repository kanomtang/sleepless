package sleepless.farmapp.model.Fruit;




public class TestPeachFruit implements TestFruit {

	private String FruitName="Peach Fruit";
	private int FruitAmount =1;
	public int getFruitAmount() {
		return FruitAmount;
	}
	public String getFruitName() {
		return FruitName;
	}
	public void setFruitAmount(int fruitAmount) {
		FruitAmount = fruitAmount;
	}
	
}

