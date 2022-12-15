import models.CatalogoPelicula;

import java.text.ParseException;
import java.util.Scanner;

public class MainCatalogoPelicula {
    public static void main(String[] args) throws ParseException {


        Scanner sc = new Scanner (System.in);
        var pelicula = new CatalogoPelicula();
        System.out.println("Ingrese un nombe pelicula: ");
        pelicula.setNombre(sc.nextLine());
        System.out.println("Ingrese nombre del autor: ");
        pelicula.setAutor(sc.nextLine());

        getMostrar(pelicula);


    }

    private static void getMostrar(CatalogoPelicula pelicula) {
        System.out.printf("Nombre " +  pelicula.getNombre() +
                "\nAutor: " + pelicula.getAutor());
    }

}