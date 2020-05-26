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


//encontrar cuantas monedas puedes dar de cambio de tal manera no le tengas que dar todas las monedas que tienes en tu caja
//Agarro el cambio y saco la cantidad de monedas de 25C 10c, 5c y 1c debo entregar. Hacer resta de

//ejemplo 1.50 es el cambio ese lo multimplico por 100
// if el resultado es mayor a 25
    //ese resultado lo divido entre 25 para sacar cuantas monedas de 25 c debo entregar. y sacar el modulo de resultado%25 si el modulo es diferente de cero.
// if el resultado del modulo es mayor a 10
// if el resultado del modulo es mayor a 5
// if el resultado del modulo es mayor a 1
// en todos. se divide el resultado del modulo entre los centavos (10, 5, 1)
// imprimir el resultado de la division del entero en contador de cambio.

import libs.Input;

import java.sql.SQLOutput;

public class minMonedas {
    public static void main(String[] args) {
        float cambio = 0;
        int residuo = 0;
        System.out.println("Cuanto es tu cambio?");
        cambio= Input.get_float();
        int rescambio = (int)(cambio*100);
        if (rescambio >= 25){
            int cambioV = rescambio / 25;
            System.out.println("El total de monedas de 25c es: "+ cambioV);
            residuo = rescambio % 25;
            //System.out.println("El residuo del cambio entre 25 es: " + residuo);
            if (residuo != 0){
                int resdiez = 0;
                int rescin = 0;
                if(residuo>= 10)
                {
                    int cambioD = residuo/10;
                    System.out.println("El total de monedas de 10c es: "+cambioD);
                    resdiez = cambioD;
                }
                if(resdiez>=5)
                {
                    int cambioC = residuo/5;
                    System.out.println("El total de monedas de 5c es: "+cambioC);
                    rescin = cambioC;
                }
                if(rescin>=1)
                {
                    int cambioO = residuo/1;
                    System.out.println("El total de monedas de 1c es: "+cambioO);
                }
            }
        }
    }
}
