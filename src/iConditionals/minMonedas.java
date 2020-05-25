package iConditionals;

//1.  pedir al usuario cuanto es el cambio en fraccion.
//2.  tener un acumulador de monedas
//3.  tener un contador del resto de cambio sobrante
//4.  dividir por la moneda de 25c, sacar cuantas monedas de 25c necesito, y sumarlas al acumulador.
//5.  sacar el residuo para obtener el resto de cambio sobrante.
//6.  dividir por la moneda de 10c. sacar.........
//7.  repetir el paso 5 con la moneda de 10c
//8.  repetir el paso 4 con la moneda de 5c
//9   repetir el paso 5 con la moneda de 5c
//10. repetir el paso 4 con la moneda de 1c
//11. repetir el paso 5 con la moneda de 1c
//12  imprimir el numero de monedas en el acumulador.

import libs.Input;

public class minMonedas {
    public static void main(String[] args) {
        float cambio;
        float acumonedas;
        float contcambio;
        System.out.println("Cuanto es el cambio?");
        cambio= Input.get_int();


    }
}
