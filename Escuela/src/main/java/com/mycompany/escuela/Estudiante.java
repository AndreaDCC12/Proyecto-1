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

public class Estudiante {
    private String nombre;
    private List<Nota> notas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        double suma = 0;
        for (Nota nota : notas) {
            suma += nota.getPuntuacion();
        }
        return suma / notas.size();
    }

    public boolean esAprobado() {
        for (Nota nota : notas) {
            if (!nota.esAprobada()) {
                return false;
            }
        }
        return calcularPromedio() >= 60;
    }

    public String getNombre() {
        return nombre;
    }
}

