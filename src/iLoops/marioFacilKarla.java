package iLoops;

import libs.Input;
//Implementa un programa que imprima una media piramide de una altura especificada por el usuario, como abajo:

public class marioFacilKarla {
    public static void main(String[] args) {
        int altura = 0;
        System.out.println("Proporcionar la altura");
        altura = Input.get_int();
        int base= altura + 1;
        int caractGato = 1;
        int caractVacios = 0;

        for (int pira = 0, n = altura; pira < n; pira++)
        {
            caractVacios = base - caractGato;
            crearLinea(caractGato,caractVacios);
            caractGato = caractGato + 1;
        }
    }

    private static void crearLinea(int caractGato, int caractVacios)
    {
        String linea = "";
        for (int i=0; i< caractVacios; i++)
        {
            linea = linea + " ";
        }
        for (int i=0; i< caractGato; i++)
        {
            linea = linea + "#";
        }
        System.out.println(linea);
    }

}
