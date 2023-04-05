// File:    Lotto.java
// Project: CSIS3101 Assignment 4 
// Author:  Brandon Catalano 
// History: Version 1.0 2/3/22
import java.util.Scanner;
import java.lang.Math;
public class Lotto {
	public static void main(String[] args) {
		lottoNumBrandon();
		lottoStrBrandon();
	}
//LottoNum method that calculates winnings based off user input.
	public static void lottoNumBrandon(){
		Scanner in = new Scanner(System.in);
		int compNum= (int)(Math.random()*(999-100)+100);
//System.out.println(compNum);
		System.out.print("Input a 3 digit integer: ");
		//Variable declaration. a corresponds to first digit, b to second, c to third.
		//U is for user values, C is for computer values.
		int userIn=in.nextInt();
		
//Breaks down user and computer generated numbers into it's 3 digits.
		int aC= compNum/100;
		int bC= (compNum-aC*100)/10;
		int cC=compNum-aC*100-bC*10;	
		
		int aU= userIn/100;
		int bU= (userIn-aU*100)/10;
		int cU=userIn-aU*100-bU*10;
		
		if (userIn==compNum){
			System.out.println("Congratulations, the award is $10,000");
		}
		else if ((aC==aU||aC==bU||aC==cU)&&(bC==aU||bC==bU||bC==cU)&&(cC==aU||cC==bU||cC==cU)) {
			System.out.println("Congratulations, you won $7,000");
		}
		else if (aC==aU&&bC==bU||aC==bU&&bC==cU||bC==aU&&cC==bU||bC==bU&&cC==cU) {
			System.out.println("Congratulations! You've won $4,000");
		}else{
			System.out.println("Sorry, play again.");
		}
	}
		public static void lottoStrBrandon(){
			int money = 0;
//Scanner for user input.
			Scanner in=new Scanner(System.in);
			System.out.println("Please enter a 2 digit number: ");
	    	int	userInt= in.nextInt();
			String userStr=(""+userInt);
			String compNum=(""+(10+Math.random()*99));
//charAt used to grab value at specific index of user generated numbers. 		
			char uA= userStr.charAt(0);
			char uB=userStr.charAt(1);
			char cA = compNum.charAt(0);
			char cB=compNum.charAt(1);
			in.close();
			if (userStr.equals(compNum)) {
		money=5000;
		System.out.println("Congratulations! You have won $"+money);
	}
		else if (uA==cB&&uB==cA) {
		money=3000;	
		System.out.println("You have won $"+money);
	}
		else if (uA==cA||uA==cB||uB==cB||uB==cA) {
		money=1000;
		System.out.println("You have won $"+money);
	}
		else {
		System.out.println("Bad luck. Tray again next time.");
	}
	}
}
