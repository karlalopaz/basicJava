package gNumericTypes;

import libs.Input;

public class BotellasAgua {

    //crear la clase
    // crear el metodo main
    // pedir al usuario el numero de minutos
    // hacer el calculo
    // imprimir resultado

    public static void main(String[] args) {
        System.out.println("Proporcioname el numero de minutos que duras bañandote");
        int minutos = 1;
        minutos = Input.get_int();
        System.out.println("El numero de botellas que gastas al bañarte son: "+ minutos * 12);
    }

}
