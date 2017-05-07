package sleepless.farmapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sleepless.farmapp.model.Fruit.Fruit;
import sleepless.farmapp.model.PlantList.Avocado;
import sleepless.farmapp.model.PlantList.Banana;
import sleepless.farmapp.model.PlantList.Orange;
import sleepless.farmapp.model.PlantList.Papaya;
import sleepless.farmapp.model.PlantList.Peach;
import sleepless.farmapp.model.PlantList.Plant;
import sleepless.farmapp.model.PlantList.emptyPlant;
import sleepless.farmapp.model.Shop.TBKShop;
import sleepless.farmapp.model.Storage.SleeplesswareHouse;

public class Prompt {

	private static Scanner scan;

	public static void Initialize() {
		System.out.println("Hello welcome to Sleepless Craxy planting game");
		try {
			runTheProgram();
		} finally {
			System.out.println("Thx for playing our games glhf");
		}

	}

	public static void runTheProgram() {
		// TODO Auto-generated method stub

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

		SleeplesswareHouse warehouse = new SleeplesswareHouse();
		TBKShop tbkshop = new TBKShop();
		int gameDays = 0;

		int checkpoint = 0;

		do {
			System.out.println("Days :" + gameDays + " Money :" + warehouse.getMoney() + " Zeny");
			System.out.println("Choose your option Press the number and hit enter");
			System.out.println("1:View Plants");
			System.out.println("2:Plant a plant");
			System.out.println("3:Sleep");
			System.out.println("4:Havest");
			System.out.println("5:View inventory");
			System.out.println("6:Visit shop");
			System.out.println("7:Sell fruit");
			System.out.println("8:water plant");
			System.out.println("9:Exit game ");

			scan = new Scanner(System.in);
			System.out.println("please choose option by pressing the number ");
			int input = scan.nextInt();
			if (input == 1) {
				// option #1 ViewPlant
				for (int i = 0; i < plantlist.size(); i++) {
					plantlist.get(i).viewPlant();
					;
				}

			} else if (input == 2) {
				// option #2 plantSeed
				int countloop2 = 0;

				for (Plant a : seedlist) {
					System.out.println(countloop2 + " : " + a.getPlantName());
					countloop2++;
				}System.out.println("Press 10 and hit enter for back to main menu");
				int loop2input = scan.nextInt();
				
				if (loop2input == 10) {
					break;
				} else {
					for (int i = 0; i < plantlist.size(); i++) {

						if (plantlist.get(i).getPlantName().equals("null")) {
							// setThePlant(plantlist.get(i), loop2input);

							plantlist.set(i, seedlist.get(loop2input));
							System.out.println("Plant is planted");
							break;
						} else {
							System.out.println("No space for planting the seed");
						}
					}
				}

			} else if (input == 3) {
				// option #3 sleep

				for (int i = 0; i < plantlist.size(); i++) {

					plantlist.get(i).plantSleep();
				}
				gameDays++;
				System.out.println("Days " + gameDays);

			} else if (input == 4) {
				// harvest
				for (int i = 0; i < plantlist.size(); i++) {
					if (plantlist.get(i).getPlantStage() == "Mature") {
						harvest(plantlist.get(i), warehouse);
						plantlist.get(i).setToEmpty();
						System.out.println("Beg :" + i + " are harvested!");
					} else {
						System.out.println("Beg :" + i + " can't harvested!");
					}
				}

			} else if (input == 5) {
				// View Inventory

				ArrayList<Fruit> FruitInven = warehouse.getFruitlist();
				System.out.println("The list this Inventory");
				for (Fruit a : FruitInven) {
					System.out.println("Fruit Name" + a.getFruitName() + "  :  " + a.getFruitAmount());
				}
			} else if (input == 6) {
				// Visit shop
				int i = 0;
				System.out.println("Your money :" + warehouse.getMoney() + " Zeny");
				for (Plant a : tbkshop.getSeedlistStore()) {
					System.out.println(i + ": Name :" + a.getPlantName() + " Price :" + a.getZeny() + " Zeny");
					i++;
				}
				System.out.println("Press 9 and hit enter for back to main menu");
				int loop6input = scan.nextInt();

				if (loop6input == 9) {
					break;
				} else {
					if (tbkshop.getSeedlistStore().get(loop6input).getZeny() - warehouse.getMoney() >= 0) {
						seedlist.add(tbkshop.getSeedlistStore().get(loop6input));
						tbkshop.getSeedlistStore().remove(loop6input);
						System.out.println("Buy successful");
						break;
					} else {
						System.out.println("Zeny not enough");
						break;
					}
				}

			} else if (input == 7) {
				// Sell Fruit
				System.out.println("Before selling the fruit "+warehouse.getMoney()+" Zeny");
				warehouse.SellFruit();
				System.out.println("After selling the fruit "+warehouse.getMoney()+" Zeny");
			}
			else if(input == 8){
				   for(Plant p : plantlist){

					p.waterPlant();
				   }
				   System.out.println("All plant are watered");
				}
		} while (checkpoint != 8);
	}

	private static void harvest(Plant p, SleeplesswareHouse warehouse) {
		if (p.getPlantStage().equals("Mature")) {
			warehouse.Collecting(p);

		}
	}

}
