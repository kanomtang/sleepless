package sleepless.farmapp.model.Shop;

import java.util.ArrayList;


import sleepless.farmapp.model.PlantList.Apple;
import sleepless.farmapp.model.PlantList.Coconut;
import sleepless.farmapp.model.PlantList.Durian;
import sleepless.farmapp.model.PlantList.Mango;
import sleepless.farmapp.model.PlantList.Mangosteen;
import sleepless.farmapp.model.PlantList.Plant;


public class TBKShop implements IShop {

	private ArrayList<Plant> seedlistStore = new ArrayList<Plant>();

	public TBKShop() {
		seedlistStore.add(new Apple());
		seedlistStore.add(new Coconut());
		seedlistStore.add(new Durian());
		seedlistStore.add(new Mango());
		seedlistStore.add(new Mangosteen());
		
	
	for(Plant a : seedlistStore){
		int price = a.getZeny()*100;
		a.setZeny(price);
	}
	}

	public ArrayList<Plant> getSeedlistStore() {
		return seedlistStore;
	}

	public void setSeedlistStore(ArrayList<Plant> seedlistStore) {
		this.seedlistStore = seedlistStore;
	}
}
