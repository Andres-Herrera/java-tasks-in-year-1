/**   class to create vehicle objets
 *    @author Andres Herrera
 *    @version 23/02/2017
 */
public class SecondHandVehicle extends Vehicle
{
	//declare number of owners
	private int numberOfOwners;
	
	//create constructor
	public SecondHandVehicle (String regNoIn, String makeIn, 
		int yearOfManufactureIn, double valueIn, int numberOfOwnersIn)
	{
		super(regNoIn, makeIn, yearOfManufactureIn, valueIn);
		numberOfOwners = numberOfOwnersIn;
    }
    
    public int getNumberOfOwners()
    {
    	return numberOfOwners;
    }

	public void sellVehicle(double valueIn)
	{
		
		numberOfOwners++;
		setValue(valueIn);
			
	}









}