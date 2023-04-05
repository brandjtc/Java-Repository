//File:	IACatalanoTest.java
//Poject: CSIS3101 Assignment
//Author: Brandon Catalano
//History: Version 1.0 2/26/2022


import java.util.*;
public class IACatalanoTest{

public static void main(String[] args) {
int [] arr0= { -2,-1 }; 
int [] arr1= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
int [] arr2 = { 2, 4, 6, 8, 10, 12, 14, 16, 7, 6, 22, 8, 9, 16, 
5, 2, 7, 8, 12, 2, 0, 14, 17, 19, 22 }; 
    IntArrayBrandon A1 = new IntArrayBrandon ( arr0 );
IntArrayBrandon A2 = new IntArrayBrandon ( arr1 );
IntArrayBrandon A3 = new IntArrayBrandon ( arr2 );
testDataBuffer( A1 ); 
testDataBuffer( A2 ); 
testDataBuffer( A3 );
}
 
public static void testDataBuffer( IntArrayBrandon A ) { 
A.printLiteralBrandon(); 
System.out.println("Sum of Array: " + 
A.sumArrayBrandon());
System.out.println("Max of Array: " + 
A.maxArrayBrandon ());
System.out.println("Min of Array: " + 
A.minArrayBrandon ());
System.out.println("Range of Array: " + 
A.rangeArrayBrandon ());
System.out.println("Mean value of Array: " + 
A.avgArrayBrandon()); 
Scanner inp = new Scanner( System.in);
System.out.print("Enter an  integer to clip the array with: ");
int clipNum = inp.nextInt();
A.clipArrayBrandon( clipNum );
A.printLiteralBrandon();     
}
}