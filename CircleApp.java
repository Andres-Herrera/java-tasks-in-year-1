
import java.util.*;

/**   Program to process circle calculations
 *    @author Andres Herrera
 *    @version 20/10/2016
 */
public class CircleApp
{
	
	public static void main(String[] args)
	{
		
		
		// variable declarations
		double radious, diameter, area;
		final double PI= 3.142;
		
		// Declaration of the new object Scanner
		Scanner sc= new Scanner (System.in);
		
		System.out.println("*** CIRCLE APP ***\n");
		
		System.out.print("Please enter radious: ");
		radious= sc.nextDouble();
		//Calculate diametre
		diameter= 2*radious;
		//Display diametre
		System.out.println("\nThe diametre is: " + diameter);
		//Calculate area
		area= PI*(radious*radious);
		//Display area
		System.out.println("\nThe area is: " + area);
		
		
		System.out.println("\nEND OF PROGRAM\n");
		
		
		
	}	
}
