package sleepless.farmapp.model.PlantList;

import java.util.ArrayList;

import sleepless.farmapp.model.Fruit.Fruit;



public interface Plant {


	
	
public  void viewPlant();
	
	public void waterPlant();
	public void plantSleep();
	public String getPlantName();
	public int getContPlantWater() ;
	public int getContHealth() ;
	public String getPlantStage();
	public int getContAge() ;
	public int getFullAge() ;
	public int getFullPlantWater() ;
	public int getFullHealth();
	public Fruit getPlantFruit() ;

	public void setPlantName(String plantName);
	public void setPlantStage(String plantStage) ;
	public void setContAge(int contAge) ;
	public void setFullAge(int fullAge) ;
	public void setContPlantWater(int contPlantWater);
	public void setFullPlantWater(int fullPlantWater) ;
	public void setContHealth(int contHealth) ;
	public void setFullHealth(int fullHealth) ;
	public void setPlantFruit(ArrayList<Fruit> plantFruit) ;
	public void setToEmpty();
	public int getZeny();
	public void setZeny(int zeny) ;
	
	
	public void increasingWater(int i);
	public void decreasingWater(int i);
	public void decreasingHealth(int i );
	public void increasingage(int i);

}
