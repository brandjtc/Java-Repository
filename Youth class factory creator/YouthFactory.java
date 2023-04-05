// File:    YouthFactory.java
// Project: CSIS3101 Assignment 8
// Author:  Brandon Catalano 
// History: Version 1.0 4/3/2022
public class YouthFactory{
    public static Youth getYouthInstance(){
        Youth child2 = new Youth("Billy","Bob");
        return child2;
    }

	public static Youth getYouthInstance(String firstName, String lastName) {
		Youth child1= new Youth(firstName,lastName);
		return child1;
	}
	
	public static Youth getYouthInstance(String firstName, String lastName, String language) {
		if (language.equals("German")) {
			Youth child1 = new YouthGermanBrandon(firstName, lastName);
			return child1;
		}
		
		else if (language.equals("Dutch")) {
			Youth child1 = new YouthDutchBrandon(firstName, lastName);
			return child1;
		}
		else if (language.equals("Croation")) {
			Youth child1=new YouthCroationBrandon(firstName,lastName);
			return child1;
			
		}
		else {
			Youth child1= new Youth(firstName,lastName);
			return child1;
		}
		
		
		
	}
}
