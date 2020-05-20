package gNumericTypes;

public class Overflow {

	public static void main(String args[])
	{
		int n = 1;//inicializa el valor de n en 1
	    for (int i = 0; i < 64; i++)//hace un ciclo, inicializando i en 0, hasta que llegue a 64 y lo suma
	    {
	    	System.out.print("n: " + n + "\n"); // hasta que i sea 64 imprime el valor de n
	        n = n * 2;// multiplica el vlaor de n dos veces
	    }
	}
}



