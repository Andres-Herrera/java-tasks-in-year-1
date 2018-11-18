
/**   Program to display times table of a given number
 *    @author Andres Herrera
 *    @version 10/11/2016
 */
import java.util.*;
public class TimesTableApp
{
	
	public static void main(String[] args)
		
		
	{
		
		Scanner sc= new Scanner (System.in);
		
		int num=0;
		System.out.print("Please enter a number to see its Times Table: ");
		num= sc.nextInt();
		
		for(int a=1; a<=12;a++)
		{
		System.out.println(a + "x" + num +"= " + a*num);	
		}
		
		System.out.println("\n...END OF PROGRAM");
		
		
		
		
		System.out.println("\nEXTRA CHALLENGE\n\n");
		
		for (int x=1; x<=5; x++)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print("*");
			}
			System.out.println("");
				
		}
		
		
		
		
			for (int x=5; x>=1; x--)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print("*");
			}
			System.out.println("");
				
		}
		
		
		
		
		System.out.println("\n");
		
		for(int x=1;x<=4;x++)
		{
			if(x<=2)
			{
				System.out.println("***");
			}
			else
				System.out.println("******");
		}
		System.out.println();
	
	}	
}
