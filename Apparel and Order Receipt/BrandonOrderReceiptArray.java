// File:    BrandonOrderReceiptArray.java
// Project: CSIS3101 Assignment 7
// Author:  Brandon Catalano 
// History: Version 1.3 3/10/22
public class BrandonOrderReceiptArray {

	public static void main(String[] args) {      
		double dTotalCost = 0.0;         
		int iTotalWeight = 0;  
		Apparel apparel1 = new Apparel(8.99, 27, "Large", "Denim Jacket");        
	    Apparel apparel2 = new Apparel(10.49, 15, "Medium","Track Pants");      
	    Apparel apparel3 = new Apparel(99.99, 35, "Small","Cashmere Sweater");      
	    Apparel apparel4 = new Apparel(5.91, 7, "X-Large","Woolen Socks");
		//Declaration and filling of Apparel class array.
		Apparel array[]=new Apparel[4];
		array[0]=apparel1;
		array[1]=apparel2;
		array[2]=apparel3;
		array[3]=apparel4;
		array[3].setQuantity(2);
		// Show the details of the order using show()         
		    System.out.println("Here are your shopping cart contents.");
		    for (int i=0; i<array.length;i++) {
		System.out.println(array[i]);         
		    }
		// Compute the total Cost and total weight in this section    
		    for (int i=0; i<array.length;i++) {
		    	dTotalCost += array[i].getOrderCost();
		    }
		    for (int i=0; i<array.length;i++) {
		    	iTotalWeight += array[i].getOrderWeightInOunces();  
		    }
		// Here we show the order details        
		System.out.println("The Cost of your order is $" + 
		dTotalCost);         
		System.out.println("The shipping weight is " + 
		iTotalWeight / 16  + " pounds " + iTotalWeight %16 + " ounces");     
		}
		// End of Main

}
