/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escuela;

/**
 *
 * @author andre
 */
import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private String nombre;
    private List<Grado> grados;

    public Escuela(String nombre) {
        this.nombre = nombre;
        this.grados = new ArrayList<>();
    }

    public void agregarGrado(Grado grado) {
        grados.add(grado);
    }

    public Grado obtenerGrado(String nombre) {
        for (Grado grado : grados) {
            if (grado.getNombre().equals(nombre)) {
                return grado;
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }
}

