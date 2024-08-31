/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progra_ii_ii;

/**
 *
 * @author andre
 */
public class Masajista extends SeleccionFutbol implements Integrante {

    private String titulacion;
    private int aniosexperiencia;

    public Masajista( int id, String nombre, String apellido, int edad,String titulacion, int aniosexperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosexperiencia = aniosexperiencia;
    }

    

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosexperiencia() {
        return aniosexperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAniosexperiencia(int aniosexperiencia) {
        this.aniosexperiencia = aniosexperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajistase se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja");
    }

}
