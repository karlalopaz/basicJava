package jStrings;

import libs.Input;

public class cifradoCesar {
    public static void main(String[] args) {
        //Recorrer el mensaje
        //tomar la letra
        //sumar la clave
        //si la suma es mayor de 90, le resto 26
        //convertir la suma en caracter e imprimirla -- ex: suma = 76, ((char) suma) char encriptado = (char)('a')+12;
        // agarro el caracter actual que es igual al mensaje

        String mensaje;
        System.out.println("Escribe tu mensaje: ");
        mensaje = Input.get_string();
        System.out.println("Cual es la clave");
        int clave = Input.get_int();
        clave%= 26; //delimita la clave a 26... cualquier numero le saca el modulo y esa es la nueva clave.
        for (int i = 0, n = mensaje.length(); i < n; i++) {

            char actual = mensaje.charAt(i);
            int suma = actual + clave;

            if (suma > 90)
            {
                int temp1 =suma- 26;
                System.out.print((char) temp1);
            } else if (suma < 90)
            {
                System.out.print((char) suma);
            }
        }

    }
}