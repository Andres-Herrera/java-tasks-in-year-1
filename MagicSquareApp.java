/**   magic square
 *    @authors:Andres Herrera
 *    @version 08/03/2017
 */

import java.util.*;
public class MagicSquareApp
{
	
	public static void main(String[] args)
	{
		char [] [] magicSquare= //esta declaracion de array se usa para rellenar los campos de la array directamente, lo ponemos usando esa estructura
								//para veisualizarla mas facil y entender que es una array de 4 columnas y 4 filas
								{
								{'P','R','E','Y'},
								{'L','A','V','A'},
								{'O','V','E','R'},
								{'T','E','N','D'},
					
								};
		
	//llamamos al metodo displaySquare para que nos muestre la array en la pantalla				
	squareDisplay(magicSquare);		
	displayRow(magicSquare, 2);
	displayColumn(magicSquare, 4);
		
	}
	//aqui declaramos el metodo displaySquare
	//lo que hacemos es decir que recibimos un array 2d(dos dimensiones) como parametros, ya que eso es lo que hemos creado en el main method.
	//
	
	 static void squareDisplay(char [][] arrayIn)
	{
		for (int row=0; row<arrayIn.length;row++)//la declaracion arrayIn.length hace referencia a el Row, es decir a la fila.
		{
		
			for(int column=0;column<arrayIn[0].length;column++)//la declaracion arrayIn[0].length hace referencia a la columna
			{
				System.out.print(arrayIn[row][column]);
			
			}
		System.out.println();		
		}
		System.out.println("\n\n");
	}
	//Este metodo muestra en la pantalla la palabra que se encuentra en la fila (row) que le digamos.
	
	static void displayRow(char[][] arrayIn, int rowIn)
	{
		for (int column=0; column <arrayIn[0].length;column++)	//aqui el loop empieza a imprimir una por una las letras que se encuentran en la row2 (ponemos rowIn-1 por 
		                                                        //cuestiones de index, ya que el index empieza desde cero)
		{                                                       //entonces, coge la row 2 y luego coge los valores de cada columna y los imprime en la pantalla, 
		                                                        //empiueza por la row 2, y la columna 1 e imprime la letra "L" 
			System.out.print(arrayIn[rowIn-1][column]);         //que es la que se encuentra en esa posicion, luego, se repite el loop, incrementando uno a la columna e 
			                                                    //imprime el valor que hay en la row 2 columna 2 que es 
		}                                                       //la letra "A" y asi sucesivamente hasta imprimir la palabra LAVA que se encuentra en la row w y luego sale
		                                                        // del loop.
		System.out.println("\n\n");														
																
	}															
			
	
	
	//este metodo muestra en la pantalla la palabra que se encuentra en la columna que le digamos
	static void displayColumn(char[][] arrayIn, int column)
	{
		for( int row=0;row<arrayIn[0].length;row++)
		{
			System.out.println(arrayIn[row][column-1]);
		}
	System.out.println("\n\n");		
	}
	
}	

