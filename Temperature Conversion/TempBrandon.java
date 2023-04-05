// File:    TempBrandon.java
// Project: CSIS3101 Assignment #8
// Author:  Brandon Catalano 
// History: Version 2.0 3/18/2022
public class TempBrandon {
	private double temp;
	private char unit;
	
	//No arg constructor.
	TempBrandon(){
		temp=1;
		unit='f';
	}
	TempBrandon(double temp, char unit){
		this.temp=temp;
		this.unit=unit;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public void setUnit(char unit) {
		this.unit = unit;
	}
	
	public double getTemp() {
		return this.temp;
	}
	
	public char getUnit() {
		return this.unit;
	}
	//Series of temperature unit conversion formulas used again in the toString() method.
	//Uses switch cases that take the unit as input for conversion.
	private double toCelsius() {
		double retDouble=0;
		double currentTemp=this.getTemp();
		switch (this.getUnit()) {
		case 'k':
			retDouble=currentTemp-273.15;
			return retDouble;
		case 'c':
			retDouble=currentTemp;
			return retDouble;
		case 'f':
			 retDouble=currentTemp*5/9-32;
			 return retDouble;
		default:
			return retDouble;
		}
	}

	private double toFahrenheit() {
		double retDouble=0;
		double currentTemp=this.getTemp();
		switch (this.getUnit()) {
		case 'k':
			retDouble=(currentTemp-273.15)*9/5+32;
			return retDouble;
		case 'f':
			retDouble=currentTemp;
			return retDouble;
		case 'c':
			retDouble=currentTemp*9/5+32;
			return retDouble;
		default:
			return retDouble;	
		}
	}
	private double toKelvin() {
		double retDouble=0;
		double currentTemp=this.getTemp();
		switch (this.getUnit()) {
		case 'k':
			retDouble=currentTemp;
			return retDouble;
		case 'f':
			retDouble=(currentTemp-32)*5/9+ 273.15;
			return retDouble;
		case 'c':
			retDouble=currentTemp+273.15;
			return retDouble;
		default:
			return retDouble;
		}
	}
	public String toString(){
		String retStr="The temperature in Celsius is "+String.format("%.2f",this.toCelsius()) +"\n"
		+"The temperature in Fahrenheit is " +String.format("%.2f", this.toFahrenheit()) +"\n"
		+ "The temperature in Kelvin is "+ String.format("%.2f",this.toKelvin());
		return retStr;
	}
}



