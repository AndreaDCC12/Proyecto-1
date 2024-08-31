/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tareaarreglos;

import java.io.IOException;
import java.util.Scanner;

public class Tareaarreglos {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        String placaa = "";
        char caracter = ' ';
        boolean placadevehiculos = false;
        int contador;

        System.out.println("Ingrese una placa");
        placaa = entrada.nextLine();
        contador = 0;

        if (placaa.length() == 7) {
            for (int i = 0; i < placaa.length(); i++) {
                switch (i) {
                    case 0 -> {
                        if ((placaa.toUpperCase().charAt(i) == 'P') || (placaa.toUpperCase().charAt(i) == 'C') || (placaa.toUpperCase().charAt(i) == 'M')) {
                            contador++;
                        }
                    }
                    case 1, 2, 3 -> {
                        switch (placaa.charAt(i)) {
                            case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' ->
                                contador++;
                        }
                    }
                    case 4, 5, 6 -> {
                        switch (placaa.toUpperCase().charAt(i)) {
                            case 'A', 'E', 'I', 'O', 'U', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' -> {
                            }
                            default ->
                                contador++;
                        }
                    }
                    default -> {
                    }
                }
            }
        } else {
            System.out.println("Placa no valida, longitud es menor a 7");
        }
        if (contador == 7) {
            System.out.println("" + placaa + " Placa valida");
        } else {
            System.out.println("Intente de nuevo, placa no es valida");
        }

    }

}
