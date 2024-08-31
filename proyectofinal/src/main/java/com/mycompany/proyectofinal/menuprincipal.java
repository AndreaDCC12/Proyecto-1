/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class menuprincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Menu principal");
        System.out.println("Seleccione opciones");
        System.out.println("1. Registro de clientes");
        System.out.println("2. Registro de parqueos");
        int op=entrada.nextInt();
        switch(op){
            case 1:
                
                break;
            case 2:
                break;
        }
    }
    
}
