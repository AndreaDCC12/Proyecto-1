/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion_ii;

/**
 *
 * @author andre
 */
class ExamenOral implements Examen {
    private String fecha;
    private String satisfaccion;

    public ExamenOral(String fecha, String satisfaccion) {
        this.fecha = fecha;
        this.satisfaccion = satisfaccion;
    }

    @Override
    public String getFecha() {
        return fecha;
    }

    public String getSatisfaccion() {
        return satisfaccion;
    }

}