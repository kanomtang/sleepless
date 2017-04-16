package sleepless.farmapp.model.PlantList;

import sleepless.farmapp.model.Fruit.*;

import java.awt.List;
import java.util.ArrayList;

import sleepless.farmapp.model.Fruit.*;

public class Avocado implements Plant {
	private String plantName = "Avocado",plantStage="Seed";
	private int contAge = 10, fullAge = 10, contPlantWater = 8, fullPlantWater = 8, contHealth = 10, fullHealth = 10;
	
	private ArrayList<Fruit> plantFruit = new ArrayList<Fruit>();

	public Avocado() {
		plantFruit.add(new AvocadoFruit());
	}

	

	public void viewPlant() {
		// TODO Auto-generated method stub
		System.out.println(plantName);
		System.out.println(
				"   Age:[seed | seedling | mature | dead] (" + plantStage + "  " + contAge + "//" + fullAge + " Days)");
		System.out.println("   Health:(" + contHealth + "//" + fullHealth + ") (more hearths, "
				+ "longer it can live without water)");
		System.out.println("   Water:(" + contAge + "//" + fullAge + ") ");
		System.out.println("");
		for (int i = 0; i < plantFruit.size(); i++) {
			System.out.println("   Fruit:" + plantFruit.get(i));

		}

	}

	public void plantSeed() {
		// TODO Auto-generated method stub

	}

	public void waterPlant() {
		// TODO Auto-generated method stub

	}

	public void plantSleep(Plant p) {
		// TODO Auto-generated method stub
		contAge++;
		contPlantWater--;
		if (contPlantWater == 0) {
			contHealth--;
		}
		if (contHealth == 0) {
			System.out.println("Avocado died now");
			p = new emptyPlant();

		}

	}
	public String getPlantName() {
		return plantName;
	}

}
