package sleepless.farmapp.model.Plant;

import sleepless.farmapp.model.PlantList.Plant;

public class TestemptyPlant implements Plant {

	private String plantName="null";
	private int contAge=0 ,fullAge=0,contPlantWater=0,fullPlantWater=0,contHealth=0,fullHealth=0;
	//private String[] plantFruit = new String [1];
		private String[] plantFruit ={"Empty"};
	
	
	
	public void viewPlant() {
		// TODO Auto-generated method stub
		System.out.println(plantName);
		System.out.println("   Age:[seed | seedling | mature | dead] ("+contAge+"//"+fullAge+" Days)");
		System.out.println("   Health:("+contHealth+"//"+fullHealth+") (more hearths, "
				+ "longer it can live without water)");
		System.out.println("   Water:("+contAge+"//"+fullAge+") ");
		for(int i = 0;i<plantFruit.length;i++){
		System.out.println("   Fruit:"+ plantFruit[i]);	
		}
		
	}



	public void waterPlant() {
		// TODO Auto-generated method stub
		
	}

	
	public void plantSleep(Plant p) {
		// TODO Auto-generated method stub
		contAge++;
		contPlantWater--;
		if(contPlantWater==0){
			contHealth--;
		}
		if(contHealth==0){
			System.out.println("Plant died now");
			p = null;
			
		}
		
	}

	public String getPlantName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getContPlantWater() {
		return contPlantWater;
	}



	public int getContHealth() {
		return contHealth;
	}
	

}
