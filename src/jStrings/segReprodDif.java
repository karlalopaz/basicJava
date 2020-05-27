package jStrings;

import libs.Input;

public class segReprodDif {
    public static void main(String[] args) {
        //Dada la duracion de una cancion en segundos, obtenga el numero de minutos y segundos en el formato del ejemplo
        //
        //Ejemplo:
        //Duracion en segundos: 360
        //La cancion dura 6 minutos y 0 segundos
        System.out.println("Favor de proporcionar la duracion de la cancion en segundos");
        double duracionCancionSeg = Input.get_int();
        double resultadoMinutos = duracionCancionSeg / 60;
        System.out.println("la duracion de la cancion es: " + resultadoMinutos + " minutos ");



    }
}
