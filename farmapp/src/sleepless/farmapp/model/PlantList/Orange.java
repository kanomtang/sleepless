package sleepless.farmapp.model.PlantList;

import java.util.ArrayList;

import sleepless.farmapp.model.Fruit.Fruit;
import sleepless.farmapp.model.Fruit.OrangeFruit;

public class Orange implements Plant {
	private String plantName = "Orange", plantStage = "Seed";
	private int contAge = 1, fullAge = 20, contPlantWater = 10, fullPlantWater = 10, contHealth = 8, fullHealth = 8;
	// private String[] plantFruit = new String [1];
	// private String[] plantFruit ={"Avocado Fruit"};
	private ArrayList<Fruit> plantFruit = new ArrayList<Fruit>();

	public Orange() {
		plantFruit.add(new OrangeFruit());
	}

	public void viewPlant() {
		// TODO Auto-generated method stub
		System.out.println(plantName);
		System.out.println(
				"   Age:[seed | seedling | mature | dead] (" + plantStage + "  " + contAge + "//" + fullAge + " Days)");
		System.out.println("   Health:(" + contHealth + "//" + fullHealth + ") (more hearths, "
				+ "longer it can live without water)");
		System.out.println("   Water:(" + contPlantWater + "//" + fullPlantWater + ") ");
		for (int i = 0; i < plantFruit.size(); i++) {
			System.out.println("   Fruit:" + plantFruit.get(i));
		}

	}

	public void waterPlant() {
		// TODO Auto-generated method stub

	}

	public void plantSleep() {
		// TODO Auto-generated method stub

		// p.increasingage(1);
		contAge++;
		 growup();
		if (contAge == fullAge) {
			System.out.println("Orange died now");
			setToEmpty();
		}
		if (contPlantWater != 0) {
			// if(p.getContPlantWater()!=0){
			contPlantWater--;
			// p.decreasingWater(1);
		}
		if (contPlantWater == 0) {
			// if(p.getContPlantWater()==0){
			if (contHealth > 0) {
				// if(p.getContHealth()>0){
				contHealth--;
				// p.decreasingHealth(1);
				if (contHealth == 0) {
					System.out.println("Orange died now");
					setToEmpty();

				}
			}

		} else if (contHealth == 0) {
			// else if (p.getContHealth()==0){
			System.out.println("Orange died now");
			setToEmpty();
		}

	}

	public String getPlantName() {
		return plantName;
	}

	public int getContPlantWater() {
		return contPlantWater;
	}

	public int getContHealth() {
		return contHealth;
	}

	
	
	public String getPlantStage() {
		return plantStage;
	}

	public int getContAge() {
		return contAge;
	}

	public int getFullAge() {
		return fullAge;
	}

	public int getFullPlantWater() {
		return fullPlantWater;
	}

	public int getFullHealth() {
		return fullHealth;
	}

	public ArrayList<Fruit> getPlantFruit() {
		return plantFruit;
	}
	

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public void setPlantStage(String plantStage) {
		this.plantStage = plantStage;
	}

	public void setContAge(int contAge) {
		this.contAge = contAge;
	}

	public void setFullAge(int fullAge) {
		this.fullAge = fullAge;
	}

	public void setContPlantWater(int contPlantWater) {
		this.contPlantWater = contPlantWater;
	}

	public void setFullPlantWater(int fullPlantWater) {
		this.fullPlantWater = fullPlantWater;
	}

	public void setContHealth(int contHealth) {
		this.contHealth = contHealth;
	}

	public void setFullHealth(int fullHealth) {
		this.fullHealth = fullHealth;
	}

	public void setPlantFruit(ArrayList<Fruit> plantFruit) {
		this.plantFruit = plantFruit;
	}

	public void increasingWater(int i) {
		// TODO Auto-generated method stub
		this.contPlantWater+=i;
	}

	public void decreasingWater(int i) {
		// TODO Auto-generated method stub
		this.contPlantWater-=i;
	}

	public void decreasingHealth(int i) {
		this.contHealth -=i;
		
	}

	public void increasingage(int agepara) {
		// TODO Auto-generated method stub
		this.contAge+=agepara;
		
	}
	private  void setToEmpty(){
	this.contAge=0;
	this.contHealth=0;
	this.contPlantWater=0;
	this.fullAge=0;
	this.fullHealth=0;
	this.fullPlantWater=0;
	this.plantName=null;
	this.plantStage=null;
	}
	private void growup() {
		// int RemainAge = fullAge-2 ;
		int SeedlingDay = (fullAge - 2) / 2;
		// int matureDay = RemainAge-SeedlingDay;
		if (contAge == 2) {
			this.plantStage = "Seedling";
		} else if (contAge > 1 && contAge > SeedlingDay && contAge < fullAge) {
			this.plantStage = "Mature";
		} else if (contAge == fullAge||contAge>fullAge) {
			this.plantStage = "dead";
		}
	}
	
}
