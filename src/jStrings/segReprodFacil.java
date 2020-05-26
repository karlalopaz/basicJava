package jStrings;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import libs.Input;

public class segReprodFacil {
    public static void main(String[] args) {
        String duracionVideo = "00:00";
        System.out.println("Favor de proporcionar la duracion de la cancion ");
        duracionVideo = Input.get_string();
        String [] minutos = duracionVideo.split(":");
        int MinConvertidos = Integer.parseInt(minutos[0]);
        int SegConvertidos = Integer.parseInt(minutos[1]);
        int Resultado = (MinConvertidos * 60) + SegConvertidos;
        System.out.println("El total de duracion es: " + Resultado);
    }
}
