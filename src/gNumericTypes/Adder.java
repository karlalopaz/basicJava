package gNumericTypes;

import libs.Input;

public class Adder {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is: "); // funcion para imprimir en consola
	    int x = Input.get_int(); //pide el valor para guardarlo en la variable x
	    
	    // prompt user for y
	    System.out.print("y is: ");// funcion para imprimir en consola
	    int y = Input.get_int(); //pide el valor para guardarlo en la variable y
	    
	    // calculate sum for user
	    System.out.println("sum is " + (x + y) + "\n");   // imprime la suma de x + y en pantalla con el texto
	}
}