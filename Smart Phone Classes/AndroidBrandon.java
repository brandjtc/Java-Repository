// File:    AndroidBrandon.java
// Project: CSIS3101 Assignment 9 
// Author:  Brandon Catalano 
// History: Version 1.0 3/24/2022
public class AndroidBrandon extends SmartPhone {
	private int noOfLangSupport;
	private double virtualCSFee;
	AndroidBrandon(String mak,String mod, String serialnum, int time, double fee, int langNum, double virtFee){
		super(mak ,mod ,serialnum ,time ,fee);
		virtualCSFee=virtFee;
		noOfLangSupport=langNum;	
	}
	
	AndroidBrandon(){
		super();
		noOfLangSupport=5;
		virtualCSFee=0.00;
	}
	public int getNoOfLangSupport() {
		return noOfLangSupport;
	}
	public void setNoOfLangSupport(int noOfLangSupport) {
		this.noOfLangSupport = noOfLangSupport;
	}
	public double getVirtualCSFee() {
		return virtualCSFee;
	}
	public void setVirtualCSFee(double virtualCSFee) {
		this.virtualCSFee = virtualCSFee;
	}
	public double calculateFee() {
		double feemultiplier;
		double totalfee=0;
		double feeStorage=(noOfLangSupport-5)/10;
		if (noOfLangSupport>5)
		feemultiplier=1+feeStorage;
		else
			feemultiplier=1;
		if (feemultiplier>1.5)
			feemultiplier=1.5;
		totalfee=getBaseFee()*feemultiplier+virtualCSFee;
		return totalfee;
	}
	public String toString() {
		String retStr="Make: "+getMake()+nl+"Model: "+getModel()+nl+"Year: "+getYear()+nl+"Serial Number: "+serialNumFinder()+nl+"Total Fee: "+calculateFee()+"$";
		return retStr;

	}
}
