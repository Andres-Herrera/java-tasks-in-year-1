/**   code name app
 *    @authors:Andres Herrera
 *    @version 08/12/2016
 */

import java.util.*;
public class CodeNameApp
{
	
	public static void main(String[] args)
	{
	
	Scanner sc= new Scanner (System.in);
	
	String codeName, confirm;
	
	

	
	System.out.print("please enter your code name: ");
	codeName= sc.next();
	

	while (codeName.length()<=6)
	  
	    {

		System.out.println("Invalid name, please enter your code name using at least 6 characters.");
		
		System.out.print("please enter your code name: ");
     	codeName= sc.next();
		}
	do
		{
		
  			System.out.print ("please re-enter yout code name: ");
		
			confirm= sc.next();
		
			if (codeName.equals(confirm))
			
			System.out.println("code name confirmed");
			
			else
				System.out.println("CODE NAME MIS-MATCH");
		}
		while (codeName.equals(confirm)== false);
	}	
}
