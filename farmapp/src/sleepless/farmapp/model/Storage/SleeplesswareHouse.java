package sleepless.farmapp.model.Storage;

import java.util.ArrayList;

import sleepless.farmapp.model.Fruit.AvocadoFruit;
import sleepless.farmapp.model.Fruit.BananaFruit;
import sleepless.farmapp.model.Fruit.Fruit;
import sleepless.farmapp.model.Fruit.OrangeFruit;
import sleepless.farmapp.model.Fruit.PapayaFruit;
import sleepless.farmapp.model.Fruit.PeachFruit;
import sleepless.farmapp.model.PlantList.Plant;






public class SleeplesswareHouse {

	private ArrayList<Fruit> Fruitlist = new ArrayList<Fruit>();

	private int Money=0;
	
	public SleeplesswareHouse(){
		Fruitlist.add(new AvocadoFruit());
		Fruitlist.add(new BananaFruit());
		Fruitlist.add(new OrangeFruit());
		Fruitlist.add(new PapayaFruit());
		Fruitlist.add(new PeachFruit());
		
		//and assign the amount to be 0
		for(Fruit a :Fruitlist){
			a.setFruitAmount(0);
		}
	}
    public ArrayList<Fruit> getFruitlist() {
		return Fruitlist;
	}
	public void Collecting(Plant p){

		for(Fruit a : Fruitlist){
			if(a.getFruitName().equals(p.getPlantFruit())){
				//a.setFruitAmount(p.getFruitAmount);
				  a.addFruitAmount(p.getPlantFruit().getFruitAmount());
			}
		}
	}
	public int getMoney() {
		return Money;
	}

}
