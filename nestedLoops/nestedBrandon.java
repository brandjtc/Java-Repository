// File:    nestedBrandon.java
// Project: CSIS3101 Assignment 3
// Author:  Brandon Catalano 
// History: Version 1.0 1/27/2022
import java.util.*;
public class nestedBrandon {

	public static void main(String[] args) {
//Scanner initialization
		System.out.println("Input the number of rows: ");
		Scanner in= new Scanner(System.in);
//User input
		int rows = in.nextInt();
//Nested for loops, using row user input to determine endpoint.		
		for (int i=1; i<rows+1; i++) {
//used to determine dollar sign count per line.
			int dollacount=0;
			for (int j =1; j<rows+1; j++) {
				
				if (dollacount<i)
					System.out.print("$");
				else if(1==1)
					System.out.print("!");
				dollacount+=1;
				
			}
			System.out.println();
		}
		in.close();
	}

}
