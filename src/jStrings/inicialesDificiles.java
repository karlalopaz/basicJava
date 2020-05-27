package jStrings;

import libs.Input;

public class inicialesDificiles {
    public static void main(String[] args) {
        System.out.println("Nombre completo");
        String nombreTrim = Input.get_string().trim();
        String[] nombre = nombreTrim.split("\\s+");
        for (int i = 0; i < nombre.length; i++)
        {
            String mayusNombre = nombre[i].toUpperCase();
            System.out.println(mayusNombre.charAt(0));
        }
    }
}
