/**   temperature reading
 *    @authors:Andres Herrera
 *    @version 28/11/2015
 */

import java.util.*;

public class TemperatureReadingsApp
{
	 public static void main(String[] args)
	 {
	     double[ ] temperature = new double[7]; 
	     enterTemps(temperature); 
	     displayTemps(temperature, false); 
	     wasHot(temperature);
	     convertToFarenheit(temperature);
	     displayTemps(temperature,true);
	     
	    double itsHot = hottestTemperature(temperature);
	     
	    System.out.println("\n***HOTTEST TEMPERATURE***\n"+itsHot+" farenheit or "+((itsHot-32)*5/9)+" celcius");
	 }
	
	 static void enterTemps(double[] temperatureIn)
	 {
	     Scanner keyboard = new Scanner(System.in);
	     for (int i = 0; i < temperatureIn.length; i++)
	     {
	         System.out.print("enter max temperature for day " + (i+1)+ ": ");
	         temperatureIn[i] = keyboard.nextDouble();
	     }
	 }
	
	 static void displayTemps(double[] temperatureIn, boolean c_o_f)
	 {
	     System.out.println(); 
	     if(!c_o_f)
	     {
	    	 System.out.println("***TEMPERATURES ENTERED (CELCIUS)***");
	     }
	     else
	     {
	     	System.out.println("***TEMPERATURES ENTERED (FARENHEIT)***");
	     }
	     for (int i = 0; i < temperatureIn.length; i++)
	     {
		      System.out.println("day "+(i+1)+" "+ temperatureIn[i]);
	     }
	 }
	 
	 static void wasHot(double[] temperatureIn)
	 {
	 	System.out.println("\n****TEMPERATURES OVER 18****");
	 	for(int i = 0; i < temperatureIn.length; i++) 
	 	{
	 		if(temperatureIn[i] >= 18)
	 		{
	 			System.out.println("day "+(i+1)+" "+ temperatureIn[i]);
	 		}
	 	}
	 }
	 
	 
	 static void convertToFarenheit(double[] tempsIn)
	 {
	 	for (int i=0; i< tempsIn.length;i++)
	 	{
	 		tempsIn[i]= (tempsIn[i]*9/5)+32;
	 	}
	 }
	 
	 static  double hottestTemperature(double[] tempIn)
	 {
	 	double hottestTemp=0.0;
	 	for (int i=0; i< tempIn.length;i++)
	 	{
	 		if(tempIn[i]> hottestTemp)
	 		{
	 			hottestTemp= tempIn[i];
	 		}
	 	}
	 	System.out.println(hottestTemp);
	 	return hottestTemp;
	 }
}

