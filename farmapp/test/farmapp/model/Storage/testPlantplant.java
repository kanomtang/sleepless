package farmapp.model.Storage;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import sleepless.farmapp.model.PlantList.Avocado;
import sleepless.farmapp.model.PlantList.Plant;
import sleepless.farmapp.model.PlantList.emptyPlant;

public class testPlantplant {

	@Test
	public void testtPlant() {
		ArrayList<Plant> plantlist = new ArrayList<Plant>();
		Plant a = new emptyPlant();
		Plant b = new emptyPlant();
		plantlist.add(a);
		plantlist.add(b);
		
		for(int i=0;i<plantlist.size();i++){
			if (plantlist.get(i).getPlantName().equals("null")) {
				// setThePlant(plantlist.get(i), loop2input);

				plantlist.set(i, new Avocado());
				System.out.println("Plant is planted");
				break;
			} else {
				System.out.println("No space for planting the seed");
			}
		}
		
		assertEquals("Avocado", plantlist.get(0).getPlantName());
	}

}
