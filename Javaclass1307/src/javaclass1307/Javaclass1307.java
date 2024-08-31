package javaclass1307;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Javaclass1307 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numerosprimos = new ArrayList<>();
        int suma = 0;

        System.out.println("Ingrese numeros (ingrese 'N' para terminar): ");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("n")) {
                break;
            } else {
            }
            try {
                int num = Integer.parseInt(input);
                if (num < 0) {
                    System.out.println("Ingrese un numero positivo o 'N' para terminar.");
                   
                }
                if (esPrimo(num)) {
                    numerosprimos.add(num);
                    suma += num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Por favor ingrese un número o 'N' para terminar.");
            }
        }

        scanner.close();

        System.out.println("Numeros primos ingresados: " + numerosprimos);
        System.out.println("Suma de los números primos: " + suma);
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
