package models;

import java.util.Objects;

public class CatalogoPelicula {

    private String nombre;
    private String autor;

    public CatalogoPelicula() {
    }

    public CatalogoPelicula(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatalogoPelicula that = (CatalogoPelicula) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(autor, that.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor);
    }

    @Override
    public String toString() {
        return "CatalogoPelicula{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

}
