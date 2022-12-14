import models.Peliculas;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MainPelicula {
    public static void main(String[] args) throws ParseException {


        Scanner sc = new Scanner (System.in);
        var pelicula = new Peliculas();

        System.out.println("Ingrese un nombe nombre: ");
        pelicula.setNombre(sc.nextLine());

        System.out.println("Ingrese nombre del autor: ");
        pelicula.setAutor(sc.nextLine());

        Date date = new Date();
        pelicula.setFechaPublicacion(date);

        getMostrar(pelicula);


    }

    private static void getMostrar(Peliculas pelicula) {
        System.out.printf("Nombre " +  pelicula.getNombre() +
                "\nAutor: " + pelicula.getAutor() +
                "\nFecha Publicación: "+ pelicula.getFechaPublicacion());
    }

}