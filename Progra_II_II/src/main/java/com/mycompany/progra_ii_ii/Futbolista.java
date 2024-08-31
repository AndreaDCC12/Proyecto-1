/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progra_ii_ii;

/**
 *
 * @author andre
 */
public class Futbolista extends SeleccionFutbol implements Deportista, Integrante {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista se concentra");

    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista entrena");
    }

    @Override
    public void jugarpartido() {

        System.out.println("El futbolista juega un partido");
    }

}
