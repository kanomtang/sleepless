package plantgame;

import java.util.ArrayList;
import java.util.Scanner;



public class Prompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 ArrayList<Plant> plantlist = new ArrayList<Plant>();
		 Plant beg1,beg2,beg3,beg4 ;
		int checkpoint= 0 ;
		do{
			System.out.println("Hello welcome to Sleepless Plant game");
			System.out.println("Choose your option Press the number and hit enter");
			System.out.println("1:View Plants");
			System.out.println("2:Plant a plant");
			System.out.println("3:Sleep");
			System.out.println();
			System.out.println();
			System.out.println();
			
			Scanner input = new Scanner(System.in);
			System.out.println("please choose option by pressing the number "+input);
			if(checkpoint==1){
				
			}else if (checkpoint==2){
				
			}else if (checkpoint==3){
				
			}else if (checkpoint==4){
				
			}else if (checkpoint==5){
				
			}else if (checkpoint==6){
				
			}
		}while(checkpoint!=7);
	}

}
