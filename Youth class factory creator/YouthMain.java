// File:    YouthMain.java
// Project: CSIS3101 Assignment 8
// Author:  Brandon Catalano 
// History: Version 1.0 4/3/2022
import java.util.ArrayList;

public class YouthMain {
	public static void main(String[] args) {         
        ArrayList<Youth> youthList = new ArrayList<Youth>();
        //Test cases for all youth languages
        
        Youth testChild1 = new YouthGermanBrandon("Gute","Luten");
        Youth testChild2 = new YouthDutchBrandon("Dutchman","Man");
        Youth testChild3 = new YouthCroationBrandon("Sauer","Croat");
        Youth testChild4 = new Youth("Brandon","Catalano");
       youthList.add(testChild1);
       youthList.add(testChild2);
       youthList.add(testChild3);
       youthList.add(testChild4);
         // Register new Youth                            
       youthList.add(YouthFactory.getYouthInstance("Mary", "Smith",""));         
       youthList.add(YouthFactory.getYouthInstance("Jaap","Krajick", "Dutch"));         
       youthList.add(YouthFactory.getYouthInstance("Heidi", "Klum","German"));         
       youthList.add(YouthFactory.getYouthInstance("Jean", "VanDamme","Croation"));
       youthList.add(YouthFactory.getYouthInstance("Billy","Bob","englis but spelled wrong"));
       youthList.add(YouthFactory.getYouthInstance());
   // Bed time sequence         
   System.out.println("Time to finish fun and retire to your rooms!");         
    for (int i = 0; i < youthList.size(); i++) 
    {             
            Youth visitor = youthList.get(i);             
         System.out.println("  " + visitor.greetGoodNight());         
   }        
   // Wake up sequence         
   System.out.println("Time for wake up and venture out!");         
   for (Youth visitor : youthList) 
   {             
           System.out.println("  " + visitor.greetGoodMorning());         
  }  
} 
}
