/**   vending
 *    @authors:Andres Herrera
 *    @version 08/04/2017
 */

import java.util.*;
public class vendingApp
{
	
	public static void main(String[] args)
	{
		
	System.out.println("***VENDING APP***");	
		
	System.out.println("Welcome, \nPlease choose one of the options below:\n\n");
	
	System.out.println("[1] Get gum");
	System.out.println("[2] Get chocolate");
	System.out.println("[3] Get popcorn");
	System.out.println("[4] Display total sold so far");
	System.out.println("[5] Quit");
	
	Scanner sc= new Scanner (System.in);
	int x;
	System.out.println("Enter your choice");
	x = sc.nextInt();
	
	switch (x)
	{
		case 1: System.out.println("Here is your gum");break;
		
		case 2: System.out.println("Here is your chocolate");break;
		
		case 3: System.out.println("Here is your popcorn");break;
		
	}

	
	
	
	
		
	}	
}
