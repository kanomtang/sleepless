package sleepless.farmapp.model.PlantList;

import java.util.ArrayList;

import sleepless.farmapp.model.Fruit.Fruit;
import sleepless.farmapp.model.Fruit.PapayaFruit;

public class Papaya implements Plant {

	private String plantName = "Avocado", plantStage = "Seed";
	private int contAge = 7, fullAge = 7, contPlantWater = 3, fullPlantWater = 3, contHealth = 4, fullHealth = 4;
	// private String[] plantFruit = new String [1];
	// private String[] plantFruit ={"Avocado Fruit"};
	private ArrayList<Fruit> plantFruit = new ArrayList<Fruit>();

	public Papaya() {
		// TODO Auto-generated constructor stub
		plantFruit.add(new PapayaFruit());
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
			System.out.println("Papaya died now");
			p = new emptyPlant();

		}

	}

	public String getPlantName() {
		return plantName;
	}
}
