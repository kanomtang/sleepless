package farmapp.model.Storage;

import java.util.ArrayList;

import sleepless.farmapp.model.Fruit.TestAvocadoFruit;
import sleepless.farmapp.model.Fruit.TestBananaFruit;
import sleepless.farmapp.model.Fruit.TestFruit;
import sleepless.farmapp.model.Fruit.TestOrangeFruit;
import sleepless.farmapp.model.Fruit.TestPapayaFruit;
import sleepless.farmapp.model.Fruit.TestPeachFruit;
import sleepless.farmapp.model.Plant.TestPlant;





public class TestSleeplesswareHouse {

	ArrayList<TestFruit> Fruitlist = new ArrayList<TestFruit>();

	public TestSleeplesswareHouse(){
		Fruitlist.add(new TestAvocadoFruit());
		Fruitlist.add(new TestBananaFruit());
		Fruitlist.add(new TestOrangeFruit());
		Fruitlist.add(new TestPapayaFruit());
		Fruitlist.add(new TestPeachFruit());
		
		//and assign the amount to be 0
		for(TestFruit a :Fruitlist){
			a.setFruitAmount(0);
		}
	}
    public void Collecting(TestPlant p){
    	//if p.get fruit is equal in fruitlist they will incrasing  
    }
}
