package models;


import java.util.Date;
import java.util.Objects;

public class Peliculas {

    private String nombre;
    private String autor;
    private Date fechaPublicacion;

    public Peliculas() {
    }

    public Peliculas(String nombre, String autor, Date fechaPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }


    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peliculas peliculas = (Peliculas) o;
        return Objects.equals(nombre, peliculas.nombre) && Objects.equals(autor, peliculas.autor) && Objects.equals(fechaPublicacion, peliculas.fechaPublicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor, fechaPublicacion);
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                '}';
    }
}
