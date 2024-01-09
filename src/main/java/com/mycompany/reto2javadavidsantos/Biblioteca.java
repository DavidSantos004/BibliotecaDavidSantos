/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto2javadavidsantos;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author user
 */
public class Biblioteca implements Administracion{

    private Map<Integer, Recurso> inventario;
    private Set<String> categoriasDisponibles;
    
    public Biblioteca(){
        inventario = new HashMap<>();
        categoriasDisponibles = new HashSet<>();
        menu();
    }
    
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();
        System.out.println("Bienvenido a la biblioteca!!");
        System.out.println("Que necesita?");
        System.out.println("1. Libros y revistas disponibles");
        System.out.println("2. Añadir un libro o revista");
        System.out.println("3. Pedir un prestamo");
        System.out.println("4. Buscar libro o revista por su titulo"); 
        System.out.println(opcion);
        
        
    }
    
    @Override
    public void recursosDisponibles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void añadirRecurso(Recurso recurso) {
        if(!inventario.containsKey(recurso.getId())){
            
        }else{
            System.out.println("ya existe un producto con este id");
        }
    }

    @Override
    public void prestarRecurso(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscarRecursosPorTitulo(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void añadirRecurso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
