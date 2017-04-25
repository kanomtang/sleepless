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

	ArrayList<Fruit> Fruitlist = new ArrayList<Fruit>();


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
    public void Collecting(Plant p){
		
    	//if p.get fruit is equal in fruitlist they will incrasing 
    	for(int i = 0 ;i<p.getPlantFruit().size();i++){
    	for(Fruit a:Fruitlist){
    		if(a.getFruitName().equals(p.getPlantFruit().get(i).getFruitName())){
    			a.setFruitAmount(p.getPlantFruit().get(i).getFruitAmount());
    			
    		}
    	}
		}
	}
}
