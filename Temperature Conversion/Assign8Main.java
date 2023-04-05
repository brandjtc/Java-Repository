// File:    Assign8Main.java
// Project: CSIS3101 Assignment #8
// Author:  Brandon Catalano 
// History: Version 1.0 3/18/2022
import java.util.Scanner;
public class Assign8Main {
	public static void main(String[] args) {
		TempBrandon test1= new TempBrandon();
		
		getTempFromUser(test1);
		//TempBrandon test2= new TempBrandon(100, 'c');
		//TempBrandon test3=new TempBrandon(100,'k');
		//TempBrandon test4=new TempBrandon();
		//TempBrandon class string print testers.
		//System.out.println(test2);
		//System.out.println(test3);
		//System.out.println(test4);
		
		//Testing for int buffer class.
		/*IntBufferBrandon a = new IntBufferBrandon();
		IntBufferBrandon b = new IntBufferBrandon(10);
		int i = 0;
		while (i<11) {
			b.addRandom();
			b.printToConsole();
			i++;
		}
		int z = 0;
		while (z<8) {
			a.addRandom();
			z++;
		}
		System.out.println("a buffer print:");
		a.printToConsole();
		*/
		
		
		

	}
public static void getTempFromUser(TempBrandon tempObject) {
		
		Scanner userInp=new Scanner(System.in);
		System.out.println("Input the temperature numerically, followed by the unit. E.G.: 95 K or -103C ");
		System.out.println("Temperature and unit: ");
		char[] inpy=userInp.nextLine().replace(" ","").toCharArray();
			//Debug code ensuring that the last portion of the array is targeted.
		//System.out.println(inpy[inpy.length-1]);
		
		//Copying a char array's values as a set range into a string, which I attempt to then turn into a number later via try-catch.
		String numStore=String.copyValueOf(inpy,0, inpy.length);
		//10System.out.println("'"+numStore+"'");
		boolean isNum;
		/*Try catch to check if the rest of the string is a number. If it fails, a boolean triggers one of the or conditions 
		 * of a following while loop used for input validation.
		 */
		try {
	        Double.parseDouble(numStore);
	        isNum= true;
	    }
	    catch( Exception NumberFormatException ) {
	        isNum= false;
	    }
		//System.out.println(isNum);
		char unitChar=Character.toLowerCase(inpy[inpy.length-1]);
		//System.out.println(inpy[inpy.length-1]+"iNPY'S CHAR");
		while ((unitChar!='k'&&unitChar!='c'&&unitChar!='f')||isNum==false) {
			System.out.println("Improper input.");
			System.out.println("Input the temperature numerically, followed by the unit. E.G.: 95 K or -103C ");
			System.out.println("Temperature and unit: ");
			inpy=userInp.nextLine().replace(" ","").toCharArray();
			
			numStore=String.copyValueOf(inpy,0, inpy.length);
			try {
		        Double.parseDouble( numStore );
		        isNum= true;
		    }
		    catch( Exception NumberFormatException ) {
		        isNum= false;
		    }
			unitChar=Character.toLowerCase(inpy[inpy.length-1]);		
		}
		tempObject.setTemp(Double.parseDouble(numStore));
		tempObject.setUnit(unitChar);
		System.out.println(tempObject);
	}
}
