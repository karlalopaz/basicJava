package iLoops;

//Escriba un programa que escriba la letra de la cancion de los elefantes,
//hasta que sean 100 elefantes.
//Ejemplo:
//1 elefante se columpiaba sobre la tela de una araña,
//como veia que resistia, fue a llamar a otro elefante

import libs.Input;

public class CancionElefantes {
    public static void main(String[] args) {
        int numelefan = 1;
        String manyelefan, columpi, veia, resist, fueron;
        while (numelefan <= 100) {
            if(numelefan >1) {
                    manyelefan= "s";
                    columpi= "n";
                    veia = "n";
                    resist = "n";
                    fueron = "ron";
            }
            else {
                manyelefan = "";
                columpi = "";
                veia = "";
                resist = "";
                fueron = "";
            }
            System.out.println(numelefan + " elefante" +manyelefan + " se columpiaba" + columpi + " sobre la tela de una araña, como veía" + veia + " que resistia" + resist + " fue" + fueron + " a llamar otro elefante");
            numelefan ++;
        }
    }
}
