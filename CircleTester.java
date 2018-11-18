/**   Program to test the Circle class
 *    @author Andres Herrera
 *    @version 09/02/2017
 */
 
import java.util.*;
public class CircleTester
{
	
	public static void main(String[] args)
	{
		System.out.println("PI= " + Circle.PI);
		
		Circle c1= new Circle(4.5);
		
		System.out.println("Radius for c1 is: "+ c1.getRadius());
		
		c1.setRadius(18);
		
		System.out.println("The new redius for c1 is: " + c1.getRadius());
		
		System.out.println("The area for c1 is: " + c1.calculateArea());
		
		System.out.println("The circumference for c1 is: " + c1.calculateCircumference());
		
		Scanner sc= new Scanner(System.in);
		
	    double userInput;
	    System.out.print("please enter the radius: ");
	    userInput= sc.nextDouble();
	    
	    c1.setRadius(userInput);
	    System.out.println("The circle that you created has the following attributes:");
	    System.out.println("-Radius: " + c1.getRadius());
	    System.out.println("-Area: " + c1.calculateArea());
	    System.out.println("-Circumference: " + c1.calculateCircumference());
		
	
	}	
}
