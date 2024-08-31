/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuela;

/**
 *
 * @author andre
 */
public class Nota {
    private int bimestre;
    private double puntuacion;

    public Nota(int bimestre, double puntuacion) {
        this.bimestre = bimestre;
        this.puntuacion = puntuacion;
    }

    public boolean esAprobada() {
        return puntuacion >= 60;
    }

    public double getPuntuacion() {
        return puntuacion;
    }
}

