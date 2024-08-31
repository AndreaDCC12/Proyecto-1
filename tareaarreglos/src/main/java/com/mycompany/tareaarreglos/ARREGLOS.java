
package com.mycompany.tareaarreglos;

import java.util.Scanner;

public class ARREGLOS {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
                Scanner entrada = new Scanner(System.in);
        int n, i, buscar;

        int[] arreglo = new int[11];
        int suma = 0;
        int producto = 1;
        int maximo = 0;
        int minimo = 0;

        System.out.println("Ingrese la cantidad del Arreglo: ");
        n = entrada.nextInt();

        for (i = 0; i < n; i++) {
            System.out.println("Ingrese el numero del arreglo en la posición: " + (i+1) + ": ");
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
            System.out.println("numero: arreglo[" + i + "]=" + arreglo[i]);

        }

        boolean numeroEncontrado = false;
        System.out.println("Ingrese el numero a buscar");
        buscar = entrada.nextInt();
        for (i = 0; i < n; i++) {
            if (arreglo[i] == buscar) {
                System.out.println("El numero: " + buscar + " que busca, se encuentra en la posicion del arreglo[" + i + "]" + arreglo[i]);
                numeroEncontrado = true;

            }

        }//fin del for buscar

        if (!numeroEncontrado) {
            System.out.println("No se encontró el numero que buscaba");
        }

        System.out.println("la suma de los elementos del arreglo es: " + suma);
        System.out.println("la multiplicacion de los elementos del arreglo es: " + producto);
        System.out.println("el maximo numero  de los elementos del arreglo es: " + maximo);
        System.out.println("el minimo numero  de los elementos del arreglo es: " + minimo);

    }
    }
    

