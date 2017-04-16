package sleepless.farmapp.model.PlantList;

import java.util.ArrayList;

public interface Plant {
//	public String plantName="null";
//	public int contAge=0 ,fullAge=0,contPlantWater=0,fullPlantWater=0,contHealth=0,fullHealth=0;
//	//private String[] plantFruit = new String [1];
//		public String[] plantFruit ={"Null"};

	
	public  void viewPlant();
	public void plantSeed();
	public void waterPlant();
	public void plantSleep(Plant p);
	

}
