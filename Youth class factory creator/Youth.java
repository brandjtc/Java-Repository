// File:    Youth.java
// Project: CSIS3101 Assignment 8
// Author:  Brandon Catalano 
// History: Version 1.0 4/3/2022
import java.util.ArrayList;

public class Youth {
	private String firstName;
	private String lastName;
	private String goodNightGreeting;
	private String goodMorningGreeting;
		
	Youth(){
		firstName="John";
		lastName="Doe";
		goodNightGreeting="Nighty-night";
		goodMorningGreeting="Top of the mornin' to ya";
	}
	
	Youth(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		this.goodNightGreeting="Good night";
		this.goodMorningGreeting="Good Morning";
	}
	
	//Gets and sets.
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGoodNightGreeting() {
		return goodNightGreeting;
	}
	public void setGoodNightGreeting(String goodNightGreeting) {
		this.goodNightGreeting = goodNightGreeting;
	}
	public String getGoodMorningGreeting() {
		return goodMorningGreeting;
	}
	public void setGoodMorningGreeting(String goodMorningGreeting) {
		this.goodMorningGreeting = goodMorningGreeting;
	}
	
	public String greetGoodNight() {
		String retStr=this.goodNightGreeting+" "+this.firstName+" "+this.lastName+".";
		return retStr;
	}
	public String greetGoodMorning() {
		String retStr=this.goodMorningGreeting+" "+this.firstName+" "+this.lastName+".";
		return retStr;
	}
	
}
