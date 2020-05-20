package gNumericTypes;

import libs.Input;

public class Ints {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is ");// imprime "x is"
	    int x = Input.get_int();// guarda el valor de x
	    
	    // prompt user for y
	    System.out.print("y is ");// imprime "y is"
	    int y = Input.get_int();// guarda el valor de y
	    
	    // perform calculations for user
	    System.out.print(x + " plus " + y + " is " + (x + y) + "\n");// imprime el resultado de la suma de x + y
	    System.out.print(x + " minus " + y + " is " + (x - y) + "\n");// imprime el resultado de la resta de x - y
	    System.out.print(x + " times " + y + " is " + (x * y) + "\n"); // imprime el resultado de la multiplicacion
	    System.out.print(x + " divided by " + y + " is " + (x / y) + "\n");// imprime el resultado de la division
	    System.out.print("The reminder of " + x + " over "+ y + " is " + (x % y) + "\n");//imprime el resulado del modulo
	}
}


