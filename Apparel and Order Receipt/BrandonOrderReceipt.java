// File:    BrndonOrderReceipt.java
// Project: CSIS3101 Assignment 7
// Author:  Brandon Catalano 
// History: Version 1.0 3/10/22
public class BrandonOrderReceipt {
	public static void main(String[] args) {      
		double dTotalCost = 0.0;         
		int iTotalWeight = 0;  
		// Put the 4 apparels being ordered in apparel1 through apparel 4         
		Apparel apparel1 = new Apparel(8.99, 27, "Large", "Denim Jacket");        
		    Apparel apparel2 = new Apparel(10.49, 15, "Medium","Track Pants");      
		    Apparel apparel3 = new Apparel(99.99, 35, "Small","Cashmere Sweater");      
		    Apparel apparel4 = new Apparel(5.91, 7, "X-Large","Woolen Socks");    
		    apparel4.setQuantity(2);
		// Show the details of the order using show()         
		    System.out.println("Here are your shopping cart contents.");         
		System.out.println(apparel1);         
		System.out.println(apparel2);
		System.out.println(apparel3);
		System.out.println(apparel4);
		// Compute the total Cost and total weight in this section        
		dTotalCost += apparel1.getOrderCost();         
		dTotalCost += apparel2.getOrderCost();         
		dTotalCost += apparel3.getOrderCost();         
		dTotalCost += apparel4.getOrderCost();         
		iTotalWeight += apparel1.getOrderWeightInOunces();        
		iTotalWeight += apparel2.getOrderWeightInOunces();         
		iTotalWeight += apparel3.getOrderWeightInOunces();         
		iTotalWeight += apparel4.getOrderWeightInOunces();   
		// Here we show the order details        
		System.out.println("The Cost of your order is $" + 
		dTotalCost);         
		System.out.println("The shipping weight is " + 
		iTotalWeight / 16  + " pounds " + iTotalWeight %16 + " ounces");     
		}
		// End of Main
}
