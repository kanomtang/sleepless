package sleepless.farmapp.model.Fruit;

public class BananaFruit implements Fruit {
	private String FruitName="Banana Fruit";
	private int FruitAmount =1;
	public BananaFruit() {
		// TODO Auto-generated constructor stub
	}
	public String getFruitName() {
		return FruitName;
	}
	public int getFruitAmount() {
		return FruitAmount;
	}
	public void setFruitAmount(int fruitAmount) {
		FruitAmount = fruitAmount;
	}
	public void addFruitAmount(int amount) {
		// TODO Auto-generated method stub
		this.FruitAmount+=amount;
	}
	
}
