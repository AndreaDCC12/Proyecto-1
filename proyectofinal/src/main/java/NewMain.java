
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author andre
 */
public class NewMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

        //se crea objeto cuenta1 sin parámetros
        //se ejecuta el constructor por defecto
        Cuenta cuenta1 = new Cuenta();

        System.out.println("METODO DE PAGO");
        System.out.println("1. Deposito");
        System.out.println("2. Tarjeta de Credito");
        System.out.println("3. Tranferencia bancaria");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println(" ");
                System.out.println("Nombre : ");
                nombre = sc.nextLine();
                System.out.println("Número de cuenta : ");
                numero = sc.nextLine();
                System.out.println("Placa");
                tipo = sc.nextDouble();
                System.out.println("Saldo a pagar: ");
                importe = sc.nextDouble();
                cuenta1.setNombre(nombre);
                cuenta1.setNumeroCuenta(numero);
                cuenta1.setNumPlaca(tipo);
                cuenta1.setSaldo(importe);

        }
    }
    
}

