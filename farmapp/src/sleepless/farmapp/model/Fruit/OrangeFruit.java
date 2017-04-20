package sleepless.farmapp.model.Fruit;

public class OrangeFruit implements Fruit {
	private String FruitName="Orange Fruit";
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
