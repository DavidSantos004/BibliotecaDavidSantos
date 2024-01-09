/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.reto2javadavidsantos;

/**
 *
 * @author user
 */
public interface Administracion {
   
    public abstract void recursosDisponibles();
    
    public abstract void añadirRecurso();

    public abstract void prestarRecurso(int id);
    
    public abstract void buscarRecursosPorTitulo(String titulo);
}
