/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto2javadavidsantos;

/**
 *
 * @author user
 */
public enum TiposDeRevistas {
    INFORMATIVA("Informativa", "esta revista es informativa"), 
    ESPECIALIZADA("Especializada", "esta revista es especializada"),
    OCIO("Ocio","esta revista es para el ocio"),
    INFANTIL("Infantil","esta revista es infantil"),
    EDUCATIVA("Educativa","esta revista es educativa");
    
    private String nombre;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private TiposDeRevistas(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
