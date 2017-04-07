package plantgame;



public class Papaya extends Plant{
	private String plantName="null";
	private int contAge=7 ,fullAge=7,contPlantWater=3,fullPlantWater=3,contHealth=4,fullHealth=4;
	//private String[] plantFruit = new String [1];
		private String[] plantFruit ={"Avocado Fruit"};
	@Override
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
	@Override
	public void plantSeed() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void waterPlant() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void plantSleep(Plant p) {
		// TODO Auto-generated method stub
		contAge++;
		contPlantWater--;
		if(contPlantWater==0){
			contHealth--;
		}
		if(contHealth==0){
			System.out.println("Papaya died now");
			p = new Plant();
			
		}
		
	}
	
}
