import java.util.Scanner;
//File:	speedFineCalcBrandon.java
//Poject: CSIS3101 Assignment
//Author: Brandon Catalano
//History: Version 2.5 1/25/2022
public class speedFineCalcBrandon {
//Method for fine calculation and display.   
	public static void fineCalc(int fineMult, double fine){
        if (fine<999){
		double finePrint= fine*fineMult;  
        System.out.println("$"+String.format("%.2f", finePrint));
        }
        else System.out.println();
		System.out.print("Display: ");
		
//fine double is used as input for switch that prints out the display message for speeding.
//Converted to int since switches do not accept double as input.
		switch ((int)fine) {
		case 69:
			System.out.println("Slow Down. !");
			break;
		case 99:
			System.out.println("Drive with caution. !");
			break;
		case 129:
			System.out.println("You are in danger zone. !");
			break;
		case 149:
			System.out.println("You are over speeding. !");
			break;
		case 999:
			System.out.println("See ya in court. !!");
			break;
		}
    }
    

	public static void main(String[] args) {
//Scanner initialization
		Scanner in = new Scanner(System.in);
//Variable initializaion
		System.out.println("Input the speed limit numerically: ");
		int speedLimitBrandon= in.nextInt();
		System.out.println("Input the vehicle's current speed numerically: ");
		int speedBrandon= in.nextInt();
		int speedDifferential =speedBrandon-speedLimitBrandon;
//Initialization for zone-based fine multiplier.
		int fineMult;
//While loop for input validation. Sets zone and fine multiplier.
		while (1<3){
			System.out.println("Are you in a schoolzone or a construction zone? Enter 's' for schoolzone or 'c' for construction zone. Otherwise, enter 'n' for no");
			System.out.println("Input Response: ");
			String zoneBrandon=in.next();
			if (zoneBrandon.equals("s")) {
				fineMult=3;
				break;
			}

			if (zoneBrandon.equals("c")) {
				fineMult=2;
				break;
			}
			
			if (zoneBrandon.equals("n")) {
				fineMult=1;
				break;
			}
		
			System.out.println("Improper input. Try again.");
		}
		String highSpeed="";
		double fine=0;
		//If statements establishing a base fine.
		if (speedDifferential>0&&speedDifferential<10)
			fine=69.50;
		else if (speedDifferential<20)
			fine=99.50;
		else if(speedDifferential<30)
			fine=129.50;
		else if(speedDifferential<35)
			fine=149.50;
		else if(speedDifferential>35){
//Fine is set to 999 to be used to trigger a specific case in the switch below. 
//String also triggers if statement that prevents the running of the finecalc function. 
			fine=999;
			highSpeed="Court Mandatory: Fine decided in court";
		}
		
		System.out.println(speedDifferential);
		if (speedDifferential>0) {
			System.out.println("Speed Limit: "+speedLimitBrandon);
			System.out.println("Vehicle Speed: "+speedBrandon);
//Switch case structure that prints what type of zone the user was driving in.
			switch (fineMult) {
			case 1:
				System.out.println("Zone: Regular");
			case 2:
				System.out.println("Zone: Construction");
			case 3:
				System.out.println("Zone: School");
			}	
			System.out.print("Total Fine Calculated: ");
//Here, I used a string to check if the fine would be a numerical value or decided in court.
//The string being equal to true is a little hack I used to get around the fact that I can't check if a boolean variable is equal to true/false in if statements.
			fineCalc(fineMult,fine);
		}
//Alternative print for if the user is not speeding.		
		else if (speedDifferential<1) {
		System.out.println("You are a law abiding citizen. Carry on.");
	}
	in.close();
		
	}

}

