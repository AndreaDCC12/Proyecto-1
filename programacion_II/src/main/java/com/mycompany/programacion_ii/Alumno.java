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
public class Alumno {

    private String dpi;
    private String apellido;
    private String nombre;
    private List<Examen> examenes;

    public Alumno(String dpi, String apellido, String nombre) {
        this.dpi = dpi;
        this.apellido = apellido;
        this.nombre = nombre;
        this.examenes = new ArrayList<>();
    }

    public String getDpi() {
        return dpi;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Examen> getExamenes() {
        return examenes;
    }

    public void aprobarExamen(Examen examen) {
        examenes.add(examen);
    }

    public boolean estaAprobado() {
        // Verificar si el alumno ha aprobado todos los exámenes
        for (Examen examen : examenes) {
            if (examen instanceof ExamenEscrito) {
                ExamenEscrito escrito = (ExamenEscrito) examen;
                if (escrito.getNota() < 6 || escrito.getDuracion() >= 90) {
                    return false;
                }
            } else if (examen instanceof ExamenOral) {
                ExamenOral oral = (ExamenOral) examen;
                if (!oral.getSatisfaccion().equals("suficiente")) {
                    return false;
                }
            }
        }
        return true;
    }

}
