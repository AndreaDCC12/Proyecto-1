/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion_ii;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class CentroEducativo {
    private final List<Alumno> alumnos;

    public CentroEducativo() {
        this.alumnos = new ArrayList<>();
    }

    public void registrarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void registrarExamen(String dpi, Examen examen) {
        // Buscar al alumno por DPI y registrar el examen
        for (Alumno alumno : alumnos) {
            if (alumno.getDpi().equals(dpi)) {
                alumno.aprobarExamen(examen);
                break;
            }
        }
    }

    public void listarAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println("DPI: " + alumno.getDpi());
            System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getApellido());
            System.out.println("Aprobado: " + (alumno.estaAprobado() ? "Sí" : "No"));
            System.out.println();
        }
    }

    public void listarAprobados() {
        for (Alumno alumno : alumnos) {
            if (alumno.estaAprobado()) {
                System.out.println("DPI: " + alumno.getDpi());
                System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getApellido());
                System.out.println();
            }
        }
    }

    public int cantAprobados() {
        int count = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.estaAprobado()) {
                count++;
            }
        }
        return count;
    }
}
