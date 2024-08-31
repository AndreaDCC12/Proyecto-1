/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion_ii;

/**
 *
 * @author andre
 */
public class ExamenEscrito implements Examen {
    private String fecha;
    private int duracion;
    private double nota;

    public ExamenEscrito(String fecha, int duracion, double nota) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.nota = nota;
    }

    @Override
    public String getFecha() {
        return fecha;
    }

    public double getNota() {
        return nota;
    }

    public int getDuracion() {
        return duracion;
    }
}


