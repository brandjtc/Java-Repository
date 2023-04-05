// File:    iPhoneBrandon.java
// Project: CSIS3101 Assignment 9
// Author:  Brandon Catalano 
// History: Version 1.0 3/24/2022
public class iPhoneBrandon extends SmartPhone {
	private int noOfiTunes;
	private int noOfPaidApps;
	final private double iTuneFee;
	final private double appFee;
	//arg constructor with inheritance
	iPhoneBrandon(String mak,String mod, String serialnum, int time, double fee, int itune, int paidapp, double tunefee, double appfee){
		super(mak ,mod ,serialnum ,time ,fee);
		noOfiTunes=itune;
		noOfPaidApps=paidapp;	
		iTuneFee=tunefee;
		appFee=appfee;

	}
	//noarg constructor with noarg inherited 
	iPhoneBrandon(){
		super();
		noOfiTunes=10;
		noOfPaidApps=0;	
		iTuneFee=1.00;
		appFee=1.00;
	}

	public int getnoOfiTunes(){
		return noOfiTunes;
	}

	public int getnoOfPaidApps(){
		return noOfPaidApps;
	}

	public double getiTuneFee(){
		return iTuneFee;
	}

	public double getappFee(){
		return appFee;
	}
	
	public void setnoOfPaidApps(int inp){
		this.noOfPaidApps=inp;
	}

	public void setnoOfiTunes(int inp){
		this.noOfiTunes=inp;
	}

	public double calculateFee(){
		double feeMultStorage=0;
		double totalFee=getBaseFee();
		int iTuneExcess=this.noOfiTunes;
		iTuneExcess+=-10;
		if (iTuneExcess>0){
			feeMultStorage=this.iTuneFee*iTuneExcess;
		}
		totalFee+=feeMultStorage;
		if (this.noOfPaidApps>0)
			feeMultStorage=noOfPaidApps*appFee;
		totalFee+=feeMultStorage;
		return totalFee;

	}
	public String toString() {
		String retStr="Make: "+getMake()+nl+"Model: "+getModel()+nl+"Year: "+getYear()+nl+"Serial Number: "+serialNumFinder()+nl+"Total Fee: "+calculateFee()+"$"+nl;
		return retStr;

	}
	
}
