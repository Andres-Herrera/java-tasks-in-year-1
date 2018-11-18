/**   Program to calculate tax
 *    @author Andres Herrera
 *    @version 08/12/2016
 */

import java.util.*; 
		
public class FindCostApp
{
   public static void main(String[ ] args )       
   {
		Scanner kbd= new Scanner(System.in); 
		double price, tax;
		
		displayTitle();
		
		System.out.print("Enter initial price: "); 
		price = kbd.nextDouble(); 
		
		System.out.print("Enter tax rate: ");
		tax = kbd.nextDouble(); 
		
			
		price=calculateFinalPrice(price, tax);
		
	
		
		displayPrice(price);
    }
    
     static void displayTitle(){
    
    System.out.println("*** Product Price Check ***");
    }
    
     static void displayPrice(double priceIn){
    	System.out.println("Cost after tax = " + priceIn); 
    	
    }
    
     static double calculateFinalPrice(double priceIn, double taxIn){
    	
    	
    	return priceIn * (1+ taxIn/100);
    		
    }
}