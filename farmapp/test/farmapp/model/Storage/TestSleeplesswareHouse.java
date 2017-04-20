package farmapp.model.Storage;

import java.util.ArrayList;

import sleepless.farmapp.model.Fruit.AvocadoFruit;
import sleepless.farmapp.model.Fruit.BananaFruit;
import sleepless.farmapp.model.Fruit.Fruit;
import sleepless.farmapp.model.Fruit.OrangeFruit;
import sleepless.farmapp.model.Fruit.PapayaFruit;
import sleepless.farmapp.model.Fruit.PeachFruit;
import sleepless.farmapp.model.Plant.Plant;





public class TestSleeplesswareHouse {

	ArrayList<Fruit> Fruitlist = new ArrayList<Fruit>();

	public TestSleeplesswareHouse(){
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
    public void Collecting(Plant p){
    	//if p.get fruit is equal in fruitlist they will incrasing  
    }
}
