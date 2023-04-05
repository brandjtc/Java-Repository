// File:    PasswordTestBrandon.java
// Project: CSIS3101 Assignment 11 
// Author:  Brandon Catalano 
// History: Version 1.0 4/9/2022
import java.io.*;
import java.util.Scanner;

public class PasswordTestBrandon {
	public static void main(String[] args) throws IOException{
		File iFile = new File("passwdin.txt");
			
		iFile.createNewFile();
				
		FileWriter oFile = new FileWriter("brandonpasswdout.txt");		
		
		Scanner inp = new Scanner(iFile);
		if (!iFile.exists()){
			System.out.println("File does not exist");
			System.exit(1);
		}
		//System.out.println("File exists? " + iFile.exists());
		//System.out.println("Next line read? "+inp.hasNext());
		while (inp.hasNext()) {
			Passw0rdBrandon test = new Passw0rdBrandon(inp.nextLine());
			oFile.write(test.checkPassword());
		}
		oFile.close();
		inp.close();
			}
		
			
	}
		



