package plantgame;



public class Papaya extends Plant{
	private String plantName="null";
	private int contAge=0 ,fullAge=0,contPlantWater=0,fullPlantWater=0;
	String[] plantFruit = new String [1];
	String[] plantFurit ={"Papaya Fruit"};
	@Override
	public void viewPlant() {
		// TODO Auto-generated method stub
		System.out.println(plantName);
		System.out.println("   Age:[seed | seedling | mature | dead] ("+contAge+"//"+fullAge+" Days)");
		System.out.println("   Health:("+contPlantWater+"//"+fullPlantWater+") (more hearths, "
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
	public void plantSleep() {
		// TODO Auto-generated method stub
		
	}
	
}
