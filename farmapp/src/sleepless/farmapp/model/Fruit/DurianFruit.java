package sleepless.farmapp.model.Fruit;

public class DurianFruit implements Fruit {
	private String FruitName="Durian Fruit";
	private int FruitAmount =1;
	private String RareLevel = "Rare" ;
	private int zeny = 300;
	
	public DurianFruit() {
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
