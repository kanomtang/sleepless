package sleepless.farmapp.model.Plant;

import java.util.ArrayList;

import sleepless.farmapp.model.Fruit.PeachFruit;
import sleepless.farmapp.model.Fruit.Fruit;
import sleepless.farmapp.model.PlantList.Plant;
import sleepless.farmapp.model.PlantList.emptyPlant;

public class TestPeach implements Plant {
	private String plantName = "Peach", plantStage = "Seed";
	private int contAge = 6, fullAge = 6, contPlantWater = 5, fullPlantWater = 5, contHealth = 3, fullHealth = 3;
	// private String[] plantFruit = new String [1];
	// private String[] plantFruit ={"Avocado Fruit"};
	private ArrayList<Fruit> plantFruit = new ArrayList<Fruit>();

	public TestPeach() {
		plantFruit.add(new PeachFruit());
	}

	public void viewPlant() {
		// TODO Auto-generated method stub
		System.out.println(plantName);
		System.out.println(
				"   Age:[seed | seedling | mature | dead] (" + plantStage + "  " + contAge + "//" + fullAge + " Days)");
		System.out.println("   Health:(" + contHealth + "//" + fullHealth + ") (more hearths, "
				+ "longer it can live without water)");
		System.out.println("   Water:(" + contAge + "//" + fullAge + ") ");
		for (int i = 0; i < plantFruit.size(); i++) {
			System.out.println("   Fruit:" + plantFruit.get(i));
		}

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
			System.out.println("Peach died now");
			p = new emptyPlant();

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
}
