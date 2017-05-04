package sleepless.farmapp.model.Fruit;

public class MangosteenFruit implements Fruit {
	private String FruitName="Mangosteen Fruit";
	private int FruitAmount =1;
	private String RareLevel = "Common" ;
	private int zeny = 20;
	
	public MangosteenFruit() {
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
	public String getRareLevel() {
		return RareLevel;
	}
	public int getZeny() {
		return zeny;
	}
}
