package sleepless.farmapp.model.Fruit;

public class MangoFruit implements Fruit {
	private String FruitName="Mango Fruit";
	private int FruitAmount =1;
	private String RareLevel = "Common" ;
	private int zeny = 20;
	
	public MangoFruit() {
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
	public void setZeny(int zeny) {
		this.zeny = zeny;
	}
}
