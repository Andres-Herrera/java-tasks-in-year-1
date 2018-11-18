/**   run testing app
 *    @authors:Andres Herrera
 *    @version 08/03/2017
 */
public class RunTestingApp
{
	
	public static void main(String[] args)
	{
	  Rectangle r1= new Rectangle(0,12);//creamos un objeto de la clase rectangle
	  Rectangle r2= new Rectangle(20,12);//creamos un objeto de la clase rectangle
	  
	  TestingApp.test(r1);//llamamos al metodo test() que es estatitico por eso lo podemos llamar directamente y testeamos si el objeto que creamos es valido
	  //pasa saber como funciona, debemos ir a la clase rectangulo y ver que pusimos como condiciones para validar un objeto creado
	  TestingApp.test(r2);
	 
	  
	  BankAccount acc1= new BankAccount("1234560", "Andres");//creamos un banckaccount object
	  BankAccount acc2= new BankAccount("12345", "Andres2");
	  TestingApp.test(acc1);
	  TestingApp.test(acc2);
	  
	  
	}
		
}

