package com.example.maspelis;

public class Pelicula {

    private String imagenPelicula;
    private String nombrePelicula;
    private String urlPelicula;

    public String getImagenPelicula() {
        return imagenPelicula;
    }

    public void setImagenPelicula(String imagenPelicula) {

        this.imagenPelicula = imagenPelicula;
    }

    public String getNombrePelicula() {

        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getUrlPelicula() {

        return urlPelicula;
    }

    public void setUrlPelicula(String urlPelicula) {
        this.urlPelicula = urlPelicula;
    }

    public Pelicula(String imagenPelicula, String nombrePelicula, String urlPelicula) {
        this.imagenPelicula = imagenPelicula;
        this.nombrePelicula = nombrePelicula;
        this.urlPelicula = urlPelicula;


    }
}
