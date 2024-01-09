/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto2javadavidsantos;

/**
 *
 * @author user
 */
public class Libro extends Recurso{
    private String autor;

    public Libro(String autor, int id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
