import models.Peliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPunto7 {

    public static void main(String[] args) {

        var lista = getList();
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese un nombe nombre: ");
        getPalabras(lista);

    }

    private static void getPalabras(List<String> lista) {
        String palabra = "";

        // Recorremos la lista de caracteres y vamos construyendo la palabra
        for (String caracter : lista) {
            if (caracter.equals(" ")) {
                // Si encontramos un espacio, imprimimos la palabra y empezamos una nueva
                System.out.println(palabra);
                palabra = "";
            } else {
                // Si no es un espacio, añadimos el caracter a la palabra
                palabra += caracter;
            }
        }

        System.out.printf(palabra);
    }

    private static List<String> getList() {
        List<String> lista = List.of("w","e","r","f","b","h","j","i","u","y","t","r","e","d","f","g","u","t"
                ,"r","e","s","d","f","g", "y","u","i","o","l","k","m","n","b","v","f","r","e","w","s","x","f","g","y","u"
                ,"i","k","m","n","b","v","f","r", "e","w","w", "r","t","y","u","i","o","k","m","n","b","v","d","w","s","x"
                ,"c","f","g","h","u","i","o","p","l","k", "n","b","v","f","d","e","w","a","z","x","c","g","h","u","i","o"
                ,"p","u","y","t","r","e","w","q","s","d","f","g", "k","j","b","v","c","x");
        return lista;
    }

}
