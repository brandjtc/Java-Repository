//File:	IntArrayBrandon.java
//Poject: CSIS3101 Assignment
//Author: Brandon Catalano
//History: Version 1.0 2/25/2022


import java.util.*;
public class IntArrayBrandon {
//Attributes and always declared private
	private int[] aray;
//Arg constructor
	IntArrayBrandon(int length){
		aray = new int[length];
}
//Arg constructor
	IntArrayBrandon(int[] inpArray){
		aray = inpArray;
}
//Getter for length
	private double getlength() {
		double returnVal =aray.length;
		return returnVal;
	}

//Prints out array using for loop.
	public void printLiteralBrandon() {		
			
		System.out.print("{");
			
			for (int i=0; i<this.getlength(); i++) {
				System.out.print(aray[i]);
				
				if (i<this.getlength()-1)
				System.out.print(",");
				
			}
			System.out.println("}");
	}
	
	public int sumArrayBrandon() {
		
		int sum = 0;
		
		for (int i=0; i<this.getlength(); i++) {
			sum+=aray[i];
		}
		return sum;
	
	}
	public int maxArrayBrandon() {
		int max=0;
		try {
		max = aray[0];
		int maxTest = 0;
		for (int i=0; i<this.getlength(); i++) {
			maxTest=aray[i];
			if (maxTest>max)
				max=maxTest;
		}}
		catch(Exception ArrayIndexOutOfBoundsException){
		}
		
		return max;
	}
	public int minArrayBrandon() {
		int min = 0;
		try {
		min = aray[0];
		int minTest = 0;
		for (int i=0; i<this.getlength(); i++) {
			minTest=aray[i];
			if (minTest<min)
				min=minTest;
		}}
		catch(Exception ArrayIndexOutOfBoundsException){
		}
		return min;
	
	}
	public int rangeArrayBrandon() {
		int range= this.maxArrayBrandon()-this.minArrayBrandon();
		return range;
	}
	public double avgArrayBrandon() {
		double avg= this.sumArrayBrandon()/this.getlength();
		return avg;
	}
	public void clipArrayBrandon(int clipNum) {
		for (int i=0; i<this.getlength(); i++) {
			if (aray[i]>clipNum)
				aray[i]=clipNum;
		}
		
	}
}