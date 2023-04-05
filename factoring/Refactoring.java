// File:    Refactoring.java
// Project: CSIS3101 Assignment 5 
// Author:  Brandon Catalano 
// History: Version 1.0 2/11/2022
import java.util.*;
public class Refactoring {
    private static void getBrandonValue_step1(){
        Scanner inp = new Scanner(System.in);
        int userInt=0;
        System.out.println("Input an integer between 95 and 105, self inclusive:");
        userInt= inp.nextInt();
           System.out.println("You entered a "+userInt+"."); 
    }
    private static void getBrandonValue_step2(){
        Scanner inp = new Scanner(System.in);
        int userInt=0;
        while (userInt<=95||userInt>=105){
        System.out.println("Input an integer between 95 and 105, self inclusive:");
        userInt= inp.nextInt();
        //If statement to test if input is outside the range of 95 and 105, self inclusive.
        if (userInt<95||userInt>105){
            System.out.println();
            System.out.println("The value you entered is not a valid input between 95 and 105.");
            System.out.println();
        }
           System.out.println("You entered a "+userInt+"."); 
        }
    }
    private static void getBrandonValue_step3(){
        Scanner inp = new Scanner(System.in);
        int userInt=0;
        System.out.println("Input an integer between 95 and 105, self inclusive:");
        userInt= inp.nextInt();
        //If statement to test if input is outside the range of 95 and 105, self inclusive.
        if (userInt<95||userInt>105){
            System.out.println();
            System.out.println("The value you entered is not a valid input between 95 and 105.");
            System.out.println();
            }
        //If statement to test if variable is lower than 100 to print out "You entered a " rather than "You entered an " for proper grammer for numbers starting with ninety."
        else if (userInt<100){
            System.out.println("You entered a "+userInt+"."); 
            }
        else
            System.out.println("You entered an "+userInt+"."); 
    }
            
    private static void getBrandonValue_step4(){
        Scanner inp = new Scanner(System.in);
        int nonCharCount=0;
        int userInt=0;
        int validate=0;
        System.out.println("Input an integer between 95 and 105, self inclusive.");
        String userInp=inp.next();
        //A try catch that checks to see if the user input string is capable of becoming an integer called validate.
        //If it can't validate, it's because the string is not numeric, and prints out a line telling the user their input cannot be parsed as a number.
        try {
            validate = Integer.parseInt(userInp);
        }
            catch(NumberFormatException e) {
             System.out.println("Hellooo! Your input could not be read as a number. Get a Programming Life!");
             validate=0;
    }
        //Checks to see if validate is no longer equal to 0. Validate can only change to a different numerical value if the user input string successfully parses as an integer.
        if (validate!=0){
        	userInt=validate;
        	//Checks to see if userInt is outside the range of 95 and 105, self inclusive.
            if (userInt<95||userInt>105){
                System.out.println();
                System.out.println("The value you entered is not a valid input between 95 and 105.");
                System.out.println();
            }
            //Checks to see if variable is lower than 100 to print out "You entered a " rather than "You entered an " for proper grammar for numbers starting with ninety.
            else if (userInt<100){
                System.out.println("You entered a "+userInt+"."); 
            }
            else
                System.out.println("You entered an "+userInt+"."); 
        }
    }
    
    private static void getBrandonValue_step5(){
        Scanner inp = new Scanner(System.in);
        int loopRunner=0;
        int userInt=0;
        int validate = 0;
        //While loop that runs until a "successful print" occurs, after which the loopRunner variable increments to 1, ending this loop.
        while (loopRunner!=1){
        	System.out.println("Input an integer between 95 and 105, self inclusive:");
            String userInp=inp.next();  
            //A try catch that checks to see if the user input string is capable of becoming an integer called validate.
            //If it can't validate, it's because the string is not numeric, and prints out a line telling the user their input cannot be parsed as a number.
        	try {
        		validate = Integer.parseInt(userInp);
        		}
            catch(NumberFormatException e) {
                System.out.println("Hellooo! Your input could not be read as a number. Get a Programming Life!");
                System.out.println();            
            	}
        	//Checks to see if validate is no longer equal to 0. Validate can only change to a different numerical value if the user input string successfully parses as an integer.
        	if (validate!=0) {
        		userInt=validate;
        		//Checks to see if userInt is within the ranges of 95 and 105, self inclusive. If condition is met, loopRunner becomes equal to 1, ending the loop.
        		if (userInt>=95&&userInt<=105){
        			loopRunner=1;
        			System.out.println();
        			//Checks if userInt is lower than 100 to print out "You entered a " rather than "You entered an "
        			if (userInt<100)
        				System.out.println("You entered a "+userInt+".");
        			else
        				System.out.println("You entered an "+userInt+".");
        			System.out.println();
        		}
        		//Checks if userInt is outside of the range of 95 and 105 self inclusive..
        		else if (userInt<95||userInt>105) {
        			System.out.println();
        			System.out.println("The value you entered is not a valid input between 95 and 105.");
        			System.out.println();
        			
        		}
      
        	}
        }
    }
    
    public static void main(String args[]) {
      //getBrandonValue_step1();
      //getBrandonValue_step2();
      //getBrandonValue_step3();
      //getBrandonValue_step4();
      getBrandonValue_step5();
      }
}