// File:    YouthGermanBrandon.java
// Project: CSIS3101 Assignment 8
// Author:  Brandon Catalano 
// History: Version 1.0 4/3/2022
public class YouthGermanBrandon extends Youth {
	YouthGermanBrandon(){
		super();
		this.setGoodNightGreeting("Gute Nacht");
		this.setGoodMorningGreeting("Guten Morgen");
	}
	YouthGermanBrandon(String firstName,String lastName){
		super(firstName,lastName);
		this.setGoodNightGreeting("Gute Nacht");
		this.setGoodMorningGreeting("Guten Morgen");
	}

}
