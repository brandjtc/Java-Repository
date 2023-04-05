// File:    YouthDutchBrandon.java
// Project: CSIS3101 Assignment 8
// Author:  Brandon Catalano 
// History: Version 1.0 4/3/2022
public class YouthDutchBrandon extends Youth {
	YouthDutchBrandon(){
		super();
		this.setGoodNightGreeting("Slaap lekker");
		this.setGoodMorningGreeting("Guetemorgen");
	}
	YouthDutchBrandon(String firstName,String lastName){
		super(firstName,lastName);
		this.setGoodNightGreeting("Slaap lekker");
		this.setGoodMorningGreeting("Guetemorgen");
	}
}
