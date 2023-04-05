// File:    Apparel.java
// Project: CSIS3101 Assignment 7
// Author:  Brandon Catalano 
// History: Version 1.5 3/10/22
public class Apparel {
	//variable initialization 
	private double cost;
	private int weightInOunces;
	private String description;
	private String size;
	private int quantity;
	//default constructor
	Apparel(){
		cost=0;
		weightInOunces=0;
		description="Sample Item";
		size="Medium";
		quantity=1;
	}
	//argument constructor
	Apparel(double costInp, int weiInp, String descinp, String sizeInp){
		cost=costInp;
		weightInOunces=weiInp;
		description= descinp;
		size = sizeInp;
		quantity=1;
	}
	//get methods
	public double getOrderCost() {
		return cost*quantity;
	}
	public int getOrderWeightInOunces() {
		return weightInOunces*quantity;
	}
	//set methods
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int i) {
		quantity = i;
	}
	//string output
	public String toString() {
		String retStr = "";
		retStr+=getOrderCost()+ " each for "+getQuantity() + " "+ size + " " +description ;
		return retStr;
		}
}
