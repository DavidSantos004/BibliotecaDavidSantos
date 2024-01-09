/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto2javadavidsantos;

/**
 *
 * @author user
 */
public class Revista extends Recurso{
    private int numero;
    private TiposDeRevistas tipoRevista;

    public Revista(int numero, TiposDeRevistas tipoRevista, int id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.numero = numero;
        this.tipoRevista = tipoRevista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TiposDeRevistas getTipoRevista() {
        return tipoRevista;
    }

    public void setTipoRevista(TiposDeRevistas tipoRevista) {
        this.tipoRevista = tipoRevista;
    }
    
}
