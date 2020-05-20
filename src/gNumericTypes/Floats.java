package gNumericTypes;

import libs.Input;

public class Floats {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); // imprime "x is"
	    float x = Input.get_float(); // guarda el valor de x solicitado
	    
	    // prompt user for y
	    System.out.print("y is "); // imprime "y is"
	    float y = Input.get_float(); // guarda el valor de y solicitado
	    
	    // perform division for user
	    System.out.print(x + " divided by " + y + " is " + ( x / y) + "\n"); // imprime el valor de x dividiendo el valor de y. resultado
	}
}


