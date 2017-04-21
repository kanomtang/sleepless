package sleepless.farmapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sleepless.farmapp.model.PlantList.Avocado;
import sleepless.farmapp.model.PlantList.Banana;
import sleepless.farmapp.model.PlantList.Orange;
import sleepless.farmapp.model.PlantList.Papaya;
import sleepless.farmapp.model.PlantList.Peach;
import sleepless.farmapp.model.PlantList.Plant;
import sleepless.farmapp.model.PlantList.emptyPlant;

public class Prompt {

	private static Scanner scan;
	
	public static void Initialize(){
		System.out.println("Hello welcome to Sleepless Craxy planting game");
		try{
			runTheProgram();
		}
		finally {
			System.out.println("Thx for playing our games glhf");
		}
		
	}

	public static void runTheProgram() {
		// TODO Auto-generated method stub

		// Plant[] plantlist= new Plant[4];
		Plant beg1 = new emptyPlant();
		Plant beg2 = new emptyPlant();
		Plant beg3 = new emptyPlant();
		Plant beg4 = new emptyPlant();
		// these line create the beg and input empty plant
		List<Plant> plantlist = new ArrayList<Plant>();
		plantlist.add(beg1);
		plantlist.add(beg2);
		plantlist.add(beg3);
		plantlist.add(beg4);
		// these line create for show all of plant type 
		List<Plant> seedlist = new ArrayList<Plant>();
		seedlist.add(new Avocado());
		seedlist.add(new Banana());
		seedlist.add(new Orange());
		seedlist.add(new Papaya());
		seedlist.add(new Peach());
		// this line for create the inventory
		
		

		int checkpoint = 0;
		
		do {
			
			System.out.println("Choose your option Press the number and hit enter");
			System.out.println("1:View Plants");
			System.out.println("2:Plant a plant");
			System.out.println("3:Sleep");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("7:Exit game ");

			scan = new Scanner(System.in);
			System.out.println("please choose option by pressing the number ");
			int input = scan.nextInt();
			if (input == 1) {
				//option #1 ViewPlant
				for (int i = 0; i < plantlist.size(); i++) {
					plantlist.get(i).viewPlant();
					;
				}

			} else if (input == 2) {
				//option #2 plantSeed
				int countloop2 = 0;
				for(Plant a : seedlist){
					System.out.println(countloop2+" : "+a.getPlantName());
				}
				int loop2input = scan.nextInt();
				if(loop2input==0){
					break;
				}else{
					for (int i = 0; i < plantlist.size(); i++) {
					
					if (plantlist.get(i) == null) {
						setThePlant(plantlist.get(i), loop2input);

						System.out.println("Plant is planted");
						break;
					}else {
						System.out.println("No space for planting the seed");
					}
				}
				}
				
			} else if (input == 3) {
			//option #3 sleep	
				
				for (int i = 0; i < plantlist.size(); i++) {
					
					plantlist.get(i).plantSleep(plantlist.get(i));
				}
			} else if (input == 4) {

			} else if (input == 5) {

			} else if (input == 6) {

			}else if(input == 7){
				
			}
		} while (checkpoint != 8);
	}

	private static Plant setThePlant(Plant p, int number) {
		if (number == 1) {
			p = new Avocado();
		} else if (number == 2) {
			p = new Banana();
		} else if (number == 3) {
			p = new Orange();
		} else if (number == 4) {
			p = new Papaya();
		} else if (number == 5) {
			p = new Peach();
		}
		return p;
	}
	
}
