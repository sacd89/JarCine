
package com.dsantillanes.cine;

import com.dsantillanes.cine.enums.Clasificacion;
import com.dsantillanes.cine.enums.Genero;
import java.util.ArrayList;

/**
 * Modelo de una pelicula.
 * 
 * @author Daniela Santillanes Castro
 */
public class Pelicula {
    
    private String nombre;
    private String directorPpal;
    private String actores;
    private Genero genero;
    private String duracion;
    private String foto;
    private Clasificacion clasificacion;
    private String descripcion;
    private Double calificacion;

    public Pelicula() {
    }

    public Pelicula(String nombre, String directorPpal, String actores, Genero genero, String duracion, String foto, Clasificacion clasificacion, String descripcion, Double calificacion) {
        this.nombre = nombre;
        this.directorPpal = directorPpal;
        this.actores = actores;
        this.genero = genero;
        this.duracion = duracion;
        this.foto = foto;
        this.clasificacion = clasificacion;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }




    
        /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the directorPpal
     */
    public String getDirectorPpal() {
        return directorPpal;
    }

    /**
     * @param directorPpal the directorPpal to set
     */
    public void setDirectorPpal(String directorPpal) {
        this.directorPpal = directorPpal;
    }

    /**
     * @return the actores
     */
    public String getActores() {
        return actores;
    }

    /**
     * @param actores the actores to set
     */
    public void setActores(String actores) {
        this.actores = actores;
    }
    
    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
        /**
     * @return the duracion
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
        /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
        /**
     * @return the clasificacion
     */
    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * @return the calificacion
     */
    public Double getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
}
