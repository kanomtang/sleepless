package sleepless.farmapp.model.Fruit;

public class PapayaFruit implements Fruit {
	private String FruitName="Papaya Fruit";
	private int FruitAmount =1;
	public String getFruitName() {
		return FruitName;
	}
	public PapayaFruit() {
		// TODO Auto-generated constructor stub
	}
	public int getFruitAmount() {
		return FruitAmount;
	}
	public void setFruitAmount(int fruitAmount) {
		FruitAmount = fruitAmount;
	}

}
