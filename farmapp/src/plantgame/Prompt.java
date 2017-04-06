package plantgame;

import java.util.ArrayList;
import java.util.Scanner;



public class Prompt {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 
		 //Plant[] plantlist= new Plant[4];
		 Plant beg1=new Plant() ;
		 Plant beg2=new Plant() ;
		 Plant beg3=new Plant() ;
		 Plant beg4=new Plant() ;
		 Plant[] plantlist= {beg1,beg2,beg3,beg4};
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
			
			scan = new Scanner(System.in);
			System.out.println("please choose option by pressing the number ");
			int input = scan.nextInt();
			if(input==1){
				for(int i =0 ;i<plantlist.length;i++){
					plantlist[i].viewPlant();
				}
			}else if (input==2){
				
			}else if (input==3){
				
			}else if (input==4){
				
			}else if (input==5){
				
			}else if (input==6){
				
			}
		}while(checkpoint!=7);
	}

}
