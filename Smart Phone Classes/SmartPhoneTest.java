// File:    SmartPhoneTest.java
// Project: CSIS3101 Assignment 9 
// Author:  Brandon Catalano 
// History: Version 1.0 3/24/2022
public class SmartPhoneTest {
	final static String nl="\n";
	public static void main(String[] args) {
		iPhoneBrandon iPhoneArgs = new iPhoneBrandon("iPhone","S","serialnumhere",2008,10,12,10,2.4,2.5);
		System.out.println("Iphone  arg constructor: "+iPhoneArgs);

		iPhoneBrandon iPhoneNoArgs= new iPhoneBrandon();
		
		System.out.println("Iphone default constr.:"+nl+iPhoneNoArgs);
		iPhoneNoArgs.setnoOfiTunes(14);
		System.out.println("Iphone default with itunes set to 14:"+nl+iPhoneNoArgs);
		iPhoneNoArgs.setnoOfPaidApps(30);
		System.out.println("Iphone default with paid apps set to 30:"+nl+iPhoneNoArgs);
		System.out.println("Iphone default constr with model, year, base fee, and make changed.");
		iPhoneNoArgs.setModel("Big Phone");
		iPhoneNoArgs.setMake("pretend iphone");
		iPhoneNoArgs.setBaseFee(50);
		iPhoneNoArgs.setYear(2002);
		System.out.println(iPhoneNoArgs+nl);
		
		AndroidBrandon AndroidArgs=new AndroidBrandon("Android","ZTE354","serialnumberhere",2002,3.50,7,3.0);
		System.out.println("Android arg constructor: "+nl+AndroidArgs);
		System.out.println("Android arg constructor with altered make");
		AndroidArgs.setYear(2005);
		System.out.println(AndroidArgs+nl);
		
		System.out.println("Noarg android constructor:");
		AndroidBrandon AndroidNoArgs= new AndroidBrandon();
		System.out.println(AndroidNoArgs);
		System.out.println("Android no args with virtual customer service fee and number of languages changed");
		AndroidNoArgs.setNoOfLangSupport(15);
		AndroidNoArgs.setVirtualCSFee(20.53);
		
		
		
		
		
		
	}

}
