// File:    IntBufferBrandon.java
// Project: CSIS3101 Assignment 8
// Author:  Brandon Catalano 
// History: Version 1.0 3/15/2022
import java.util.Random;
public class IntBufferBrandon {
	private Random rand= new Random();
	private int buffer[];
	private int numberOfValues;
	private int BUFFER_SZ=8;

	public boolean addRandom() {
		if (numberOfValues<this.buffer.length) {
		this.buffer[numberOfValues]= rand.nextInt(900)+100;
		numberOfValues++;
		return true;
	}
		else
			System.out.println("Buffer array is full. Cannot add new value.");
			return false;
	}
	IntBufferBrandon(){
		numberOfValues=0;
		buffer=new int[BUFFER_SZ];
	}
	IntBufferBrandon(int n){
		numberOfValues=0;
		buffer = new int[n];
	}
	public int getNumberOfValues() {
		return this.numberOfValues;
	}
	public void printToConsole() {
		System.out.print("{");
		
		for (int i=0; i<this.numberOfValues; i++) {
			System.out.print(buffer[i]);
			
			if (i<this.buffer.length-1)
			System.out.print(",");
			
		}
		System.out.println("}");
	}
}
