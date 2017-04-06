package plantgame;

import java.util.ArrayList;

public class Plant {
	private String plantName="null",plantFruit="null";
	private int contAge=0 ,fullAge=0,contPlantWater=0,fullPlantWater=0;

	
	public  void viewPlant(){
		System.out.println(plantName);
		System.out.println("   Age:[seed | seedling | mature | dead] ("+contAge+"//"+fullAge+" Days)");
		System.out.println("   Health:("+contPlantWater+"//"+fullPlantWater+") (more hearths, "
				+ "longer it can live without water)");
		System.out.println("   Water:("+contAge+"//"+fullAge+") ");
		System.out.println("   Fruit:"+ plantFruit);
	}
	public void plantSeed(){
		
	}public void waterPlant(){
		
	}public void plantSleep(){
		
	}
	

}
