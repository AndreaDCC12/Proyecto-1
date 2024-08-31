/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Mavenproject1 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String cadena = "";
        char caracter = ' ';
        boolean placa = false;
        int contador;
        String seguir = "";
        do {
            System.out.println("Ingrese una placa");
            cadena = in.nextLine();
            contador = 0;

//        for (int i = 0; i < cadena.length(); i++) {
//            caracter = cadena.charAt(i);
//            System.out.println("El caracter en la posición [" + i + "] es " + caracter);
//        }
            if (cadena.length() == 7) {
                for (int i = 0; i < cadena.length(); i++) {
                    switch (i) {
                        case 0: {
                            if ((cadena.toUpperCase().charAt(i) == 'P') || (cadena.toUpperCase().charAt(i) == 'C') || (cadena.toUpperCase().charAt(i) == 'M')) {
                                contador++;
                            }
                        }
                        break;
                        case 1:
                        case 2:
                        case 3: {
                            switch (cadena.charAt(i)) {
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                case '0':
                                    contador++;
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                        case 4:
                        case 5:
                        case 6: {
                            switch (cadena.toUpperCase().charAt(i)) {
                                case 'A':
                                case 'E':
                                case 'I':
                                case 'O':
                                case 'U':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                case '0':
                                    break;
                                default:
                                    contador++;
                                    break;
                            }
                        }
                        break;
                        default:
                            break;
                    }
                }
            } else {
                System.out.println("La longitud de la placa debe ser igual a 7");
            }
            if (contador == 7) {
                System.out.println("La placa " + cadena + " es valida");
            } else {
                System.out.println("La placa " + cadena + " no es valida");
            }

            System.out.println("Ejecutar de nuevo?");
            System.out.println("S / N");
            seguir = in.nextLine();
        } while (seguir.equals("s") || seguir.equals("S"));

    }

}
