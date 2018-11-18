

/**   Program to compare numbers
 *    @author Andres Herrera
 *    @version 27/10/2016
 */
 // import package
import java.util.*;
public class CompareApp
{
	
	public static void main(String[] args)
	{
		//declare the variables	
		int num1, num2;
		//build scanner object
		Scanner sc= new Scanner (System.in);
	
		System.out.println("*** Compare App ***\n\n");
		//enter first number
		System.out.print("please enter first number: ");
			num1= sc.nextInt();
		//enter second number	
		System.out.print("please enter second number: ");
			num2= sc.nextInt();
			
			//if num1 is equal to num2
		if (num1==num2)
				System.out.println("\n\nThe numbers you entered are equal");
				
		else
			{
			
				System.out.println("\n\nThe numbers you entered are NOT equal");
				if (num1>num2)
					System.out.println("\nThe FIRST number is BIGGER");
				else
					System.out.println("\nThe SECOND number is BIGGER");
			}					
			
			
		int result=0;	
		System.out.println("\n\nEND OF PROGRAM\n\n");
		
		System.out.println("***EXTRA CHALLENGE***");
		
		System.out.print("\n\nplease enter first number: ");
			num1= sc.nextInt();
		System.out.print("\n\nplease enter second number: ");
			num2= sc.nextInt();
		System.out.print("\n\nCan you guess the sum of these two numbers?\nPlese enter your answer: ");
			result= sc.nextInt();
			if(num1+num2==result)
				System.out.println("\n\nCongratulations, your anwer is correct\n\n");
				
			else
				System.out.println("\n\nSorry, your answer is not correct");	
					
			
	}	
}
