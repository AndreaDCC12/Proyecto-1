/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arreglos_tarea;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class placas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese texto");
        String placa=entrada.nextLine();
        
    }
     public static boolean validaPlaca(String placa) {
         return placa.matches("^[0-9](4)[A-Z](3)$");
     }
}

