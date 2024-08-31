/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.arreglos_tarea;

import java.util.Scanner;

public class Arreglos_tarea {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n, i, buscar;

        int[] arreglo = new int[11];
        int suma = 0;
        int producto = 1;
        int maximo = 0;
        int minimo = 0;

        System.out.println("Ingrese numero entre 1 y 30 ");
        n = entrada.nextInt();
        if (n <= 30) {
            for (i = 0; i < n; i++) {
                System.out.println("Ingrese el numero del arreglo en la posicion " + (i + 1) + ": ");
                arreglo[i] = entrada.nextInt();
                //variable que acumula la sumatoria de cada elemento ingresado en el arreglo
                suma = suma + arreglo[i];
                //variable que almacena el producto del elemento ingresado en el elemento contra 
                //los anteriores
                producto = producto + arreglo[i];
                //determinar el maximo
                if (arreglo[i] > maximo) {
                    maximo = arreglo[i];

                }
                //determinar el minimo
                if (arreglo[i] < minimo) {

                    minimo = arreglo[i];
                }
            }

            //mostrar informacion del arreglo 
            for (i = 0; i < n; i++) {
                System.out.println("Arreglo posicion[" + i + "]=" + arreglo[i]);

            }

            boolean numeroEncontrado = false;
            System.out.println("Ingrese el numero a buscar");
            buscar = entrada.nextInt();
            for (i = 0; i < n; i++) {
                if (arreglo[i] == buscar) {
                    System.out.println("El numero " + buscar + " se encuentra en la posicion del arreglo[" + i + "]:" + arreglo[i]);
                    numeroEncontrado = true;

                }

            }//fin del for buscar

            if (!numeroEncontrado) {
                System.out.println("No se encontró el numero que buscaba");
            }
            System.out.println(" ");

            System.out.println("la suma de los elementos del arreglo es: " + suma);
            System.out.println("la multiplicacion de los elementos del arreglo es: " + producto);
            System.out.println("el maximo numero  de los elementos del arreglo es: " + maximo);
            System.out.println("el minimo numero  de los elementos del arreglo es: " + minimo);

        } else {
            System.out.println("Cantidad excede 30");

        }
    }

}
