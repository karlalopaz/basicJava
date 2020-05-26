package jStrings;

import libs.Input;

//Implemente un programa que, dado el nombre completo de una persona, imprima las iniciales de la personas, como se muestra abajo.

public class inicialesFacil {
    public static void main(String[] args) {
        String Nombre = get_notnull_string();
        String[] nuevaCadena = Nombre.split(" ");
        for (int i= 0; i < nuevaCadena.length; i++)
        {
            System.out.println(nuevaCadena[i].charAt(0));
        }
    }
    public static String get_notnull_string()
    {
        String nombre;
        System.out.println("Escribe tu nombre");
        nombre = Input.get_string();
        while (nombre == null);
        return nombre;
    }

}
