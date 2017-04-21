package sleepless.farmapp.model.Plant;

import java.util.ArrayList;

import sleepless.farmapp.model.Fruit.Fruit;
import sleepless.farmapp.model.Fruit.TestFruit;

public interface TestPlant {


	
	
	public  void viewPlant();
	
	public void waterPlant();
	public void plantSleep(TestPlant p);
	public String getPlantName();
	public int getContPlantWater() ;
	public int getContHealth() ;
	public String getPlantStage();
	public int getContAge() ;
	public int getFullAge() ;
	public int getFullPlantWater() ;
	public int getFullHealth();
	public ArrayList<TestFruit> getPlantFruit() ;

	public void setPlantName(String plantName);
	public void setPlantStage(String plantStage) ;
	public void setContAge(int contAge) ;
	public void setFullAge(int fullAge) ;
	public void setContPlantWater(int contPlantWater);
	public void setFullPlantWater(int fullPlantWater) ;
	public void setContHealth(int contHealth) ;
	public void setFullHealth(int fullHealth) ;
	public void setPlantFruit(ArrayList<TestFruit> plantFruit) ;
	
	
	public void increasingWater(int i);
	public void decreasingWater(int i);
	public void decreasingHealth(int i );
	public void increasingage(int i);
}
