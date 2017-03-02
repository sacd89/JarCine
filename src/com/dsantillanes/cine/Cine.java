package com.dsantillanes.cine;

import com.dsantillanes.cine.enums.Clasificacion;
import com.dsantillanes.cine.enums.Genero;
import java.util.ArrayList;

/**
 *
 * Modelo de un cine.
 * 
 * @author Daniela Santillanes Castro
 */
public class Cine {
    
    public ArrayList<Pelicula> addPelicula(String nombre, String directorPpal,
            String actores, Genero genero, String duracion, String foto, 
            String descripcion, Clasificacion clasificacion, ArrayList<Pelicula> peliculas){
        Pelicula pelicula = new Pelicula();
        pelicula.setNombre(nombre);
        pelicula.setDirectorPpal(directorPpal);
        pelicula.setActores(actores);
        pelicula.setGenero(genero);
        pelicula.setDuracion(duracion);
        pelicula.setFoto(foto);
        pelicula.setClasificacion(clasificacion);
        pelicula.setDescripcion(descripcion);
        peliculas.add(pelicula);
        return peliculas;
    }
    
    public ArrayList<Serie> addSerie(String nombre, String directorPpal,
            String actores, Genero genero, Integer temporadas, String foto, 
            String descripcion, Clasificacion clasificacion, ArrayList<Serie> series){
        Serie serie = new Serie();
        serie.setNombre(nombre);
        serie.setDirectorPpal(directorPpal);
        serie.setActores(actores);
        serie.setGenero(genero);
        serie.setTemporadas(temporadas);
        serie.setFoto(foto);
        serie.setClasificacion(clasificacion);
        serie.setDescripcion(descripcion);
        series.add(serie);
        return series;
    }
    
    public ArrayList<Pelicula> deletePelicula(String nombre, ArrayList<Pelicula> peliculas){

        for(Pelicula pelicula : peliculas){
            if(pelicula.getNombre().equals(nombre)){
                peliculas.remove(pelicula);
            }
        }
        return peliculas;
    }
    
    public ArrayList<Serie> deleteSerie(String nombre, ArrayList<Serie> series){

        for(Serie serie : series){
            if(serie.getNombre().equals(nombre)){
                series.remove(serie);
            }
        }
        return series;
    }
    
}
