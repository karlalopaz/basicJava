package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		float f = Input.get_float(); //pide ingresar el valor de f, sin imprimir en pantalla la pregunta
		
		float f2 = Input.get_float();//pide ingresar el valor de f2, sin imprimir en pantalla la pregunta
		
		Input.print("f/f2 = " + (f/f2)); //imprime el valor de la division de f entre f2

	}

}
