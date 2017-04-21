package sleepless.farmapp.model.Plant;



import java.util.ArrayList;


import sleepless.farmapp.model.Fruit.TestFruit;
import sleepless.farmapp.model.Fruit.TestPapayaFruit;


public class TestPapaya implements TestPlant {

	private String plantName = "Papaya", plantStage = "Seed";
	private int contAge = 7, fullAge = 7, contPlantWater = 3, fullPlantWater = 3, contHealth = 4, fullHealth = 4;
	// private String[] plantFruit = new String [1];
	// private String[] plantFruit ={"Avocado Fruit"};
	private ArrayList<TestFruit> plantFruit = new ArrayList<TestFruit>();

	public TestPapaya() {
		// TODO Auto-generated constructor stub
		plantFruit.add(new TestPapayaFruit());
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

	public void waterPlant() {
		// TODO Auto-generated method stub

	}

	

	public void plantSleep(TestPlant p) {
		// TODO Auto-generated method stub
		
		p.increasingage(1);
		//contAge++;
		//if (contPlantWater != 0) {
		if(p.getContPlantWater()!=0){
			//contPlantWater--;
			p.decreasingWater(1);
		}
		//if (contPlantWater == 0) {
		if(p.getContPlantWater()==0){
			//if (contHealth > 0) {
		     if(p.getContHealth()>0){
				contHealth--;
				p.decreasingHealth(1);
			}
			//else if (contHealth == 0) {
			else if (p.getContHealth()==0){
				System.out.println("Avocado died now");
				setToEmpty(p);
				

			}
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

	public ArrayList<TestFruit> getPlantFruit() {
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

	public void setPlantFruit(ArrayList<TestFruit> plantFruit) {
		this.plantFruit = plantFruit;}


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
	private static void setToEmpty(TestPlant p){
		p.setContAge(0);
		p.setContHealth(0);
		p.setContPlantWater(0);
		p.setFullAge(0);
		p.setFullHealth(0);
		p.setFullPlantWater(0);
		p.setPlantFruit(null);
		p.setPlantName(null);
		p.setPlantStage(null);
	}

	
}
