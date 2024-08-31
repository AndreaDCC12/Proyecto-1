/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.arreglosbidimensionales;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Arreglosbidimensionales {

    public class Matrix {

        private final int[][] data;
        private final int size;

        public Matrix(int size) {
            this.size = size;
            data = new int[size][size];
        }

        public void fillMatrix(Scanner scanner) {
            System.out.println("Ingrese los elementos de la matriz:");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                    data[i][j] = scanner.nextInt();
                }
            }
        }

        public Matrix add(Matrix other) {
            Matrix result = new Matrix(size);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    result.data[i][j] = this.data[i][j] + other.data[i][j];
                }
            }
            return result;
        }

        public Matrix subtract(Matrix other) {
            Matrix result = new Matrix(size);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    result.data[i][j] = this.data[i][j] - other.data[i][j];
                }
            }
            return result;
        }

        public Matrix multiply(Matrix other) {
            Matrix result = new Matrix(size);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    for (int k = 0; k < size; k++) {
                        result.data[i][j] += this.data[i][k] * other.data[k][j];
                    }
                }
            }
            return result;
        }

        public void printMatrix() {
            System.out.println("Matriz resultante:");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(data[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el tamaño de las matrices: ");
            int size = scanner.nextInt();

            Matrix matrix1 = new Matrix(size);
            matrix1.fillMatrix(scanner);

            Matrix matrix2 = new Matrix(size);
            matrix2.fillMatrix(scanner);

            Matrix sum = matrix1.add(matrix2);
            System.out.println("Suma:");
            sum.printMatrix();

            Matrix difference = matrix1.subtract(matrix2);
            System.out.println("Resta:");
            difference.printMatrix();

            Matrix product = matrix1.multiply(matrix2);
            System.out.println("Multiplicación:");
            product.printMatrix();

            scanner.close();
        }
    }
