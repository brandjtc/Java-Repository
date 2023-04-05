import java.util.Random;

//File:	SmartPhone.java
//Poject: CSIS3101 Assignment 9
//Author: Brandon Catalano
//History: Version 1.0 3/24/2022

public class SmartPhone {
	protected final String nl="\n";
	private Random rand= new Random();
	private String make; 
	private String model;
	private String serialNumber;
	private int year;  
	private double baseFee;
		//default constructor
		SmartPhone(){
			make="CSIS";
			model="Advanced";
			year =2022; 
			serialNumber="";
			
		}
		//arg constructor
		SmartPhone(String mak,String mod, String serialnum, int time, double fee){
			make = mak;
			model = mod;
			serialNumber=serialnum;
			year=time;
			baseFee=fee;
		}
		//Set methods.
		public void setMake(String mak) {
			make=mak;
		}
		public void setModel(String mod) {
			model="mod";
		}
		public void setSerial(String serialNum) {
			serialNumber=serialNum;
		}
		public void setYear(int time) {
			year=time;	
		}
		public void setBaseFee(int fee) {
			baseFee=fee;
		}
		//Get methods.
		public String getMake() {
			return make;
		}
		private String getSerialNumber() {
			return serialNumber;
		}
		public String getModel() {
			return model;
		}
		public int getYear() {
			return year;
		}
		public double getBaseFee() {
			return baseFee;
		}

		public String serialNumFinder(){
			if (serialNumber.equals(""))
			this.CreateSerialNumber();
			return getSerialNumber();
		}

		//create serial number method using empty serialConstruct string as a based to be added to.
		private void CreateSerialNumber() {
			String serialConstruct ="";
			String yearStorage="";
			yearStorage+=year;
			serialConstruct+=make.charAt(0);
			serialConstruct+=model.charAt(model.length()-1);
			serialConstruct+=yearStorage.charAt(yearStorage.length()-2);
			serialConstruct+=yearStorage.charAt(yearStorage.length()-1);
			serialConstruct+=rand.nextInt(900)+100;
			System.out.println("Serial: "+serialConstruct);
			serialNumber=serialConstruct;
		}
		
		public String toString() {
	 	String retStr="Make: "+getMake()+nl+"Model: "+getModel()+nl+"Year: "+getYear()+nl+"Serial Number: "+serialNumFinder()+nl+"Base Fee: "+getBaseFee()+"$"+nl;
		return retStr;
			
		}
}
