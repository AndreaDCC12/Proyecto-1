/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.programacion_ii;

import java.util.Scanner;

/**
 *
 * @author andre
 */

 public class Main {
    public static void main(String[] args) {
        CentroEducativo centro = new CentroEducativo();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Registrar datos de un alumno");
            System.out.println("2. Registrar datos de un examen para un alumno");
            System.out.println("3. Listar datos de los alumnos");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea después de leer un entero

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el DPI del alumno: ");
                    String dpi = scanner.nextLine();
                    System.out.print("Ingrese el apellido del alumno: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();

                    Alumno nuevoAlumno = new Alumno(dpi, apellido, nombre);
                    centro.registrarAlumno(nuevoAlumno);
                    System.out.println("Alumno registrado exitosamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el DPI del alumno: ");
                    String dpiExamen = scanner.nextLine();
                    
                    System.out.print("Seleccione el tipo de examen (1 para Escrito, 2 para Oral): ");
                    int tipoExamen = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea después de leer un entero

                    System.out.print("Ingrese la fecha del examen (formato dd/mm/yyyy): ");
                    String fechaExamen = scanner.nextLine();
                    
                    if (tipoExamen == 1) {
                        System.out.print("Ingrese la duración del examen en minutos: ");
                        int duracion = scanner.nextInt();
                        System.out.print("Ingrese la nota del examen (0-10): ");
                        double nota = scanner.nextDouble();
                        Examen examenEscrito = new ExamenEscrito(fechaExamen, duracion, nota);
                        centro.registrarExamen(dpiExamen, examenEscrito);
                    } else if (tipoExamen == 2) {
                        System.out.print("Ingrese el nivel de satisfacción (insuficiente/suficiente/excelente): ");
                        String satisfaccion = scanner.nextLine();
                        Examen examenOral = new ExamenOral(fechaExamen, satisfaccion);
                        centro.registrarExamen(dpiExamen, examenOral);
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;

                case 3:
                    System.out.println("Listado de alumnos:");
                    centro.listarAlumnos();
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
