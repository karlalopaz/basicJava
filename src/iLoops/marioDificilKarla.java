package iLoops;

import libs.Input;

public class marioDificilKarla {

    public static void main(String[] args) {
        System.out.println("Proporcionar la altura");
        int altura = Input.get_int();
        int base= altura + 1;
        int caractGato = 1;
        int caractVacios = 0;

        for (int pira = 0; pira < altura; pira++)
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