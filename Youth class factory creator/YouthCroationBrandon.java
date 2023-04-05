// File:    YouthCroationBrandon.java
// Project: CSIS3101 Assignment 8
// Author:  Brandon Catalano 
// History: Version 1.0 4/3/2022
public class YouthCroationBrandon extends Youth {
	YouthCroationBrandon(){
		super();
		this.setGoodNightGreeting("Laku noć");
		this.setGoodMorningGreeting("Dobro jutro");
	}
	YouthCroationBrandon(String firstName,String lastName){
		super(firstName,lastName);
		this.setGoodNightGreeting("Laku noć");
		this.setGoodMorningGreeting("Dobro jutro");
	}

}
