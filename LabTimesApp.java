/**   Program using methods
 *    @author Andres Herrera
 *    @version 01/12/2016
 */
import java.util.*;

public class LabTimesApp
{
  public static void main(String[] args)
  {
	char choice;
	Scanner sc = new Scanner (System.in);
	do
	{
		printTitle();

		displayMenu();

		System.out.print("Enter choice [1-5]: ");
		choice = sc.next().charAt(0);

	processChoice(choice);
	
		System.out.println();
	} while (choice != '5');
  }

  // menu choices implemented as methods
  static void group1( )
  {
	System.out.println();
	System.out.println("GROUP 1");
	System.out.println("Thursday, 11-1, ITC01");
	System.out.println();
  }

  static void group2( )
  {
	System.out.println();
	System.out.println("GROUP 2");
	System.out.println("Thursday, 11-1, ITC04");
	System.out.println();
  }

  static void group3( )
  {
	System.out.println();
	System.out.println("GROUP 3");
	System.out.println("Friday, 11-1, ITC14");
	System.out.println();
  }

  static void group4( )
  {
	System.out.println();
	System.out.println("GROUP 4");
	System.out.println("Friday, 11-1, ITC03");
	System.out.println();
  }
  
  
  static void printTitle()
  {
  	System.out.println("*** CN4102 Lab Times ***");
		System.out.println();
  }
  
  static void displayMenu()
  {
  	    System.out.println("[1] GROUP 1");
		System.out.println("[2] GROUP 2");
		System.out.println("[3] GROUP 3");
		System.out.println("[4] GROUP 4");
		System.out.println("[5] QUIT");
		System.out.println();
  }
  
  static void processChoice(char choiceIn)
  {
  
  	
  	switch(choiceIn)
		{
		   // call methods
		   case '1': group1(); break;
		   case '2': group2(); break;
		   case '3': group3(); break;
		   case '4': group4(); break;
		   case '5': System.out.println("Goodbye"); break;
		   default: System.out.println("Error: 1-5 only");
		}
  }
}
