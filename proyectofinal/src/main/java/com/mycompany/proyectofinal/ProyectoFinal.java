/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class ProyectoFinal {

    private static final String ARCHIVO_CLIENTES = "clientes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Clientes");
        System.out.println("--------------------");

        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Ingresar nuevo cliente");
            System.out.println("2. Modificar cliente existente");
            System.out.println("3. Eliminar cliente existente");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de ingresar la opción

            switch (opcion) {
                case 1:
                    ingresarCliente(scanner);
                    break;
                case 2:
                    modificarCliente(scanner);
                    break;
                case 3:
                    eliminarCliente(scanner);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void ingresarCliente(Scanner scanner) {
        System.out.println("Ingresar nuevo cliente");
        System.out.println("----------------------");

        // Capturar los datos del cliente
        int cuentaNum = 0;
        boolean cuiValid = false;
        String cui = "";

        do {
            System.out.println("Ingrese cui (13 dígitos): ");
            cui = scanner.nextLine();
            //Validando primer filtro largo 13
            if (cui.length() == 13) {

                //Validando segundo filtro solo numeros
                for (int indice = 0; indice < cui.length(); indice++) {
                    switch (cui.charAt(indice)) {
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
                            cuentaNum++;
                            break;
                    }
                }
                if (cuentaNum > 12) {
                    //Validando tercer filtro numero de depto y municipio correcto
                    char a = cui.charAt(9);
                    char b = cui.charAt(10);
                    char c = cui.charAt(11);
                    char d = cui.charAt(12);
                    String vDepto = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d);
                    if (Departamento.compare(vDepto)) {
                        cuiValid = true;
                    } else {
                        System.out.println("Cui no valido");
                        cuiValid = false;
                    }

                } else {
                    System.out.println("Cui no valido");
                    cuiValid = false;
                }
            } else {
                System.out.println("Cui no valido");
                cuiValid = false;
            }
        } while (cuiValid != true);

        System.out.print("NIT: ");
        String nit = scanner.nextLine();

        if (buscarCliente(cui, nit) != null) {
            System.out.println("El cliente ya existe en el registro.");

            return;
        }

        System.out.print("Dirección de residencia: ");
        String direccionResidencia = scanner.nextLine();

        System.out.print("Nombre de la entidad donde labora: ");
        String entidadLabora = scanner.nextLine();

        System.out.print("Dirección donde labora: ");
        String direccionLabora = scanner.nextLine();

        System.out.print("Fecha de nacimiento (dd/MM/yyyy): ");
        String fechaNacimiento = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Establecer el modo estricto para validar fechas
        try {
            dateFormat.parse(fechaNacimiento);
        } catch (ParseException e) {
            System.out.println("Fecha de nacimiento inválida. Formato esperado: dd/MM/yyyy");
            return;
        }

        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Número telefónico: ");
        String telefonos = scanner.nextLine();

        // Crear el registro del cliente como una cadena de texto
        String registroCliente
                = cui + ","
                + nit + ","
                + direccionResidencia + ","
                + entidadLabora + ","
                + direccionLabora + ","
                + fechaNacimiento + ","
                + nombres + ","
                + apellidos + ","
                + telefonos + ",1"; // El estado se establece como activo (1)

        // Guardar el registro en el archivo
        try {
            FileWriter fileWriter = new FileWriter(ARCHIVO_CLIENTES, true); // El segundo parámetro 'true' indica que se agregará al final del archivo
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(registroCliente);
            printWriter.close();
            System.out.println("El registro del cliente se ha guardado correctamente en 'clientes.txt'.");
        } catch (IOException e) {
            System.out.println("Error al guardar el registro del cliente: " + e.getMessage());
        }
    }


    private static Cliente buscarCliente(String cui, String nit) {
        List<Cliente> clientes = leerClientes();
        for (Cliente cliente : clientes) {
            if (cliente.getCui().equals(cui) || cliente.getNit().equals(nit)) {
                return cliente;
            }
        }
        return null;
    }

    private static class Cliente {

        private String cui;
        private String nit;
        private String direccionResidencia;
        private String entidadLabora;
        private String direccionLabora;
        private String fechaNacimiento;
        private String nombres;
        private String apellidos;
        private String telefonos;
        private int estado;

        public Cliente(String cui, String nit, String direccionResidencia, String entidadLabora, String direccionLabora,
                String fechaNacimiento, String nombres, String apellidos, String telefonos, int estado) {
            this.cui = cui;
            this.nit = nit;
            this.direccionResidencia = direccionResidencia;
            this.entidadLabora = entidadLabora;
            this.direccionLabora = direccionLabora;
            this.fechaNacimiento = fechaNacimiento;
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.telefonos = telefonos;
            this.estado = estado;
        }

        public String getCui() {
            return cui;
        }

        public String getNit() {
            return nit;
        }

        public String getDireccionResidencia() {
            return direccionResidencia;
        }

        public void setDireccionResidencia(String direccionResidencia) {
            this.direccionResidencia = direccionResidencia;
        }

        public String getEntidadLabora() {
            return entidadLabora;
        }

        public void setEntidadLabora(String entidadLabora) {
            this.entidadLabora = entidadLabora;
        }

        public String getDireccionLabora() {
            return direccionLabora;
        }

        public void setDireccionLabora(String direccionLabora) {
            this.direccionLabora = direccionLabora;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getTelefonos() {
            return telefonos;
        }

        public void setTelefonos(String telefonos) {
            this.telefonos = telefonos;
        }

        public int getEstado() {
            return estado;
        }

        public void setEstado(int estado) {
            this.estado = estado;
        }

        public String toString() {
            return cui + ","
                    + nit + ","
                    + direccionResidencia + ","
                    + entidadLabora + ","
                    + direccionLabora + ","
                    + fechaNacimiento + ","
                    + nombres + ","
                    + apellidos + ","
                    + telefonos + ","
                    + estado;
        }

        public String toStringArchivo() {
            return cui + ","
                    + nit + ","
                    + direccionResidencia + ","
                    + entidadLabora + ","
                    + direccionLabora + ","
                    + fechaNacimiento + ","
                    + nombres + ","
                    + apellidos + ","
                    + telefonos + ","
                    + estado;
        }
    }
}
