/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuela;

/**
 *
 * @author andre
 */
import java.util.ArrayList;
import java.util.List;

public class Grado {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Grado(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public Estudiante obtenerEstudiante(String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombre)) {
                return estudiante;
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }
}
