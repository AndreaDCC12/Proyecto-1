/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progra_ii_ii;

/**
 *
 * @author andre
 */
public class Entrenador extends SeleccionFutbol implements Integrante, Deportista {

    private String IdFederacion;

    public Entrenador( int id, String nombre, String apellido, int edad, String IdFederacion) {
        super(id, nombre, apellido, edad);
        this.IdFederacion = IdFederacion;
    }

    public String getIdFederacion() {
        return IdFederacion;
    }

    public void setIdFederacion(String IdFederacion) {
        this.IdFederacion = IdFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concentra");

    }

    @Override
    public void viajar() {
        System.out.println("El entrenador viaja");

    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador entrena");

    }

    @Override
    public void jugarpartido() {
        System.out.println("El entrenador juegaun partido");

    }

}
