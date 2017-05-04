package sleepless.farmapp.model.Fruit;

public class PeachFruit implements Fruit {
	private String FruitName="Peach Fruit";
	private int FruitAmount =1;
	private String RareLevel = "Common" ;
	private int zeny = 10;
	
	public int getFruitAmount() {
		return FruitAmount;
	}

	public String getFruitName() {
		return FruitName;
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
