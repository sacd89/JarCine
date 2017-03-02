/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsantillanes.cine;

import com.dsantillanes.cine.enums.Clasificacion;
import com.dsantillanes.cine.enums.Genero;
import java.util.ArrayList;

/**
 *
 * @author dsantillanes
 */
public class Serie {
    
    private String nombre;
    private String directorPpal;
    private String actores;
    private Genero genero;
    private String foto;
    private Clasificacion clasificacion;
    private String descripcion;
    private Integer temporadas;

    public Serie() {
    }

    public Serie(String nombre, String directorPpal, String actores, Genero genero, String foto, Clasificacion clasificacion, String descripcion, Integer temporadas) {
        this.nombre = nombre;
        this.directorPpal = directorPpal;
        this.actores = actores;
        this.genero = genero;
        this.foto = foto;
        this.clasificacion = clasificacion;
        this.descripcion = descripcion;
        this.temporadas = temporadas;
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
     * @return the temporadas
     */
    public Integer getTemporadas() {
        return temporadas;
    }

    /**
     * @param temporadas the temporadas to set
     */
    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }
  
}
