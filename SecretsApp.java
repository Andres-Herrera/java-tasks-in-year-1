/**   Program to display secrets depending on level of security
 *    @author Andres Herrera
 *    @version 02/11/2016
 */
import java.util.*;

public class SecretsApp
{
	
	public static void main(String[] args)
	{
		char level=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("***Secrets App***\n\n\n");
		
		
		
		System.out.print("Security Levels: 1, 2 or 3\n\nPlease enter your security level: ");
		level= sc.next().charAt(0);
		
		switch (level)
		{
			case '3': System.out.println("-The PM is an alien\n\n");
			
			
			case '2': System.out.println("-There is a secret room in the basement\n\n");
		
			
			case '1': System.out.println("-The security guard is a robot\n\n");
			break;
			
			default: System.out.println("NO SUCH LEVEL\n\n");
			
			
		}
		
	System.out.println("END OF PROGRAM\n\n");
	}	
}
